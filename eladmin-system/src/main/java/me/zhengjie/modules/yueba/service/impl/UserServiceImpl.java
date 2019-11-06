package me.zhengjie.modules.yueba.service.impl;

import me.zhengjie.modules.yueba.domain.User;
import me.zhengjie.modules.yueba.mapper.UserMapper;
import me.zhengjie.modules.yueba.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author Zheng Jie
 * @date 2018-11-23
 */
@Service("userService")
@CacheConfig(cacheNames = "yueba")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(Long id) {
        User yueba = userMapper.selectByPrimaryKey(1l);
        return yueba;
    }

}
