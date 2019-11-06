package me.zhengjie.modules.yueba.mapper;

import me.zhengjie.modules.yueba.domain.Dept;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeptMapper {


    int deleteByPrimaryKey(Long id);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
}