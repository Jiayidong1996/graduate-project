package com.graduate.project.service.impl;

import com.graduate.project.entity.TBill;
import com.graduate.project.entity.TBillInfo;
import com.graduate.project.mapper.TBillMapper;
import com.graduate.project.service.FrontTBillService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FrontTBillServiceImpl implements FrontTBillService{

    @Resource
    TBillMapper tBillMapper;

    //向数据库中插入一条数据
    @Override
    public int insertTBill(int deskId){
        return tBillMapper.insertTBill(deskId);
    }

    //在临时菜单中选出订单号，根据桌号信息
    @Override
    public int selectTBillId(int deskId){
        return tBillMapper.selectTBillId(deskId);
    }

    //向数据库中插入一条临时信息 对应表tbillinfo
    @Override
    public int insertTBillInfo(TBillInfo tBillInfo){
        return tBillMapper.insertTBillInfo(tBillInfo);
    }

}
