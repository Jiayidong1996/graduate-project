package com.graduate.project.controller;

import com.graduate.project.entity.AdminTest;
import com.graduate.project.service.AdminTestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("")
public class AdminTestController {
    //用户
    @Resource
    private AdminTestService adminTestService;

    //管理员登录 点击登录 成功跳转到主界面  失败返回登录
    @RequestMapping(value = "/login")
    public String login(AdminTest adminTest, HttpSession session) {
        System.out.println("进入管理员登录密码验证Controller");
        System.out.println(adminTest);
        AdminTest adminTest1 = null;
        adminTest1 = adminTestService.getUserByName(adminTest.getUsername());
        if (adminTest1 != null) {
            if (adminTest.getPassword().equals(adminTest1.getPassword())) {
                if(adminTest.getLimits().equals("超级管理员")){
                    System.out.println("超级管理员登录成功！");
                }else{
                    System.out.println("普通管理员登录成功！");
                }
                session.setAttribute("AdminUsername", adminTest.getUsername());
                return "/index";
            } else {
                System.out.println("密码错误！");
                return "/login";
            }
        }
        System.out.println("用户名不存在！");
        return "/login";
    }


    //添加管理员 粗略信息
    @RequestMapping(value = "/insert")
    public String insert(AdminTest adminTest){
        System.out.println("进行表单提交...");
        System.out.println(adminTest);
        System.out.println("获得参数值...");

        //先验证用户是否存在
        AdminTest adminTest1=adminTestService.getUserByName(adminTest.getUsername());
        if(adminTest1!=null) {
            System.out.println("已存在用户！");
            return "/insert";
        }
        //添加管理员
        System.out.println(adminTestService.insertAdmin(adminTest));
        System.out.println("1111");
        System.out.println("添加成功");
        return "/index";
    }


    //删除测试
    @RequestMapping("/delete")
    public String delete(int id, Model model){
        System.out.println("后台删除管理员");
        System.out.println(id);
        adminTestService.deleteAdmin(id);
        System.out.println("执行了...");
        return "/index";
    }

    //更新测试
    @RequestMapping("/update")
    public String update(AdminTest adminTest,Model model){
        System.out.println("更新管理员信息");
        System.out.println(adminTest);
        adminTestService.updateAdmin(adminTest);
        System.out.println("更新了管理员信息");
        return "/index";

    }
}
