package me.zhengjie.modules.yueba.mapper;


import me.zhengjie.modules.yueba.domain.SystemNotice;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface SystemNoticeMapper {

    int deleteByPrimaryKey(Long id);

    int insert(SystemNotice record);

    int insertSelective(SystemNotice record);

    SystemNotice selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SystemNotice record);

    int updateByPrimaryKey(SystemNotice record);
}