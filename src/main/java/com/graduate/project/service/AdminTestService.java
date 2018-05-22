package com.graduate.project.service;

import com.graduate.project.entity.AdminTest;

public interface AdminTestService {
    //通过姓名查询管理员
    public AdminTest getUserByName(String username);

    //添加管理员
    public int insertAdmin(AdminTest adminTest);

    //删除管理员，通过管理员id
    public int deleteAdmin(int id);

    //修改管理员
    public int updateAdmin(AdminTest adminTest);

}
