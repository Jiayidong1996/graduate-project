package com.graduate.project.mapper;

import com.graduate.project.entity.Order;
import com.graduate.project.entity.OrderExample;
import com.graduate.project.entity.OrderInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {
    int countByExample(OrderExample example);

    int deleteByExample(OrderExample example);

    int deleteByPrimaryKey(Integer orderid);

    int insert(Order record);

    int insertSelective(Order record);

    List<Order> selectByExample(OrderExample example);

    Order selectByPrimaryKey(Integer orderid);

    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    //订单信息
    //还缺少粗略查询ID信息的功能

    //通过ID查询订单粗略信息
    public Order findOrderById(int orderid);

    //通过ID查询订单详细信息
    public List<OrderInfo> findOrderInfoById(int orderid);

    //暂时后台没有更改订单信息

    //罗列所有订单信息
    public List<Order> listOrder();

    //罗列所有订单详细信息
    public List<OrderInfo> listOrderInfo();

    //添加订单粗略信息
    public int insertOrder(Order order);

    //添加订单详细信息
    public int insertOrderInfo(OrderInfo orderInfo);

    //通过订单ID删除订单粗略信息
    public int deleteOrder(int orderid);

    //通过订单ID删除订单详细信息
    public int deleteOrderInfo(int orderid);

    //订单信息搜索
    public List<Order> searchOrder(String ordersinfo);


}