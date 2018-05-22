package com.graduate.project.mapper;

import com.graduate.project.entity.Admin;
import com.graduate.project.entity.AdminExample;
import com.graduate.project.entity.AdminInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminMapper {
    int countByExample(AdminExample example);

    int deleteByExample(AdminExample example);

    int insert(Admin record);

    int insertSelective(Admin record);

    List<Admin> selectByExample(AdminExample example);

    int updateByExampleSelective(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByExample(@Param("record") Admin record, @Param("example") AdminExample example);

    //通过ID查询管理员粗略信息
    public Admin findAdminById(int AdminIn);

    //通过ID查询管理员详细信息，这个还不知能不能用

    public AdminInfo findAdminInfoById(int AdminId);

    //更改用户信息
    public int updateAdmin(Admin admin);

    //更新管理员详细信息
    public int updateAdminInfo(AdminInfo adminInfo);

    //罗列所有管理员信息
    public List<Admin> listAdmin();

    //罗列所有管理员详细信息
    public List<AdminInfo> listAdminInfo();

    /*添加管理员
    先添加管理员ID和密码
    再添加管理员详细信息*/
    //添加管理员ID和密码
    public int insertAdmin(Admin admin);

    //添加管理员详细信息
    public int insertAdminInfo(AdminInfo adminInfo);

    //通过管理员ID删除管理员信息
    public int deleteAdminById(int AdminId);

    //通过管理员ID删除管理员详细信息
    public int deleteAdminInfoById(int AdminId);

}