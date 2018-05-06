package com.graduate.project.mapper;

import com.graduate.project.entity.BillInfo;
import com.graduate.project.entity.BillInfoExample;
import com.graduate.project.entity.BillInfoKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BillInfoMapper {
    int countByExample(BillInfoExample example);

    int deleteByExample(BillInfoExample example);

    int deleteByPrimaryKey(BillInfoKey key);

    int insert(BillInfo record);

    int insertSelective(BillInfo record);

    List<BillInfo> selectByExample(BillInfoExample example);

    BillInfo selectByPrimaryKey(BillInfoKey key);

    int updateByExampleSelective(@Param("record") BillInfo record, @Param("example") BillInfoExample example);

    int updateByExample(@Param("record") BillInfo record, @Param("example") BillInfoExample example);

    int updateByPrimaryKeySelective(BillInfo record);

    int updateByPrimaryKey(BillInfo record);
}