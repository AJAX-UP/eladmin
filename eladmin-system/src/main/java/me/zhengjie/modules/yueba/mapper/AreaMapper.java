package me.zhengjie.modules.yueba.mapper;


import me.zhengjie.modules.yueba.domain.Area;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AreaMapper {

    int deleteByPrimaryKey(Integer areaId);

    int insert(Area record);

    int insertSelective(Area record);

    Area selectByPrimaryKey(Integer areaId);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);
}