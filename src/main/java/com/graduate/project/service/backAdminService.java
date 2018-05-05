package com.graduate.project.service;

import com.graduate.project.entity.UserTest;

public interface backAdminService {
    //修改用户 管理员信息使用 通过id更改密码时用到过
    //通过id查询管理员信息
    public  UserTest findAdminInfoById(int adminId);
}
