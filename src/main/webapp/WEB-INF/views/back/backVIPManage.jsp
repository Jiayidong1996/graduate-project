<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
    String path =request.getContextPath();
    String basepath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%--<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <TITLE>会员管理</TITLE>
    <link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css" />
    <link rel="stylesheet" type="text/css" href="css/common.css"/>
    <link rel="stylesheet" type="text/css" href="css/table.css"/>
    <link rel="stylesheet" type="text/css" href="css/button.css"/>
</head>
<body>
<nav class="homepage">首页
    <span class="classic">&gt;</span> 会员管理
    <span class="classic">&gt;</span> 会员列表
    <a class="button btn-succeed" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新"><i class="Hui-iconfont"></i></a>
</nav>
<div class="text-c">
    <input type="text" name=""  placeholder="会员号" style="width:250px" class="input-text">
    <button name=""  class="buttons btn-success" type="submit"><i class="Hui-iconfont"></i>搜会员</button>
</div>
<div class="page-container">
    <div class="text-c"></div>

    <div class="AddAdmin">
		<span class="add">
			<a href="<%=basepath%>backVIPManageAdd.action" onclick="addAdmin()" class="btn"><i class="Hui-iconfont"></i>添加会员</a></span>
        <span class="dataAll">共有数据：<strong>${sumVIPnum}</strong> 条</span>
    </div>

    <div class="MidBody">
        <div id="DataTables" class="dataTables_footer">
            <table class="tables"  role="grid" aria-describedby="DataTables_info">
                <thead>
                <tr class="text-c" role="row">
                    <th class="sorting" style="width: 10%;"><input type="checkbox" name="" value=""></th>
                    <th class="sorting" aria-label="ID" style="width:10%;">会员ID</th>
                    <th class="sorting" aria-label="会员名" style="width: 10%;">会员名</th>
                    <th class="sorting" aria-label="手机" style="width: 10%;">手机</th>
                    <th class="sorting" aria-label="账户余额" style="width:10%;">账户余额</th>
                    <th class="sorting" aria-label="折扣" style="width:10%;">折扣</th>
                    <th class="sorting" aria-label="生日" style="width:15%;">生日</th>
                    <th class="sorting" aria-label="地址" style="width:15%;">地址</th>
                    <th class="sorting" aria-label="操作" style="width:20%;">操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${listVIP}" var="vip" varStatus="loop">
                    <tr class="text-c" role="row">
                        <td class="box"><input type="checkbox" name="" value=""></td>
                        <td class="box">${vip.vipid}</td>
                        <td class="box">${vip.vipname}</td>
                        <td class="box">${vip.vipphone}</td>
                        <td class="box">${vip.vipbalance}</td>
                        <td class="box">${vip.vipdiscount}</td>
                        <td class="box">${vip.vipaddress}</td>
                        <td class="box">${vip.vipbirth}</td>
                        <td class="box">
                            <a style="text-decoration:none;color:#333;" href="<%=basepath%>backVIPManageEdit.action?vipid=${vip.vipid}" title="编辑"><i class="Hui-iconfont"></i></a>
                            <a style="text-decoration:none;color:#333;" href="<%=basepath%>backVIPManageDelete.action?vipid=${vip.vipid}" title="删除"><i class="Hui-iconfont"></i></a>
                        </td>
                    </tr>
                </c:forEach>
                <tr class="text-c" role="row">
                    <td class="box"><input name="" type="checkbox" value=""></td>
                    <td class="box">20180001</td>
                    <td class="box">张伟</td>
                    <td class="box">18888888888</td>
                    <td class="box">$200</td>
                    <td class="box">0.88</td>
                    <td class="box">8月15号</td>
                    <td class="box">贝克街221号</td>
                    <td class="box">
                        <a style="text-decoration:none;color:#333;" href="<%=basepath%>backVIPManageEdit.action?vipid=${vip.vipid}" title="编辑"><i class="Hui-iconfont"></i></a>
                        <a style="text-decoration:none;color:#333;" href="<%=basepath%>backVIPManageDelete.action?vipid=${vip.vipid}" title="删除"><i class="Hui-iconfont"></i></a>
                    </td>
                </tr>
                </tbody>
            </table>
            <div class="dataTables_info" id="DataTables_info" role="status" aria-live="polite">显示 1 到 ${sumVIPnum} ，共 ${sumVIPnum} 条
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

</body>
</html>