package com.graduate.project.service;

import com.graduate.project.entity.StoreHouse;

import java.math.BigDecimal;
import java.util.List;

public interface BackStoreHouseService {
    //库存列表
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

    //模糊查询
    public List<StoreHouse> SearchStoreHouse(String store);
}
