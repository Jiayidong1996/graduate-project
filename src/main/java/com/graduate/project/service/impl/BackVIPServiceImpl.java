package com.graduate.project.service.impl;

import com.graduate.project.entity.VIP;
import com.graduate.project.mapper.VIPMapper;
import com.graduate.project.service.BackVIPService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class BackVIPServiceImpl implements BackVIPService {
    @Resource
    VIPMapper vipMapper;

    //通过ID查询会员信息
    @Override
    public VIP findVIPById(int vipid){
        return vipMapper.findVIPById(vipid);
    }

    //更改会员信息
    @Override
    public int updateVIP(VIP vip){
        return vipMapper.updateVIP(vip);
    }

    //罗列所有会员信息
    @Override
    public List<VIP> listVIP(){
        return vipMapper.listVIP();
    }

    //添加会员
    @Override
    public int insertVIP(VIP vip){
        return vipMapper.insertVIP(vip);
    }

    //通过会员ID删除会员信息
    @Override
    public int deleteVIP(int vipid){
        return vipMapper.deleteVIP(vipid);
    }
}
