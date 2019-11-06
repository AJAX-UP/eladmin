package me.zhengjie.modules.yueba.mapper;

import me.zhengjie.modules.yueba.domain.RolesMenusKey;

public interface RolesMenusMapper {


    int deleteByPrimaryKey(RolesMenusKey key);

    int insert(RolesMenusKey record);

    int insertSelective(RolesMenusKey record);

}