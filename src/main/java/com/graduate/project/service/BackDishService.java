package com.graduate.project.service;

import com.graduate.project.entity.Dish;

import java.util.List;

public interface BackDishService {
    //菜品管理
    public List<Dish> listDish();

    //根据ID查询菜品
    public Dish findDishById(int dishid);

    //根据名称查询菜品
    public Dish findDishByName(String dishname);

    //模糊查询菜品
    public  List<Dish> searchDish(String dish);

    //添加菜品信息
    public int insertDish(Dish dish);

    //更新菜品信息
    public int updateDish(Dish dish);

    //删除菜品信息
    public int deleteDish(int dishid);

    //选出所有未被选择的菜品
    public List<Dish> findUnSelectDish(String No);

    //更新菜品被选中
    public int updateDishYes(int dishid);

    //更新菜品未被选中
    public int updateDishNo(int dishid);

    //一次性更新所有菜品未被选中
    public List<Dish> updateAllDishNo();
}
