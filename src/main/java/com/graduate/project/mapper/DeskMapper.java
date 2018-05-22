package com.graduate.project.mapper;

import com.graduate.project.entity.Desk;
import com.graduate.project.entity.DeskExample;
import com.graduate.project.entity.DeskKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeskMapper {
    int countByExample(DeskExample example);

    int deleteByExample(DeskExample example);

    int deleteByPrimaryKey(DeskKey key);

    int insert(Desk record);

    int insertSelective(Desk record);

    List<Desk> selectByExample(DeskExample example);

    Desk selectByPrimaryKey(DeskKey key);

    int updateByExampleSelective(@Param("record") Desk record, @Param("example") DeskExample example);

    int updateByExample(@Param("record") Desk record, @Param("example") DeskExample example);

    int updateByPrimaryKeySelective(Desk record);

    int updateByPrimaryKey(Desk record);

    //首页商品信息显示 有限个
    public List<Desk> selectDeskForIndex();

    //分页显示所有商品
    public List<Desk> selectAllByPage(int index);


}