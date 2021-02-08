package com.chl.userapp.service.dubbo;

import com.chl.userapp.domain.TUser;
import com.chl.userapp.mapper.TUserMapper;
import com.chl.userserviceapi.model.TUserModel;
import com.chl.userserviceapi.service.IUserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.BeanUtils;

import javax.annotation.Resource;

/**
 * @author admin
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private TUserMapper tUserMapper;

    @Override
    public TUserModel getUserById(Integer id) {
        TUser tUser = tUserMapper.selectByPrimaryKey(id);
        TUserModel tUserModel = new TUserModel();
        BeanUtils.copyProperties(tUser, tUserModel);
        return tUserModel;
    }
}
