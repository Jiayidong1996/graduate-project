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

    //暂时待定，粗略查询会员信息，这里还差一个功能，搜索会员

    //通过ID查询会员信息
    public VIP findVIPById(int vipid);

    //更改会员信息
    public int updateVIP(VIP vip);

    //罗列所有会员信息
    public List<VIP> listVIP();

    //添加会员
    public int insertVIP(VIP vip);

    //通过会员ID删除会员信息
    public int deleteVIP(int vipid);
}