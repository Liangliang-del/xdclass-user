package com.chl.userapp.service.dubbo;

import com.chl.userapp.domain.TUser;

/**
 * @author admin
 */
public interface UserService {

    /**
     * 根据ID查询用户信息
     * @param id
     * @return
     */
    public TUser getUserById(Integer id);
}
