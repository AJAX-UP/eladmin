package me.zhengjie.modules.yueba.mapper;

import me.zhengjie.modules.yueba.domain.LoginRecord;

public interface LoginRecordMapper {

    int deleteByPrimaryKey(Long id);

    int insert(LoginRecord record);

    int insertSelective(LoginRecord record);


    LoginRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LoginRecord record);

    int updateByPrimaryKey(LoginRecord record);
}