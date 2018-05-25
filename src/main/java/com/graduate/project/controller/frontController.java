package com.graduate.project.controller;

import com.graduate.project.entity.Desk;
import com.graduate.project.entity.Dish;
import com.graduate.project.entity.TBillInfo;
import com.graduate.project.service.BackDishService;
import com.graduate.project.service.FrontDeskService;
import com.graduate.project.service.FrontTBillService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @Resource
    BackDishService backDishService;

    @Resource
    FrontTBillService frontTBillService;

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

    //开台点菜
    //先选择餐桌
    @RequestMapping("/FrontDeskStateInfo")
    public String FrontDeskStateInfo(String un,Model model){
        System.out.println("选择餐桌，显示未被占用的餐桌...");
        List<Desk> listUnDesk=frontDeskService.selectByState(un);
        System.out.println("选出未被占用的餐桌"+listUnDesk);
        int sumUnnum=listUnDesk.size();
        System.out.println("上传未使用餐桌状态信息...");
        model.addAttribute("listUnDesk",listUnDesk);
        model.addAttribute("sumUnnum",sumUnnum);
        return "/front/frontDeskStateInfo";
    }

    //在未被占用的餐桌中进行模糊查询
    @RequestMapping(value = "/frontUnDeskSearch",method = RequestMethod.POST)
    public String frontUnDeskSearch(String deskinfo,Model model){
        System.out.println("显示餐桌模糊信息"+deskinfo);
        List<Desk> listUnDesk=frontDeskService.frontUnDeskSearch(deskinfo);
        System.out.println("模糊选出未被占用的餐桌"+listUnDesk);
        int sumUnnum=listUnDesk.size();
        System.out.println("上传未使用餐桌状态信息...");
        model.addAttribute("listUnDesk",listUnDesk);
        model.addAttribute("sumUnnum",sumUnnum);
        return "/front/frontDeskStateInfo";
    }


    //选择餐桌结束后进入点餐界面，应该有一个能自动生成订单号的函数，使订单号不重复生成
    @RequestMapping("/frontOpenTable")
    public String frontOpenTable(String No,int deskId,Model model){
        System.out.println("进入开台点餐界面...");
        System.out.println("餐桌号"+deskId);
        //暂时不产生订单号产生一条暂时订单号，并存入数据库中
        /*frontTBillService.insertTBill(deskId);*/
        //上传餐桌号
        model.addAttribute("deskId",deskId);
        //列出所有未被选择的菜品
        List<Dish> listDish=backDishService.findUnSelectDish(No);
        System.out.println(listDish);
        int sumDishnum=listDish.size();
        model.addAttribute("listDish",listDish);
        model.addAttribute("sumDishnum",sumDishnum);
        return "/front/frontOpenTable";
    }

    //开台点菜，流水号和customeId都是系统生成的

    //点击确定后，更改菜品为被选择，上传被选择的菜品信息
    //点击一个添加要做好多事情啊,上传每一条信息到tbillinfo
    @RequestMapping("/frontOpenTableAdd")
    public String frontOpenTableAdd(int deskId,String dishnum,int dishid,String No,Model model){
        System.out.println("菜品："+dishid);
        System.out.println("数量："+dishnum);
        System.out.println("Test点菜开始！！！");
        System.out.println("菜品ID"+dishid);
        backDishService.updateDishYes(dishid);
        System.out.println("更新了菜品信息！");
        System.out.println("下面开始测试了！！！！！");
        //选出餐桌对应的信息
        int tbillid=frontTBillService.selectTBillId(deskId);
        System.out.println(frontTBillService.selectTBillId(deskId));
        System.out.println("餐桌："+deskId);
        /*System.out.println("单据："+tbillid);*/
        //向数据库的临时表中插入一条信息
        TBillInfo tBillInfo=new TBillInfo();
        tBillInfo.setTbillid(tbillid);
        tBillInfo.setDishid(dishid);
        tBillInfo.setDishnum(dishnum);
        frontTBillService.insertTBillInfo(tBillInfo);
        System.out.println("向数据库中添加数据成功！");
        //列出所有未被选择的菜品
        List<Dish> listDish=backDishService.findUnSelectDish(No);
        System.out.println(listDish);
        int sumDishnum=listDish.size();
        model.addAttribute("deskId",deskId);
        model.addAttribute("listDish",listDish);
        model.addAttribute("sumDishnum",sumDishnum);
        return "/front/frontOpenTable";
    }

    //最后点击确定后，应该上传信息到tbill






}
