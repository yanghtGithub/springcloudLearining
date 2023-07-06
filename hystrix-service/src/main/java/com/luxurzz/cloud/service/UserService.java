package com.luxurzz.cloud.service;

import com.luxurzz.cloud.constants.CommonResult;
import com.luxurzz.cloud.entity.User;

import java.util.List;

/**
 * @author yhaitao
 */
public interface UserService {

    /**
     * 获取用户
     * @param id
     * @return
     */
    CommonResult getUser(Long id);
}
