package com.graduate.project.controller;

import com.graduate.project.entity.UserTest;
import com.graduate.project.service.backAdminService;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;


public class UserTestController {
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~管理员登录~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //进入后台管理员登录，这个先暂且不写，已经进入了登陆界面
   /* @RequestMapping(value="/back_AdminLogin")
    public String back_AdminLogin(){
        return "back/back_AdminLogin";
    }*/

    @Resource
    private backAdminService backAdminService;

    //点击登录  成功调转到主界面  失败 返回登录
    @RequestMapping(value="/AdminIndex")
    public String AdminIndex(UserTest userTest, HttpSession session) {
        //还缺少 判别管理员还是超级管理员 选择登录方法
        System.out.println("进入管理员登陆密码验证controller");
        System.out.println(userTest);
        UserTest userTest2=null;
        //这里还需要更改
        userTest2= backAdminService.findAdminInfoById(userTest.getAdminId());
        if(userTest2!=null){
            if(userTest.getAdminPass().equals(userTest2.getAdminPass())){
                if(userTest.getLimits().equals(userTest2.getLimits())){
                    if(userTest.getLimits().equals("admin")){
                        System.out.println("超级管理员admin");
                        session.setAttribute("AdminIdentity", userTest.getAdminId());
                        return "/index";
                    }
                    System.out.println("普通管理员");
                    session.setAttribute("AdminIdentity", userTest.getAdminId());
                    return "/index";
                }
                System.out.println("权限不对应");
                return "/UserTest01";
            }else{
                System.out.println("密码错误");
                return "/UserTest01";
            }
        }

        System.out.println("用户不存在");

        return "/UserTest01";
    }
}

