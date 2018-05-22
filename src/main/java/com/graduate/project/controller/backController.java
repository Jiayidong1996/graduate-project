package com.graduate.project.controller;


import com.graduate.project.entity.*;
import com.graduate.project.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.jws.WebParam;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("")
public class backController {
    //正式编码时用到的后台的Controller层
    @Resource
    private BackAdminService backAdminService;

    @Resource
    private BackVIPService backVIPService;

    @Resource
    private BackOrderService backOrderService;

    @Resource
    private BackBillService backBillService;

    @Resource
    private BackStoreHouseService backStoreHouseService;

    @Resource BackDishService backDishService;

    //进入后台登录界面，设定是先登录，才能进入后台管理界面
    @RequestMapping("/backAdminLogin")
    public String backAdminLogin(){
        return "/back/backAdminLogin";
    }

    //后台管理员登录，登录成功进入后台主界面
    @RequestMapping("/backAdminIndex")
    public String backAdminIndex(Admin admin, HttpSession httpSession){
        System.out.println("进入管理员登录Controller...");
        System.out.println(admin);
        Admin admin1=null;
        admin1=backAdminService.findAdminById(admin.getAdminid());
        if(admin1!=null){
            if(admin.getAdminpass().equals(admin1.getAdminpass())){
                System.out.println("管理员登录...");
                httpSession.setAttribute("adminId",admin.getAdminid());
                return "/back/backAdminIndex";
                }else {
                System.out.println("密码不正确！");
                return "/back/backAdminLogin";
            }
        }
        System.out.println("用户名不正确！");
        return "/back/backAdminLogin";
    }


    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~管理员管理~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    //后台主界面进入管理员列表
    @RequestMapping("/backAdminListManage")
    /*public String backAdminListManage(Model model){*/
    public String backAdminListManage(HttpSession httpSession,Model model){
        System.out.println("进入管理员列表界面...");
        List<Admin> listAdmin=backAdminService.listAdmin();
        System.out.println("粗略信息...");
        System.out.println(listAdmin);
        List<AdminInfo> listAdminInfo=backAdminService.listAdminInfo();
        System.out.println("详细信息...");
        System.out.println(listAdminInfo);
        System.out.println("以下是更详细的信息...");

        int sumAdminnum=listAdmin.size();
        System.out.println(sumAdminnum);
        httpSession.setAttribute("sumAdminnum",sumAdminnum);
        model.addAttribute("listAdmin",listAdmin);
        model.addAttribute("listAdminInfo",listAdminInfo);
       return "/back/backAdminListManage";
    }

    //后台修改管理员列表信息
    @RequestMapping("/backAdminListManageEdit")
    public String backAdminListManageEdit(int adminid,Model model){
        System.out.println("进入管理员信息修改界面....");
        System.out.println(adminid);
        //通过id简单信息
        Admin admin=backAdminService.findAdminById(adminid);
        System.out.println("管理员简单信息...");
        System.out.println(admin);
        AdminInfo adminInfo=backAdminService.findAdminInfoById(adminid);
        System.out.println("管理员详细信息...");
        System.out.println(adminInfo);
        //列出该用户信息
        model.addAttribute("admin",admin);
        model.addAttribute("adminInfo",adminInfo);
        return "/back/backAdminListManageEdit";

    }

    //后台提交管理员信息修改
    @RequestMapping("/backDoAdminListManageEdit")
    public String backDoAdminListManageEdit(Admin admin,AdminInfo adminInfo,Model model){
        System.out.println("执行了信息修改...");
        System.out.println("admin:"+admin+" "+"adminInfo:"+adminInfo);
        backAdminService.updateAdmin(admin);
        System.out.println("更新了简单信息...");
        backAdminService.updateAdminInfo(adminInfo);
        System.out.println("更新了详细信息...");

        System.out.println("进入管理员管理界面...");
        //列出所有管理员
        List<Admin> listAdmin=backAdminService.listAdmin();
        List<AdminInfo> listAdminInfo=backAdminService.listAdminInfo();
        int sumAdminnum=listAdmin.size();
        System.out.println(listAdmin);
        System.out.println(sumAdminnum);
        model.addAttribute("listAdmin",listAdmin);
        model.addAttribute("listAdminInfo",listAdminInfo);
        model.addAttribute("sumAdminnum",sumAdminnum);
        return "/back/backAdminListManage";
    }


