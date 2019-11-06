package me.zhengjie.modules.yueba.mapper;

import me.zhengjie.modules.yueba.domain.Message;

public interface MessageMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Message record);

    int insertSelective(Message record);


    Message selectByPrimaryKey(Long id);


    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);
}