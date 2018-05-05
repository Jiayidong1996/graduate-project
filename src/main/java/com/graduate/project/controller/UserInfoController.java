package com.graduate.project.controller;

import com.alibaba.fastjson.JSON;
import com.graduate.project.entity.UserInfo;
import com.graduate.project.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Dawei  on 2018/3/29.
 */
@Controller
@RequestMapping(value = "/graduate")
public class UserInfoController {

    private static final Logger logger = LoggerFactory.getLogger(UserInfoController.class);

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value = "/user/insert", method = RequestMethod.GET)
    public String insertUserInfo(UserInfo userInfo) {
        logger.info("to add or update user info, userInfo={}", JSON.toJSONString(userInfo));
        //TODO 测试使用
        userInfo = new UserInfo();
        userInfo.setAge(18);
        userInfo.setBirthday(new Date());
        userInfo.setEducation(1);
        userInfo.setHeight(195.5);
        userInfo.setIfMarried(0);
        userInfo.setPosition("sdsfd");
        userInfo.setSex(false);
        userInfo.setUsername("dawei");
        Integer integer = userInfoService.addUserInfo(userInfo);
        System.out.println("hello World!");
        System.out.println("hello World!");
        return "";
    }

    @RequestMapping(value = "/user/get", method = RequestMethod.GET)
    public String getUserInfo(Long userId) {
        logger.info("get user info by user id, userId= {}", userId);
        userId = 321393642586176L;
        UserInfo userInfo = userInfoService.searchUserInfoById(userId);
        logger.info("user info result: userInfo={}", JSON.toJSONString(userInfo));
        Map<String, Object> map = new HashMap<>();
        map.put("userInfo", userInfo);
        System.out.println("hello World!");
        return "/userInfo";
    }



}