    //后台跳转到管理员添加
    @RequestMapping("/backAdminListManageAdd")
    public String backAdminListManageAdd(){
        System.out.println("进入管理员添加界面...");
        return "/back/backAdminListManageAdd";
    }

    //后台提交管理员信息
    @RequestMapping("/DoAdminListManageAdd")
    public String DoAdminListManageAdd(Admin admin,AdminInfo adminInfo,Model model){
        System.out.println("进入添加管理员表单...");
        System.out.println("admin:"+admin+" "+"adminInfo:"+adminInfo);
        System.out.println("获得参数值...");
        //先进行用户是否存在的验证
        Admin admin1=backAdminService.findAdminById(admin.getAdminid());
        if(admin1!=null){
            System.out.println("该用户已经存在！不可重复...");
            return "/back/backAdminListManageAdd";
        }
        //添加管理员
        System.out.println(backAdminService.insertAdmin(admin));
        System.out.println(backAdminService.insertAdminInfo(adminInfo));
        System.out.println("添加成功！");
        //返回主界面
        //列出所有管理员
        List<Admin> listAdmin=backAdminService.listAdmin();
        List<AdminInfo> listAdminInfo=backAdminService.listAdminInfo();
        int sumAdminnum=listAdmin.size();
        System.out.println(listAdmin);
        System.out.println(sumAdminnum);
        model.addAttribute("listAdmin",listAdmin);
        model.addAttribute("listAdminInfo",listAdminInfo);
        model.addAttribute("sumAdminnum",sumAdminnum);
        return "/back/backAdminListManage";
    }

    //后台删除管理员
    @RequestMapping("/backAdminListManageDelete")
    public String backAdminListManageDelete(int adminid,Model model){
        System.out.println("后台删除管理员...");
        System.out.println(adminid);
        backAdminService.deleteAdminById(adminid);
        System.out.println("执行了简单删除...");
        backAdminService.deleteAdminInfoById(adminid);
        System.out.println("执行了详细删除...");
        System.out.println("进入管理员管理界面...");

        //列出所有管理员
        List<AdminInfo> listAdminInfo=backAdminService.listAdminInfo();
        int sumAdminnum=listAdminInfo.size();
        System.out.println(listAdminInfo);
        System.out.println(sumAdminnum);
        model.addAttribute("listAdminInfo",listAdminInfo);
        model.addAttribute("sumAdminnum",sumAdminnum);
        return "/back/backAdminListManage";
    }

    /*~~~~~~~~~~~~~~~~~~~~`~~~~~~~~~~会员管理~~~~~~~~~~~~~~~~~~~~~~~~~~`~~~~~~*/

    //显示会员信息
    @RequestMapping("/backVIPManage")
    public String backVIPManage(Model model){
        System.out.println("进入会员列表界面...");
        List<VIP> listVIP=backVIPService.listVIP();
        System.out.println("会员信息...");
        System.out.println(listVIP);
        int sumVIPnum=listVIP.size();
        System.out.println("会员数量:"+sumVIPnum);
        model.addAttribute("listVIP",listVIP);
        model.addAttribute("sumVIPnum",sumVIPnum);
        return "/back/backVIPManage";

    }

    //编辑会员信息
    @RequestMapping("/backVIPManageEdit")
    public String backVIPManageEdit(int vipid, Model model){
        System.out.println("进入会员编辑...");
        System.out.println(vipid);
        VIP vip=backVIPService.findVIPById(vipid);
        System.out.println("print vip info...");
        System.out.println(vip);

        //go on vip info
        model.addAttribute("vip",vip);
        return "/back/backVIPManageEdit";
    }

    //Post VIP Edit Info
    @RequestMapping("/DoEditVIPManage")
    public String DoEditVIPManage(VIP vip,Model model){
        System.out.println("编辑会员信息界面...");
        System.out.println("vip:"+vip);
        backVIPService.updateVIP(vip);
        System.out.println("update vip info...");

        System.out.println("Enter VIPManage");
        //List VIP
        List<VIP> listVIP =backVIPService.listVIP();
        int sumVIPnum=listVIP.size();
        System.out.println(listVIP);
        System.out.println(sumVIPnum);
        model.addAttribute("listVIP",listVIP);
        model.addAttribute("sumVIPnum",sumVIPnum);
        return "/back/backVIPManage";
    }

