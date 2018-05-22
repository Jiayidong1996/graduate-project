package com.graduate.project.mapper;

import com.graduate.project.entity.Bill;
import com.graduate.project.entity.BillExample;
import com.graduate.project.entity.BillInfo;
import com.graduate.project.entity.BillInfoVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BillMapper {
    int countByExample(BillExample example);

    int deleteByExample(BillExample example);

    int deleteByPrimaryKey(Integer billid);

    int insert(Bill record);

    int insertSelective(Bill record);

    List<Bill> selectByExample(BillExample example);

    Bill selectByPrimaryKey(Integer billid);

    int updateByExampleSelective(@Param("record") Bill record, @Param("example") BillExample example);

    int updateByExample(@Param("record") Bill record, @Param("example") BillExample example);

    int updateByPrimaryKeySelective(Bill record);

    int updateByPrimaryKey(Bill record);

    //单据信息
    //显示单据大致信息
    public Bill findBillById(int billid);

    //显示单据详情
    public List<BillInfo> findBillInfoById(int billid);

    //显示单据信息，这里是测试！！！
    public List<BillInfoVO> findBillInfoTest(int billid);

    //罗列所有订单大致信息
    public List<Bill> listBill();

    //删除单据信息
}