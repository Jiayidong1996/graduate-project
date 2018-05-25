package com.graduate.project.service;

import com.graduate.project.entity.TBill;
import com.graduate.project.entity.TBillInfo;

public interface FrontTBillService {
    //向数据库中插入一条数据
    public int insertTBill(int deskId);

    //在临时菜单中选出订单号，根据桌号信息
    public int selectTBillId(int deskId);

    //向数据库中插入一条临时信息 对应表tbillinfo
    public int insertTBillInfo(TBillInfo tBillInfo);
}
