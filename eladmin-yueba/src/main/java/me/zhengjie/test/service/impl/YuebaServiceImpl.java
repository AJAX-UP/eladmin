package me.zhengjie.test.service.impl;

import me.zhengjie.test.domain.Yueba;
import me.zhengjie.utils.ValidationUtil;
import me.zhengjie.utils.FileUtil;
import me.zhengjie.test.repository.YuebaRepository;
import me.zhengjie.test.service.YuebaService;
import me.zhengjie.test.service.dto.YuebaDTO;
import me.zhengjie.test.service.dto.YuebaQueryCriteria;
import me.zhengjie.test.service.mapper.YuebaMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import me.zhengjie.utils.PageUtil;
import me.zhengjie.utils.QueryHelp;
import java.util.List;
import java.util.Map;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
* @author cgj
* @date 2019-11-05
*/
@Service
@CacheConfig(cacheNames = "yueba")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class YuebaServiceImpl implements YuebaService {

    private final YuebaRepository yuebaRepository;

    private final YuebaMapper yuebaMapper;

    public YuebaServiceImpl(YuebaRepository yuebaRepository, YuebaMapper yuebaMapper) {
        this.yuebaRepository = yuebaRepository;
        this.yuebaMapper = yuebaMapper;
    }

    @Override
    @Cacheable
    public Map<String,Object> queryAll(YuebaQueryCriteria criteria, Pageable pageable){
        Page<Yueba> page = yuebaRepository.findAll((root, criteriaQuery, criteriaBuilder) -> QueryHelp.getPredicate(root,criteria,criteriaBuilder),pageable);
        return PageUtil.toPage(page.map(yuebaMapper::toDto));
    }

    @Override
    @Cacheable
    public List<YuebaDTO> queryAll(YuebaQueryCriteria criteria){
        return yuebaMapper.toDto(yuebaRepository.findAll((root, criteriaQuery, criteriaBuilder) -> QueryHelp.getPredicate(root,criteria,criteriaBuilder)));
    }

    @Override
    @Cacheable(key = "#p0")
    public YuebaDTO findById(Long id) {
        Yueba yueba = yuebaRepository.findById(id).orElseGet(Yueba::new);
        ValidationUtil.isNull(yueba.getId(),"Yueba","id",id);
        return yuebaMapper.toDto(yueba);
    }

    @Override
    @CacheEvict(allEntries = true)
    @Transactional(rollbackFor = Exception.class)
    public YuebaDTO create(Yueba resources) {
        Snowflake snowflake = IdUtil.createSnowflake(1, 1);
        resources.setId(snowflake.nextId()); 
        return yuebaMapper.toDto(yuebaRepository.save(resources));
    }

    @Override
    @CacheEvict(allEntries = true)
    @Transactional(rollbackFor = Exception.class)
    public void update(Yueba resources) {
        Yueba yueba = yuebaRepository.findById(resources.getId()).orElseGet(Yueba::new);
        ValidationUtil.isNull( yueba.getId(),"Yueba","id",resources.getId());
        yueba.copy(resources);
        yuebaRepository.save(yueba);
    }

    @Override
    @CacheEvict(allEntries = true)
    @Transactional(rollbackFor = Exception.class)
    public void delete(Long id) {
        yuebaRepository.deleteById(id);
    }


    @Override
    public void download(List<YuebaDTO> all, HttpServletResponse response) throws IOException {
        List<Map<String, Object>> list = new ArrayList<>();
        for (YuebaDTO yueba : all) {
            Map<String,Object> map = new LinkedHashMap<>();
            map.put(" name",  yueba.getName());
            map.put(" enabled",  yueba.getEnabled());
            map.put(" sort",  yueba.getSort());
            map.put(" deptId",  yueba.getDeptId());
            map.put(" createTime",  yueba.getCreateTime());
            list.add(map);
        }
        FileUtil.downloadExcel(list, response);
    }
}