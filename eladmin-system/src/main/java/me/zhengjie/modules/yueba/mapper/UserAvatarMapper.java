package me.zhengjie.modules.yueba.mapper;

import me.zhengjie.modules.yueba.domain.UserAvatar;

public interface UserAvatarMapper {


    int deleteByPrimaryKey(Long id);

    int insert(UserAvatar record);
    int insertSelective(UserAvatar record);

    UserAvatar selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserAvatar record);

    int updateByPrimaryKey(UserAvatar record);
}