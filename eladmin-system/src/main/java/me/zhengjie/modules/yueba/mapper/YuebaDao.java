package me.zhengjie.modules.yueba.mapper;

import io.lettuce.core.dynamic.annotation.Param;
import me.zhengjie.modules.yueba.domain.Yueba;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Zheng Jie
 * @date 2018-11-22
 */
@Mapper
public interface YuebaDao {
    Yueba findById(@Param(value = "id") Long id);
}
