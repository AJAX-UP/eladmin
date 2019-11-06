package me.zhengjie.modules.yueba.service;

import me.zhengjie.modules.yueba.domain.User;

/**
 * @author Zheng Jie
 * @date 2018-11-23
 */
public interface UserService {
    /**
     * 根据ID查询
     * @param id ID
     * @return YuebaDTO
     */
    User findById(Long id);
}
