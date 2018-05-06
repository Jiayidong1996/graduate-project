package com.graduate.project.mapper;

import com.graduate.project.entity.AdminInfo;
import com.graduate.project.entity.AdminInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminInfoMapper {
    int countByExample(AdminInfoExample example);

    int deleteByExample(AdminInfoExample example);

    int deleteByPrimaryKey(Integer adminid);

    int insert(AdminInfo record);

    int insertSelective(AdminInfo record);

    List<AdminInfo> selectByExample(AdminInfoExample example);

    AdminInfo selectByPrimaryKey(Integer adminid);

    int updateByExampleSelective(@Param("record") AdminInfo record, @Param("example") AdminInfoExample example);

    int updateByExample(@Param("record") AdminInfo record, @Param("example") AdminInfoExample example);

    int updateByPrimaryKeySelective(AdminInfo record);

    int updateByPrimaryKey(AdminInfo record);
}