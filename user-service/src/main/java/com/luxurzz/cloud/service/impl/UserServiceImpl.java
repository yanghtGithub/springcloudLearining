package com.luxurzz.cloud.service.impl;

import com.luxurzz.cloud.entity.User;
import com.luxurzz.cloud.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yhaitao
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {


    @Override
    public void create(User user) {

    }

    @Override
    public User getUser(Long id) {
        return null;
    }

    @Override
    public List<User> getUserByIds(List<Long> ids) {
        return null;
    }

    @Override
    public User getByUsername(String username) {
        return null;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(Long id) {

    }
}
