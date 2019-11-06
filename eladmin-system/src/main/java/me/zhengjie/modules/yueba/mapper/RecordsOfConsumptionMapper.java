package me.zhengjie.modules.yueba.mapper;

import me.zhengjie.modules.yueba.domain.RecordsOfConsumption;

public interface RecordsOfConsumptionMapper {

    int insert(RecordsOfConsumption record);

    int insertSelective(RecordsOfConsumption record);
}