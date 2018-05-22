package com.graduate.project.controller;

import com.graduate.project.entity.Desk;
import com.graduate.project.service.FrontDeskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("")
public class frontController {
    //正式编码时用到的前台的Controller层
    //餐桌用信息
    @Resource
    FrontDeskService frontDeskService;

    //进入前台界面
    @RequestMapping("/frontAdminIndex")
    public  String frontAdminIndex(){
        System.out.println("进入前台主界面...");
        return "/front/frontAdminIndex";
    }

    //主界面显示餐桌信息
    @RequestMapping("/frontAdminIndexContainer")
    public String frontAdminIndexContainer(Model model, HttpSession httpSession){
        System.out.println("进入餐台显示界面...");
        //用作传递餐桌信息的map
        Map<String,Desk> mapDesk=new HashMap<String,Desk>();
        //查询餐桌信息
        List<Desk> listDesk=frontDeskService.findDeskForIndex();
        System.out.println("返回了查询结果...");
        System.out.println(listDesk);
        model.addAttribute("listDesk",listDesk);
       for(Desk desk:listDesk){
            /*mapDesk.put(desk.getDeskstate(),
                    new Desk(desk.getDeskId(),desk.getAreaId(),desk.getDeskname(),desk.getDeskremark()));*/
            mapDesk.put(desk.getAreaId(),
                    new Desk(desk.getDeskId(),desk.getAreaId(),desk.getDeskname(),desk.getDeskstate(),desk.getDeskremark()));
        }
        System.out.println("上传了餐桌信息数据...");
        System.out.println(mapDesk);
        model.addAttribute("mapDesk",mapDesk);
       // httpSession.setAttribute("mapDesk",mapDesk);

        return "/front/frontAdminIndexContainer";
    }

    @RequestMapping("/frontBillInfo")
    public String frontBillInfo(){
        System.out.println("进入单据界面...");
        return "/front/frontBillInfo";
    }



}
