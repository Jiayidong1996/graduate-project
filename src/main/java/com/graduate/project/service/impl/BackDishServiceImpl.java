package com.graduate.project.service.impl;

import com.graduate.project.entity.Dish;
import com.graduate.project.mapper.DishMapper;
import com.graduate.project.service.BackDishService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BackDishServiceImpl implements BackDishService{
    @Resource
    DishMapper dishMapper;

    //菜品管理
    @Override
    public List<Dish> listDish(){
        return dishMapper.listDish();
    }

    //根据ID查询菜品
    @Override
    public Dish findDishById(int dishid){
        return dishMapper.findDishById(dishid);
    }

    //根据名称查询菜品
    @Override
    public Dish findDishByName(String dishname){
        return dishMapper.findDishByName(dishname);
    }

    //模糊查询菜品
    @Override
    public  List<Dish> searchDish(String dish){
        return dishMapper.searchDish(dish);
    }

    //添加菜品信息
    @Override
    public int insertDish(Dish dish){
        return dishMapper.insertDish(dish);
    }

    //更新菜品信息
    @Override
    public int updateDish(Dish dish){
        return dishMapper.updateDish(dish);
    }

    //删除菜品信息
    @Override
    public int deleteDish(int dishid){
        return dishMapper.deleteDish(dishid);
    }
}
