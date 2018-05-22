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

    <title>修改库存信息 </title>
    <style type="text/css">
        .input-text
        {
            width: 80%;
        }
        .select
        {
            width: 80%;
            font-size: 14px;
            height: 31px;
            line-height: 1.42857;
            padding: 4px;
        }

    </style>
</head>
<body>
<div >
    <h3>修改库存</h3>

</div>

<article class="page-container">
    <form class="form form-horizontal" id="form-admin-add" action="${basepath }DoEditStoreHouseInfo.action">

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>原材料ID：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" readonly="readonly" class="input-text" value="${store.materialid}" placeholder="请输入原材料ID"  name="materialid" required>
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>原材料名称：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" readonly="readonly" class="input-text" autocomplete="off" value="${store.materialname}" placeholder="请输入原材料名称"  name="materialname" required>
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>库存量：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" autocomplete="off"  value="${store.materialsurplus}" name="materialsurplus" required>
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