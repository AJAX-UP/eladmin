package me.zhengjie.modules.yueba.service.impl;

import me.zhengjie.modules.yueba.domain.Yueba;
import me.zhengjie.modules.yueba.mapper.YuebaDao;
import me.zhengjie.modules.yueba.service.YuebaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author Zheng Jie
 * @date 2018-11-23
 */
@Service("yuebaService")
@CacheConfig(cacheNames = "yueba")
public class YuebaServiceImpl implements YuebaService {
    @Autowired
    private YuebaDao yuebaDao;

    @Override
    @Cacheable(key = "#p0")
    public Yueba findById(Long id) {
        Yueba yueba = yuebaDao.findById(id);
        return yueba;
    }

}
