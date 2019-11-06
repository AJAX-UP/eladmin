package me.zhengjie.modules.yueba.mapper;


import me.zhengjie.modules.yueba.domain.AttentionRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AttentionRecordMapper {

    int deleteByPrimaryKey(Long id);

    int insert(AttentionRecord record);

    int insertSelective(AttentionRecord record);


    AttentionRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AttentionRecord record);

    int updateByPrimaryKey(AttentionRecord record);
}