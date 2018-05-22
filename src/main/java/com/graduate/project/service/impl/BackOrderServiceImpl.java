package com.graduate.project.service.impl;

import com.graduate.project.entity.Order;
import com.graduate.project.entity.OrderInfo;
import com.graduate.project.mapper.OrderMapper;
import com.graduate.project.service.BackOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BackOrderServiceImpl implements BackOrderService{
    @Resource
    OrderMapper orderMapper;

    //通过ID查询订单粗略信息
    @Override
    public Order findOrderById(int orderid){
        return orderMapper.findOrderById(orderid);
    }

    //通过ID查询订单详细信息
    @Override
    public List<OrderInfo> findOrderInfoById(int orderid){
        return orderMapper.findOrderInfoById(orderid);
    }

    //暂时后台没有更改订单信息

    //罗列所有订单信息
    @Override
    public List<Order> listOrder(){
        return orderMapper.listOrder();
    }

    //罗列所有订单详细信息
    @Override
    public List<OrderInfo> listOrderInfo(){
        return orderMapper.listOrderInfo();
    }

    //添加订单粗略信息
    @Override
    public int insertOrder(Order order){
        return orderMapper.insertOrder(order);
    }

    //添加订单详细信息
    @Override
    public int insertOrderInfo(OrderInfo orderInfo){
        return orderMapper.insertOrderInfo(orderInfo);
    }

    //通过订单ID删除订单粗略信息
    @Override
    public int deleteOrder(int orderid){
        return orderMapper.deleteOrder(orderid);
    }

    //通过订单ID删除订单详细信息
    @Override
    public int deleteOrderInfo(int orderid){
        return orderMapper.deleteOrderInfo(orderid);
    }

    //订单信息搜索

}
