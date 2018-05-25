<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
    String path =request.getContextPath();
    String basepath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <TITLE>单据管理</TITLE>
    <link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css" />
    <link rel="stylesheet" type="text/css" href="css/common.css"/>
    <link rel="stylesheet" type="text/css" href="css/table.css"/>
    <link rel="stylesheet" type="text/css" href="css/button.css"/>
</head>
<body>
<div class="text-c">
    <input type="text" name="" placeholder=" 单据号" style="width:250px" class="input-text">
    <button name=""  class="buttons btn-success" type="submit"><i class="Hui-iconfont"></i>搜单据</button>
</div>
<div class="page-container">
    <div class="text-c"></div>
    <div class="AddAdmin">
        <span class="dataAll">共有数据：<strong>${sumBillnum}</strong>  条</span>
    </div>
    <div class="MidBody">
        <div id="DataTables" class="dataTables_footer">
            <div class="dataTables_length" id="DataTables_length">
            </div>
            <table class="tables"  role="grid" aria-describedby="DataTables_info">
                <thead>
                <tr class="text-c" role="row">
                    <th class="sorting" style="width: 10%;"><input type="checkbox" name="" value=""></th>
                    <th class="sorting" aria-label="ID" style="width:15%;">单据编号</th>
                    <th class="sorting" aria-label="单据日期" style="width:15%;">单据日期</th>
                    <th class="sorting" aria-label="金额" style="width:15%;">金额</th>
                    <th class="sorting" aria-label="支付方式" style="width: 15%;">支付方式</th>
                    <th class="sorting" aria-label="桌号" style="width: 10%;">桌号</th>
                    <th class="sorting" aria-label="会员卡号" style="width: 10%;">会员卡号</th>
                    <th class="sorting" aria-label="操作" style="width:10%;">操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${listBill}" var="bill" varStatus="loop">
                    <tr class="text-c" role="row">
                        <td class="box"><input type="checkbox" name="" value=""></td>
                        <td class="box">${bill.billid}</td>
                        <td class="box">${bill.billdate}</td>
                        <td class="box">${bill.billmoney}</td>
                        <td class="box">${bill.paytype}</td>
                        <td class="box">${bill.deskid}</td>
                        <td class="box">${bill.vipid}</td>
                        <td class="box">
                            <a style="text-decoration:none;color:#333;" href="<%=basepath%>backBillInfoManage.action?billid=${bill.billid}" onclick="member_show('','<%=basepath%>backBillInfoManage.action?billid=${bill.billid}','10001','1000','400')">详情</a>
                            <a style="text-decoration:none;color:#333;" href="" title="删除"><i class="Hui-iconfont"></i></a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <div class="dataTables_info" id="DataTables_info" role="status" aria-live="polite">显示 1 到 ${sumBillnum} ，共 ${sumBillnum} 条
            </div>
            <div class="dataTables_paginate paging_numbers" id="DataTables_paginate">
                <a class="button previous" aria-controls="DataTables" data-dt-idx="0" tabindex="0" id="DataTables_previous">上一页
                </a>
                <span>
				<a class="button current" aria-controls="DataTables" data-dt-idx="1" tabindex="0">1</a>
			</span>
                <a class="button next" aria-controls="DataTables" data-dt-idx="2" tabindex="0" id="DataTables_next">下一页
                </a>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">
    /*用户-查看*/
    function member_show(title,url,id,w,h){
        layer_show(title,url,w,h);
    }
    /* function member_show(url,id,w,h){
         layer_show(url,w,h);
     }*/
</script>

</body>
</html>