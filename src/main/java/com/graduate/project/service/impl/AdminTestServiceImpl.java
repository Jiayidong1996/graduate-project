package com.graduate.project.service.impl;

import com.graduate.project.entity.AdminTest;
import com.graduate.project.mapper.AdminTestMapper;
import com.graduate.project.service.AdminTestService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Service
public class AdminTestServiceImpl implements AdminTestService{
    @Resource
    AdminTestMapper adminTestMapper;

    //登录注册
    @Override
    public AdminTest getUserByName(String username){
        return adminTestMapper.getUserByName(username);
    }

    //添加管理员
    @Override
    public int insertAdmin(AdminTest adminTest){
        return adminTestMapper.insertAdmin(adminTest);
    }

    //删除管理员，通过管理员id
    @Override
    public int deleteAdmin(int id){
        return adminTestMapper.deleteAdmin(id);
    }

    //修改管理员
    @Override
    public int updateAdmin(AdminTest adminTest){
        return adminTestMapper.updateAdmin(adminTest);
    }
}
