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
    <TITLE>管理员管理--管理员列表</TITLE>
    <link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css" />
    <link rel="stylesheet" type="text/css" href="css/common.css"/>
    <link rel="stylesheet" type="text/css" href="css/table.css"/>
    <link rel="stylesheet" type="text/css" href="css/button.css"/>
</head>
<body>
<nav class="homepage">首页
    <span class="classic">&gt;</span> 管理员管理
    <span class="classic">&gt;</span> 管理员列表
    <a class="button btn-succeed" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新"><i class="Hui-iconfont"></i></a>
</nav>
<div class="text-c">
    <input type="text"  name=""  placeholder="请输入管理员号" style="width:250px" class="input-text">
    <button name=""  class="buttons btn-success" type="submit"><i class="Hui-iconfont"></i>搜管理员</button>
</div>
<div class="page-container">
    <div class="text-c"></div>
    <div class="AddAdmin">
		<span class="add">
			<a href="<%=basepath%>backAdminListManageAdd.action" onclick="addAdmin()" class="btn"><i class="Hui-iconfont"></i>添加管理员</a></span>
        <span class="dataAll">共有数据：<strong><%=session.getAttribute("sumAdminnum") %></strong>  条</span>
    </div>

    <div class="MidBody">
        <div  class="dataTables_footer">
            <table class="tables"  role="grid" aria-describedby="DataTables_info">
                <thead>
                <tr class="text-c" role="row">
                    <th class="role" scope="col" colspan="100%">员工列表</th>
                </tr>
                <tr class="text-c" role="row">
                    <th class="sorting" style="width: 10%;"><input type="checkbox" name="" value=""></th>
                    <th class="sorting" aria-label="ID" style="width:10%;">ID</th>
                    <th class="sorting" aria-label="登录名" style="width: 15%;">登录名</th>
                    <th class="sorting" aria-label="手机" style="width: 10%;">手机</th>
                    <th class="sorting" aria-label="邮箱" style="width:20%;">邮箱</th>
                    <th class="sorting" aria-label="角色" style="width:15%;">角色</th>
                    <th class="sorting" aria-label="状态" style="width:10%;">是否已启用</th>
                    <th class="sorting" aria-label="操作" style="width:20%;">操作</th>
                </tr>
                </thead>
                <tbody>
               <%-- <c:forEach items="${listAdminInfo}" var="admininfo" varStatus="loop">--%>
               <c:forEach items="${listAdminInfo}" var="admininfo" varStatus="loop">
                    <tr class="text-c" role="row">
                        <td class="box"><input type="checkbox" name="" value=""></td>
                        <td class="box">${admininfo.adminid}</td>
                        <td class="box">${admininfo.adminname}</td>
                        <td class="box">${admininfo.adminphone}</td>
                        <td class="box">${admininfo.adminmail}</td>
                        <td class="box">${admininfo.limits}</td>
                        <td class="box">已启用</td>
                        <td class="box">
                            <a style="text-decoration:none;color:#333;" href="<%=basepath%>backAdminListManageEdit.action?adminid=${admininfo.adminid}" title="编辑"><i class="Hui-iconfont"></i></a>
                            <a style="text-decoration:none;color:#333;" href="<%=basepath%>backAdminListManageDelete.action?adminid=${admininfo.adminid}" title="删除"><i class="Hui-iconfont"></i></a>
                        </td>
                    </tr>
                </c:forEach>

                </tbody>
            </table>
            <div class="dataTables_info" id="DataTables_info" role="status" aria-live="polite">显示 1 到 <%=session.getAttribute("sumAdminnum") %> ，共 <%=session.getAttribute("sumAdminnum") %> 条
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