    //添加会员信息
    //Enter VIP Add Jsp
    @RequestMapping("/backVIPManageAdd")
    public String backVIPManageAdd(){
        System.out.println("进入会员添加...");
        return "/back/backVIPManageAdd";
    }

    //Post VIP Add Info
    @RequestMapping("/DoAddVIPManage")
    public String DoAddVIPManage(VIP vip, Model model){
        System.out.println("会员添加界面!!!");
        System.out.println("vip:"+vip);
        System.out.println("Get Each Parameter...");

        //If have the vip
        VIP vip1=backVIPService.findVIPById(vip.getVipid());
        if(vip1!=null){
            System.out.println("There have the same vip");
            return "/back/backVIPManageAdd";
        }
        System.out.println(vip.getVipbirth());
        //Add VIP
        System.out.println(backVIPService.insertVIP(vip));
        System.out.println("Insert Success!");
        //return
        //List VIP
        List<VIP> listVIP =backVIPService.listVIP();
        int sumVIPnum=listVIP.size();
        System.out.println(listVIP);
        System.out.println(sumVIPnum);
        model.addAttribute("listVIP",listVIP);
        model.addAttribute("sumVIPnum",sumVIPnum);
        return "/back/backVIPManage";
    }

    //删除会员信息
    @RequestMapping("/backVIPManageDelete")
    public String backVIPManageDelete(int vipid,Model model){
        System.out.println("删除会员...");
        System.out.println(vipid);
        backVIPService.deleteVIP(vipid);

        System.out.println("Enter VIPManage Jsp");
        //List VIP
        List<VIP> listVIP =backVIPService.listVIP();
        int sumVIPnum=listVIP.size();
        System.out.println(listVIP);
        System.out.println(sumVIPnum);
        model.addAttribute("listVIP",listVIP);
        model.addAttribute("sumVIPnum",sumVIPnum);
        return "/back/backVIPManage";
    }

    /*~~~~~~~~~~~~~~~~~~~~`~~~~~~~~~~单据管理~~~~~~~~~~~~~~~~~~~~~~~~~~`~~~~~~*/
    //后台显示单据
    @RequestMapping("/backBillManage")
    public String backBillManage(Model model){
        System.out.println("进入单据列表...");
        List<Bill> listBill=backBillService.listBill();
        System.out.println("单据大致信息...");
        System.out.println(listBill);
        int sumBillnum=listBill.size();
        model.addAttribute("listBill",listBill);
        model.addAttribute("sumBillnum",sumBillnum);
        return "/back/backBillManage";
    }

    //后台显示单据详细信息
    @RequestMapping("/backBillInfoManage")
    public String backBillInfoManage(int billid,Model model){
        System.out.println("进入单据详情页面");
        List<BillInfoVO> listBillInfo=backBillService.findBillInfoTest(billid);
        System.out.println(listBillInfo);
        model.addAttribute("listBillInfo",listBillInfo);
        return "/back/backBillInfoManage";

    }

    //后台删除单据
    //后台搜索单据



    /*~~~~~~~~~~~~~~~~~~~~`~~~~~~~~~~订单管理~~~~~~~~~~~~~~~~~~~~~~~~~~`~~~~~~*/
    //后台显示订单
    @RequestMapping("/backOrderManage")
    public String backOrderManage(Model model){
        System.out.println("进入订单列表...");
        List<Order> listOrder=backOrderService.listOrder();
        System.out.println("订单大致信息...");
        System.out.println(listOrder);
        int sumOrdernum=listOrder.size();
        System.out.println("订单数量"+sumOrdernum);
        model.addAttribute("listOrder",listOrder);
        model.addAttribute("sumOrdernum",sumOrdernum);
        return "/back/backOrderManage";
    }

    //后台显示订单详细信息
    @RequestMapping("/backOrderInfoManage")
    public String backOrderInfoManage(int orderid,Model model){
        System.out.println("进入订单详情页面");
        List<OrderInfo> ListOrderInfo=backOrderService.findOrderInfoById(orderid);
        model.addAttribute("ListOrderInfo",ListOrderInfo);
        return "/back/backOrderInfoManage";

    }

    //后台添加订单 应该是先添加订单的大致信息，下一步再添加订单的详细信息后才可以

    //后台删除订单
    //后台搜索订单



