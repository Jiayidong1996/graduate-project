package com.graduate.project.mapper;

import com.graduate.project.entity.Amount;
import com.graduate.project.entity.AmountExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AmountMapper {
    int countByExample(AmountExample example);

    int deleteByExample(AmountExample example);

    int deleteByPrimaryKey(Integer amountid);

    int insert(Amount record);

    int insertSelective(Amount record);

    List<Amount> selectByExample(AmountExample example);

    Amount selectByPrimaryKey(Integer amountid);

    int updateByExampleSelective(@Param("record") Amount record, @Param("example") AmountExample example);

    int updateByExample(@Param("record") Amount record, @Param("example") AmountExample example);

    int updateByPrimaryKeySelective(Amount record);

    int updateByPrimaryKey(Amount record);
}