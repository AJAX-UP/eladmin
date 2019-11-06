package me.zhengjie.modules.yueba.mapper;

import me.zhengjie.modules.yueba.domain.UsersRolesKey;

public interface UsersRolesMapper {

    int deleteByPrimaryKey(UsersRolesKey key);

    int insert(UsersRolesKey record);

    int insertSelective(UsersRolesKey record);

   }