package com.graduate.project.mapper;

import com.graduate.project.entity.UserTest;

public interface UserTestMappper {

    //UserTest selectByPrimaryKey(int id);
    //通过id查询管理员信息
    public UserTest findAdminInfoById(int AdminId) ;
}
