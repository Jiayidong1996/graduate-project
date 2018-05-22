package com.graduate.project.service.impl;

import com.graduate.project.entity.Bill;
import com.graduate.project.entity.BillInfo;
import com.graduate.project.entity.BillInfoVO;
import com.graduate.project.mapper.BillMapper;
import com.graduate.project.service.BackBillService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BackBillServiceImpl implements BackBillService {
    @Resource
    BillMapper billMapper;

    //显示单据大致信息
    @Override
    public Bill findBillById(int billid){
        return billMapper.findBillById(billid);
    }

    //显示单据详情
    public List<BillInfo> findBillInfoById(int billid){
        return billMapper.findBillInfoById(billid);
    }

    //显示单据详情，测试！！！
    public List<BillInfoVO> findBillInfoTest(int billid){
        return billMapper.findBillInfoTest(billid);
    }

    //罗列所有订单大致信息
    public List<Bill> listBill(){
        return billMapper.listBill();
    }
}
