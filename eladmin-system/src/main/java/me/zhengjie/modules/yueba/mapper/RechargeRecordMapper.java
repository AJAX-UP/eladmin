package me.zhengjie.modules.yueba.mapper;

import me.zhengjie.modules.yueba.domain.RechargeRecord;

public interface RechargeRecordMapper {

    int deleteByPrimaryKey(Long id);

    int insert(RechargeRecord record);

    int insertSelective(RechargeRecord record);

    RechargeRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RechargeRecord record);

    int updateByPrimaryKey(RechargeRecord record);
}