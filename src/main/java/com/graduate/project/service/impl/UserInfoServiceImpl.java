package com.graduate.project.service.impl;

import com.alibaba.fastjson.JSON;
import com.graduate.project.entity.UserInfo;
import com.graduate.project.mapper.UserInfoMapper;
import com.graduate.project.service.UserInfoService;
import com.graduate.project.util.UniqueIDUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Dawei  on 2018/3/29.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService{

    private static final Logger logger = LoggerFactory.getLogger(UserInfoService.class);

    //mapper里面的接口
    @Autowired
    private UserInfoMapper userInfoMapper;


    /**
     * 保存或更改用户信息
     * @param userInfo 用户信息
     * @return 操作结果
     */
    @Override
    public Integer addUserInfo(UserInfo userInfo) {

        logger.info("to save or update user info ,userInfo={}", JSON.toJSONString(userInfo));
        int result = 0;
        System.out.println("hello World!");
        if (userInfo != null) {
            Long userId = userInfo.getId();
            try{
                if(userId == null) {
                    userId = UniqueIDUtil.getUniqueID();
                    userInfo.setId(userId);
                    result = userInfoMapper.insert(userInfo);
                    logger.info("save user info result={}", result);
                } else {
                    result = userInfoMapper.updateByPrimaryKey(userInfo);
                    logger.info("update user info result={}", result);
                }
            } catch (Exception e) {
                logger.error("to save or update user info error, e", e);
            }
        } else {
            logger.error("parameter is null");
        }
        return result;
    }

    /**
     * 通过主键Id获取用户信息
     * @param userId 用户ID
     * @return 用户实体
     */
    @Override
    public UserInfo searchUserInfoById(Long userId) {
        logger.info("to get user info by primary id, userId={}", userId);
        UserInfo userInfo = null;
        if(userId != null) {
            try {
                userInfo = userInfoMapper.selectByPrimaryKey(userId);
            } catch (Exception e) {
                logger.error("get user info by primary Error, e={}", e);
            }
        } else {
            logger.error("user id is null!");
        }
        return userInfo;
    }
}
