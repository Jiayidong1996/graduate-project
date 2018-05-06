package com.graduate.project.mapper;

import com.graduate.project.entity.VIP;
import com.graduate.project.entity.VIPExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VIPMapper {
    int countByExample(VIPExample example);

    int deleteByExample(VIPExample example);

    int deleteByPrimaryKey(Integer vipid);

    int insert(VIP record);

    int insertSelective(VIP record);

    List<VIP> selectByExample(VIPExample example);

    VIP selectByPrimaryKey(Integer vipid);

    int updateByExampleSelective(@Param("record") VIP record, @Param("example") VIPExample example);

    int updateByExample(@Param("record") VIP record, @Param("example") VIPExample example);

    int updateByPrimaryKeySelective(VIP record);

    int updateByPrimaryKey(VIP record);
}