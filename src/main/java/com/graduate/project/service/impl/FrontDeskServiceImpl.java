package com.graduate.project.service.impl;

import com.graduate.project.entity.Desk;
import com.graduate.project.mapper.DeskMapper;
import com.graduate.project.service.FrontDeskService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FrontDeskServiceImpl implements FrontDeskService{

    @Resource
    DeskMapper deskMapper;
    //为主界面显示部分商品信息  查询返回有限个 数据
    @Override
    public List<Desk> findDeskForIndex(){
        return deskMapper.selectDeskForIndex();
    }

    //分页显示所有商品selectAllByPage
    @Override
    public List<Desk> selectAllByPage(int index){
        return deskMapper.selectAllByPage(index);
    }

    //按照餐桌状态选择餐桌
    @Override
    public List<Desk> selectByState(String un){
        return deskMapper.selectByState(un);
    }

    //模糊查询餐桌信息
    @Override
    public List<Desk> frontUnDeskSearch(String deskinfo){
        return deskMapper.frontUnDeskSearch(deskinfo);
    }

}
