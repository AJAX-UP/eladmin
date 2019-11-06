package me.zhengjie.modules.yueba.mapper;

import me.zhengjie.modules.yueba.domain.VisitorRecord;

public interface VisitorRecordMapper {

    int deleteByPrimaryKey(Long id);

    int insert(VisitorRecord record);

    int insertSelective(VisitorRecord record);

    VisitorRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(VisitorRecord record);

    int updateByPrimaryKey(VisitorRecord record);
}