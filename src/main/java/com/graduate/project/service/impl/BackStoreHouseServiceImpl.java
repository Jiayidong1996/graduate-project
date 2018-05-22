package com.graduate.project.service.impl;

import com.graduate.project.entity.StoreHouse;
import com.graduate.project.mapper.StoreHouseMapper;
import com.graduate.project.service.BackStoreHouseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

@Service
public class BackStoreHouseServiceImpl implements BackStoreHouseService{
    @Resource
    StoreHouseMapper storeHouseMapper;

    //库存列表
    @Override
    public List<StoreHouse> listStoreHouse(){
        return storeHouseMapper.listStoreHouse();
    }

    //根据ID查询原材料
    @Override
    public StoreHouse findStoreHouseById(int materialid){
        return storeHouseMapper.findStoreHouseById(materialid);
    }

    //根据姓名查询原材料
    @Override
    public StoreHouse findStoreHouseByName(String materialname){
        return storeHouseMapper.findStoreHouseByName(materialname);
    }

    //添加库存信息
    @Override
    public int insertStoreHouse(StoreHouse storeHouse){
        return storeHouseMapper.insertStoreHouse(storeHouse);
    }

    //更新库存信息
    @Override
    public int updateStoreHouse(StoreHouse storeHouse){
        return storeHouseMapper.updateStoreHouse(storeHouse);
    }

    //删除库存信息
    @Override
    public int deleteStoreHouse(int materialid){
        return storeHouseMapper.deleteStoreHouse(materialid);
    }

    //模糊查询
    @Override
    public List<StoreHouse> SearchStoreHouse(String store){
        return storeHouseMapper.SearchStoreHouse(store);
    }
}
