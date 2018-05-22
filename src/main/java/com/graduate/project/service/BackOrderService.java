package com.graduate.project.service;

import com.graduate.project.entity.Order;
import com.graduate.project.entity.OrderInfo;

import java.util.List;

public interface BackOrderService {
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
}
