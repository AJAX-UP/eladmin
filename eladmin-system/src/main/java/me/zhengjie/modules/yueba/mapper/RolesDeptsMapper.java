package me.zhengjie.modules.yueba.mapper;
import me.zhengjie.modules.yueba.domain.RolesDeptsKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RolesDeptsMapper {


    int insert(RolesDeptsKey record);

    int insertSelective(RolesDeptsKey record);

   }