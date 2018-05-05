package com.graduate.project.service.impl;

import com.graduate.project.entity.UserTest;
import com.graduate.project.mapper.UserTestMappper;
import com.graduate.project.service.backAdminService;


import javax.annotation.Resource;

public class backAdminServiceImpl implements backAdminService {
    @Resource
    UserTestMappper userTestMappper;

    //通过管理员Id查询管理员信息
    @Override
    public UserTest findAdminInfoById(int adminId)  {
        // TODO Auto-generated method stub
        return userTestMappper.findAdminInfoById(adminId);
    }
}
