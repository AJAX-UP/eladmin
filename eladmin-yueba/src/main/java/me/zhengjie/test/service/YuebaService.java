package me.zhengjie.test.service;

import me.zhengjie.test.domain.Yueba;
import me.zhengjie.test.service.dto.YuebaDTO;
import me.zhengjie.test.service.dto.YuebaQueryCriteria;
import org.springframework.data.domain.Pageable;
import java.util.Map;
import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

/**
* @author cgj
* @date 2019-11-05
*/
public interface YuebaService {

    /**
    * 查询数据分页
    * @param criteria 条件参数
    * @param pageable 分页参数
    * @return Map<String,Object>
    */
    Map<String,Object> queryAll(YuebaQueryCriteria criteria, Pageable pageable);

    /**
    * 查询所有数据不分页
    * @param criteria 条件参数
    * @return List<YuebaDTO>
    */
    List<YuebaDTO> queryAll(YuebaQueryCriteria criteria);

    /**
     * 根据ID查询
     * @param id ID
     * @return YuebaDTO
     */
    YuebaDTO findById(Long id);

    YuebaDTO create(Yueba resources);

    void update(Yueba resources);

    void delete(Long id);

    void download(List<YuebaDTO> all, HttpServletResponse response) throws IOException;
}