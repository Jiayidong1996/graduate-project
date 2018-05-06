package com.graduate.project.mapper;

import com.graduate.project.entity.StoreHouse;
import com.graduate.project.entity.StoreHouseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StoreHouseMapper {
    int countByExample(StoreHouseExample example);

    int deleteByExample(StoreHouseExample example);

    int deleteByPrimaryKey(Integer materialid);

    int insert(StoreHouse record);

    int insertSelective(StoreHouse record);

    List<StoreHouse> selectByExample(StoreHouseExample example);

    StoreHouse selectByPrimaryKey(Integer materialid);

    int updateByExampleSelective(@Param("record") StoreHouse record, @Param("example") StoreHouseExample example);

    int updateByExample(@Param("record") StoreHouse record, @Param("example") StoreHouseExample example);

    int updateByPrimaryKeySelective(StoreHouse record);

    int updateByPrimaryKey(StoreHouse record);
}