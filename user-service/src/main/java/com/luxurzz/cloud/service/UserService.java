package com.luxurzz.cloud.service;

import com.luxurzz.cloud.entity.User;

import java.util.List;

/**
 * @author yhaitao
 */
public interface UserService {

    /**
     * 创建用户
     * @param user
     */
    void create(User user);

    /**
     * 获取用户
     * @param id
     * @return
     */
    User getUser(Long id);

    /**
     * 获取用户
     * @param ids
     * @return
     */
    List<User> getUserByIds(List<Long> ids);

    /**
     * 获取用户
     * @param username
     * @return
     */
    User getByUsername(String username);

    /**
     * 更新用户
     * @param user
     */
    void update(User user);

    /**
     * 删除用户
     * @param id
     */
    void delete(Long id);
}
