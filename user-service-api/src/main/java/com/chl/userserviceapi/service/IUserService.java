package com.chl.userserviceapi.service;


import com.chl.userserviceapi.model.TUserModel;

/**
 * @author admin
 */
public interface IUserService {

    /**
     * 根据ID查询用户信息
     * @param id
     * @return
     */
    public TUserModel getUserById(Integer id);
}
