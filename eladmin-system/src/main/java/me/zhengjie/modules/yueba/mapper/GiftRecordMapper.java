package me.zhengjie.modules.yueba.mapper;

import me.zhengjie.modules.yueba.domain.GiftRecord;

public interface GiftRecordMapper {


    int deleteByPrimaryKey(Long id);

    int insert(GiftRecord record);

    int insertSelective(GiftRecord record);

    GiftRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GiftRecord record);

    int updateByPrimaryKey(GiftRecord record);
}