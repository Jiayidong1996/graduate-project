package com.graduate.project.service;

import com.graduate.project.entity.UserInfo;

/**
 * @author Dawei on 2018/3/29.
 */
public interface UserInfoService {

    Integer addUserInfo(UserInfo userInfo);

    UserInfo searchUserInfoById(Long userId);
}
