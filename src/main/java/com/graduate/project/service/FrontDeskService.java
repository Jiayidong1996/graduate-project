package com.graduate.project.service;

import com.graduate.project.entity.Desk;

import java.util.List;

public interface FrontDeskService {
    //为主界面显示部分商品信息  查询返回有限个 数据
    public List<Desk> findDeskForIndex();

    //分页显示所有商品selectAllByPage
    public List<Desk> selectAllByPage(int index);


}
