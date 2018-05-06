package com.graduate.project.mapper;

import com.graduate.project.entity.Dish;
import com.graduate.project.entity.DishExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DishMapper {
    int countByExample(DishExample example);

    int deleteByExample(DishExample example);

    int deleteByPrimaryKey(Integer dishid);

    int insert(Dish record);

    int insertSelective(Dish record);

    List<Dish> selectByExample(DishExample example);

    Dish selectByPrimaryKey(Integer dishid);

    int updateByExampleSelective(@Param("record") Dish record, @Param("example") DishExample example);

    int updateByExample(@Param("record") Dish record, @Param("example") DishExample example);

    int updateByPrimaryKeySelective(Dish record);

    int updateByPrimaryKey(Dish record);
}