    /*~~~~~~~~~~~~~~~~~~~~`~~~~~~~~~~库存管理~~~~~~~~~~~~~~~~~~~~~~~~~~`~~~~~~*/
    //后台显示库存
    @RequestMapping("/backStoreHouseManage")
    public String backStoreHouseManage(Model model){
        System.out.println("进入库存列表...");
        List<StoreHouse> listStoreHouse=backStoreHouseService.listStoreHouse();
        System.out.println("库存大致信息...");
        System.out.println(listStoreHouse);
        int sumStorenum=listStoreHouse.size();
        System.out.println("订单数量"+sumStorenum);
        model.addAttribute("listStoreHouse",listStoreHouse);
        model.addAttribute("sumStorenum",sumStorenum);
        return "/back/backStoreHouseManage";
    }

    //进入添加库存信息页面
    @RequestMapping("/backStoreHouseManageAdd")
    public String backStoreHouseManageAdd(){
        System.out.println("进入添加库存信息页面...");
        return "/back/backStoreHouseAdd";
    }

    //添加库存信息
    @RequestMapping("/DoAddStoreHouseInfo")
    public String DoAddStoreHouseInfo(StoreHouse storeHouse,Model model){
        System.out.println("添加库存信息...");
        //先验证是否存在该原材料的ID
        StoreHouse storeHouse1=backStoreHouseService.findStoreHouseById(storeHouse.getMaterialid());
        if(storeHouse1!=null){
            System.out.println("已经存在该ID！不可以再添加！");
            return "/back/backStoreHouseAdd";
        }
        //再验证是否存在该原材料的名称
        StoreHouse storeHouse2=backStoreHouseService.findStoreHouseByName(storeHouse.getMaterialname());
        if(storeHouse2!=null){
            System.out.println("已经存在该名称！不可以再添加！");
            return "/back/backStoreHouseAdd";
        }
        System.out.println(backStoreHouseService.insertStoreHouse(storeHouse));
        System.out.println("库存信息添加成功！");
        List<StoreHouse> listStoreHouse=backStoreHouseService.listStoreHouse();
        System.out.println("库存大致信息...");
        System.out.println(listStoreHouse);
        int sumStorenum=listStoreHouse.size();
        System.out.println("订单数量"+sumStorenum);
        model.addAttribute("listStoreHouse",listStoreHouse);
        model.addAttribute("sumStorenum",sumStorenum);
        return "/back/backStoreHouseManage";
    }

    //编辑库存信息
    //进入编辑库存信息页面
    @RequestMapping("/backStoreHouseManageEdit")
    public String backStoreHouseManageEdit(int materialid, Model model){
        System.out.println("进入编辑库存信息界面...");
        System.out.println(materialid);
        //通过ID查询
        StoreHouse storeHouse=backStoreHouseService.findStoreHouseById(materialid);
        System.out.println(storeHouse);
        model.addAttribute("store",storeHouse);
        return "/back/backStoreHouseEdit";
    }

    //提交库存信息
    @RequestMapping("/DoEditStoreHouseInfo")
    public String DoEditStoreHouseInfo(StoreHouse storeHouse, Model model){
        System.out.println("编辑库存信息提交页面");
        backStoreHouseService.updateStoreHouse(storeHouse);
        System.out.println("更新库存信息");
        List<StoreHouse> listStoreHouse=backStoreHouseService.listStoreHouse();
        System.out.println("库存大致信息...");
        System.out.println(listStoreHouse);
        int sumStorenum=listStoreHouse.size();
        System.out.println("订单数量"+sumStorenum);
        model.addAttribute("listStoreHouse",listStoreHouse);
        model.addAttribute("sumStorenum",sumStorenum);
        return "/back/backStoreHouseManage";

    }

    //删除库存信息
    @RequestMapping("/backStoreHouseManageDelete")
    public String backStoreHouseManageDelete(int materialid,Model model){
        System.out.println("进行库存信息删除...");
        System.out.println(materialid);
        backStoreHouseService.deleteStoreHouse(materialid);
        List<StoreHouse> listStoreHouse=backStoreHouseService.listStoreHouse();
        System.out.println("库存大致信息...");
        System.out.println(listStoreHouse);
        int sumStorenum=listStoreHouse.size();
        System.out.println("库存数量"+sumStorenum);
        model.addAttribute("listStoreHouse",listStoreHouse);
        model.addAttribute("sumStorenum",sumStorenum);
        return "/back/backStoreHouseManage";
    }

