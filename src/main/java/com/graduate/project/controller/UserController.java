package com.graduate.project.controller;

import com.graduate.project.entity.User;
import com.graduate.project.service.UserService;
import com.graduate.project.util.UniqueIDUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/findUser")
    public String findUser(Model model){
        int id=1;
        User user=this.userService.findUserById(id);
        model.addAttribute("user",user);
        return "index";
    }

    @RequestMapping("/index")
    public String index(Model model){
        int id=1;
        User user=this.userService.findUserById(id);
        System.out.println(user.toString());
        long uniqueID = UniqueIDUtil.getUniqueID();
        model.addAttribute("user",user);
        return "/userInfo";
    }
}
