package com.graduate.project.mapper;

import com.graduate.project.entity.StoreHouse;
import com.graduate.project.entity.StoreHouseExample;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
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

    //库存信息
    public List<StoreHouse> listStoreHouse();

    //根据ID查询原材料
    public StoreHouse findStoreHouseById(int materialid);

    //根据姓名查询原材料
    public StoreHouse findStoreHouseByName(String materialname);

    //添加库存信息
    public int insertStoreHouse(StoreHouse storeHouse);

    //更新库存信息
    public int updateStoreHouse(StoreHouse storeHouse);

    //删除库存信息
    public int deleteStoreHouse(int materialid);

    //库存信息搜索
    public List<StoreHouse> SearchStoreHouse(String store);
}