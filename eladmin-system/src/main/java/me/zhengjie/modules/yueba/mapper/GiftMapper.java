package me.zhengjie.modules.yueba.mapper;

import me.zhengjie.modules.yueba.domain.Gift;

public interface GiftMapper {


    int deleteByPrimaryKey(Long id);

    int insert(Gift record);

    int insertSelective(Gift record);

    Gift selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Gift record);

    int updateByPrimaryKey(Gift record);
}