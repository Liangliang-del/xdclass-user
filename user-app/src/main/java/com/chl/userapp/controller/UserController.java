package com.chl.userapp.controller;

import com.chl.userserviceapi.model.TUserModel;
import com.chl.userserviceapi.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author admin
 */
@RestController
public class UserController {

    @Resource
    IUserService iUserService;

    @RequestMapping("/getUserById")
    public TUserModel getUserById(){
        return iUserService.getUserById(5);
    }
}
