package me.zhengjie.modules.yueba.service;

import me.zhengjie.modules.yueba.domain.Yueba;

/**
 * @author Zheng Jie
 * @date 2018-11-23
 */
public interface YuebaService {
    /**
     * 根据ID查询
     * @param id ID
     * @return YuebaDTO
     */
    Yueba findById(Long id);
}
