package com.graduate.project.service;

import com.graduate.project.entity.Bill;
import com.graduate.project.entity.BillInfo;
import com.graduate.project.entity.BillInfoVO;

import java.util.List;

public interface BackBillService {
    //显示单据大致信息
    public Bill findBillById(int billid);

    //显示单据详情
    public List<BillInfo> findBillInfoById(int billid);

    //显示单据详情，测试！！！
    public List<BillInfoVO> findBillInfoTest(int billid);

    //罗列所有订单大致信息
    public List<Bill> listBill();
}
