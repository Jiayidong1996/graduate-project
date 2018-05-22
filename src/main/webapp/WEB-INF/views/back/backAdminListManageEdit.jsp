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
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />

    <link rel="stylesheet" type="text/css" href="css/H-ui.min.css" />
    <title>编辑管理员列表 </title>
    <style type="text/css">
        .input-text
        {
            width: 80%;
        }
    </style>
</head>
<body>
<div>
    <h3>编辑管理员</h3>

</div>

<article class="page-container">
    <form class="form form-horizontal" id="form-admin-add" action="<%=basepath%>backDoAdminListManageEdit.action">
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>管理员ID：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text"  placeholder="" value="${adminInfo.adminid}" name="adminid" required>
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>管理员密码：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" autocomplete="off" value="${adminInfo.adminpass}"  name="adminpass" required>
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>角色名：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" autocomplete="off" value="${adminInfo.adminname}"  name="adminname" required>
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>真实姓名：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text"  placeholder="" value="${adminInfo.truename}" name="truename" required>
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red"></span>管理员电话：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text"  placeholder="" value="${adminInfo.adminphone}"  name="adminphone" >
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red"></span>管理员邮箱：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text"  placeholder="" value="${adminInfo.adminmail}"  name="adminmail">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red"></span>管理员地址：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text"  placeholder="" value="${adminInfo.adminaddress}"  name="adminaddress" >
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red"></span>管理员薪水：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text"  placeholder="" value="${adminInfo.adminsalary}" id="adminsalary" name="adminsalary">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>管理员权限：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text"  placeholder="" value="${adminInfo.limits}"  name="limits" required>
            </div>
        </div>

        <div class="row cl">
            <div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
                <input class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;修改&nbsp;&nbsp;">
            </div>
        </div>
    </form>
</article>

</body>
</html>