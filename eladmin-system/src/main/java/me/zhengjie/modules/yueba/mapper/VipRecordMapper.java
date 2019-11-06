package me.zhengjie.modules.yueba.mapper;

import me.zhengjie.modules.yueba.domain.VipRecord;

public interface VipRecordMapper {

    int deleteByPrimaryKey(Long id);

    int insert(VipRecord record);

    int insertSelective(VipRecord record);

    VipRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(VipRecord record);

    int updateByPrimaryKey(VipRecord record);
}