    //搜索库存信息
    @RequestMapping(value="/backStoreHouseSearch",method= RequestMethod.POST)
    public String backStoreHouseSearch(String store,Model model){
        System.out.println("显示库存信息"+store);
        List<StoreHouse> listStoreHouse=backStoreHouseService.SearchStoreHouse(store);
        System.out.println("显示...");
        System.out.println("库存大致信息...");
        System.out.println(listStoreHouse);
        int sumStorenum=listStoreHouse.size();
        System.out.println("库存数量"+sumStorenum);
        model.addAttribute("listStoreHouse",listStoreHouse);
        model.addAttribute("sumStorenum",sumStorenum);
        return "/back/backStoreHouseManage";
    }


    /*~~~~~~~~~~~~~~~~~~~~`~~~~~~~~~~菜品管理~~~~~~~~~~~~~~~~~~~~~~~~~~`~~~~~~*/
    //后台显示菜品
    @RequestMapping("/backDishManage")
    public String backDishManage(Model model){
        System.out.println("进入菜品列表");
        List<Dish> listDish=backDishService.listDish();
        System.out.println(listDish);
        int sumDishnum=listDish.size();
        model.addAttribute("listDish",listDish);
        model.addAttribute("sumDishnum",sumDishnum);
        return "/back/backDishManage";
    }

    //后台编辑菜品
    @RequestMapping("/backDishEdit")
    public String backDishEdit(int dishid,Model model){
        System.out.println("进入编辑菜品信息界面...");
        System.out.println(dishid);
        Dish dishinfo= backDishService.findDishById(dishid);
        System.out.println(dishinfo);
        model.addAttribute("dishinfo",dishinfo);
        return "/back/backDishEdit";
    }

   //提交菜品信息
    @RequestMapping("/DoEditDish")
    public String DoEditDish(Dish dish,Model model){
        System.out.println("编辑菜品信息提交");
        backDishService.updateDish(dish);
        System.out.println("更新了菜品！");
        List<Dish> listDish=backDishService.listDish();
        System.out.println(listDish);
        int sumDishnum=listDish.size();
        model.addAttribute("listDish",listDish);
        model.addAttribute("sumDishnum",sumDishnum);
        return "/back/backDishManage";
    }

    //后台添加菜品
    @RequestMapping("/backDishAdd")
    public String backDishAdd(){
        System.out.println("进入菜品添加界面...");
        return "/back/backDishAdd";
    }
    //后台提交添加的菜品
    @RequestMapping("/DoAddDish")
    public String DoAddDish(Dish dish, Model model){
        Dish dish1=backDishService.findDishById(dish.getDishid());
        if(dish1!=null){
            System.out.println("已经存在该ID！不可以再添加！");
            return "/back/backDishAdd";
        }
        Dish dish2=backDishService.findDishByName(dish.getDishname());
        if(dish2!=null){
            System.out.println("已经存在该名称！不可以再添加！");
            return "/back/backDishAdd";
        }
        System.out.println(backDishService.insertDish(dish));
        List<Dish> listDish=backDishService.listDish();
        System.out.println(listDish);
        int sumDishnum=listDish.size();
        model.addAttribute("listDish",listDish);
        model.addAttribute("sumDishnum",sumDishnum);
        return "/back/backDishManage";
    }
    //后台删除菜品
    @RequestMapping("/backDishDelete")
    public String backDishDelete(int dishid,Model model){
        System.out.println("进行菜品信息删除...");
        System.out.println(dishid);
        backDishService.deleteDish(dishid);
        //List Dish
        List<Dish> listDish=backDishService.listDish();
        System.out.println(listDish);
        int sumDishnum=listDish.size();
        model.addAttribute("listDish",listDish);
        model.addAttribute("sumDishnum",sumDishnum);
        return "/back/backDishManage";

    }

    //后台模糊搜索菜品信息
    @RequestMapping(value = "/backDishSearch",method = RequestMethod.POST)
    public String backDishSearch(String dish,Model model){
        System.out.println("显示菜品信息"+dish);
        List<Dish> listDish=backDishService.searchDish(dish);
        System.out.println(listDish);
        int sumDishnum=listDish.size();
        model.addAttribute("listDish",listDish);
        model.addAttribute("sumDishnum",sumDishnum);
        return "/back/backDishManage";
    }


}
