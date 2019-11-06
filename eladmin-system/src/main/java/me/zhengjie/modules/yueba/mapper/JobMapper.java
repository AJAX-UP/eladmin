package me.zhengjie.modules.yueba.mapper;

import me.zhengjie.modules.yueba.domain.Job;

public interface JobMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Job record);

    int insertSelective(Job record);

    Job selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Job record);

    int updateByPrimaryKey(Job record);
}