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
    <TITLE>库存管理</TITLE>
    <link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css" />
    <style type="text/css">
        .Wdate
        {
            background: #fff;
        }
        /*头部*/
        .homepage
        {
            padding: 0 15px;
            background-color: #f5f5f5;
            position: relative;
            z-index: 99;
            border-bottom: 1px solid #e5e5e5;
            line-height: 39px;
            height: 39px;
            overflow: hidden;
        }
        .nav
        {
            display: block;
            margin: 0;
        }


        .btn-succeed
        {
            color: #fff;
            background-color: #5eb95e;
            border-color: #5eb95e;
        }
        .button
        {
            display: inline-block;
            box-sizing:border-box;
            cursor: pointer;
            text-align: center;
            font-weight: 400;
            white-space: nowrap;
            vertical-align: middle;
            border: solid 1px #ddd;
            width: auto;
            transition:background-color .1s linear;
            font-size: 16px;
            height: 36px;
            padding: 4px 12px;
            border-radius: 4px;
            float: right!important;
            text-decoration: none;
        }
        .input-text
        {
            box-sizing:border-box;
            border:solid 1px #ddd;
            transition:all .2s linear 0s;
            font-size: 18px;
            height: 31px;
            line-height: 1.42875;
            padding: 4px;
        }
        input
        {
            color:#333;
            -webkit-font-smoothing: antialiased;
            overflow: visible;
            vertical-align: middle;
            font-weight: inherit;
            font-style: inherit;
        }
        .btn-success
        {
            color: #fff;
            background-color:#5eb95e;
            border-color: #5eb95e;
        }
        .buttons
        {
            color: #fff;
            display: inline-block;
            box-sizing:border-box;
            cursor:pointer;
            text-align: center;
            font-weight: 400;
            white-space: nowrap;
            vertical-align: middle;
            border:solid 1px #ddd ;
            font-size: 16px;
            height: 36px;
            padding: 4px 12px;
            border-radius: 4px;
            text-decoration: none;
        }

        .AddAdmin
        {
            background-color: #f5fafe;
            border: solid 1px #eee;
            padding: 5px;
            margin-top: 20px;
            zoom:1;
            height: 38px;
        }
        .add
        {
            float: left!important;
        }
        .btn
        {
            line-height: 21px;
            background-color: #06c;
            border-color: #06c;
            color: #fff;
            display: inline-block;
            box-sizing:border-box;
            cursor:pointer;
            text-align: center;
            font-weight: 400;
            white-space: nowrap;
            vertical-align: middle;
            border:solid 1px #ddd ;
            font-size: 16px;
            height: 36px;
            padding: 4px 12px;
            border-radius: 4px;
            text-decoration: none;
        }
        .btn:hover
        {
            color: #fff;
            background-color: #0a6999;
            border-color: #0a6999;
        }
        .dataAll
        {
            float: right!important;
            zoom:1;
            text-align: center;
        }
        .dataTables_info,.dataTables_length,.btn,.buttons,.input,.dataAll,.text-c
        {
            font-family: "Microsoft Yahei","Hiragino Sans GB","Helvetica Neue",Helvetica,tahoma,arial,"WenQuanYi Micro Hei",Verdana,sans-serif,"\5B8B\4F53";
        }
        .paging_numbers,.input-text,.homepage
        {
            font-family: "Microsoft Yahei","Hiragino Sans GB","Helvetica Neue",Helvetica,tahoma,arial,"WenQuanYi Micro Hei",Verdana,sans-serif,"\5B8B\4F53";
        }
        /*中间大表格*/
        .MidBody
        {
            margin-top: 20px;
        }
        .dataTables_length
        {
            float: left;
            padding-bottom: 20px;
        }
        .tables
        {
            border-bottom: 0;
            border-collapse: separate;
            border-spacing: 0;
            clear: both;
            border: 1px solid #ddd;
            border-left: 0;
            border-top: 1px solid #ddd;
        }
        table
        {
            width:100%;
            empty-cells: show;
            background-color: transparent;
            border-collapse: collapse;
            border-spacing: 0;
        }
        /*表格主体*/
        /*表头*/
        thead
        {
            display: table-header-group;
            vertical-align: middle;
            border-color: inherit;
        }
        .text-c
        {
            text-align: center;
        }
        .sorting
        {
            background-color: #f5fafe;
            height :40px;
        }
        /*表身*/
        tbody
        {
            display: table-row-group;
            vertical-align: middle;
            border-color: inherit;
        }
        .text-c td,.text-c th
        {
            border-left: 1px solid #ddd;
            border-bottom: 1px solid #ddd;
        }
        .table td,.table th
        {
            padding: 8px;
            line-height: 20px;
            work-break:break-all;
        }
        td,th
        {
            font-size: 16px;
            font-family:  "Microsoft Yahei","Hiragino Sans GB","Helvetica Neue",Helvetica,tahoma,arial,"WenQuanYi Micro Hei",Verdana,sans-serif,"\5B8B\4F53";
            color:#333;
            -webkit-font-smoothing: antialiased;
            display: table-cell;
            vertical-align: inherit;
        }
        .box
        {
            background-color: white;
            height: 60px;
        }
        /*页脚部分*/
        .dataTables_info
        {
            clear: both;
            float: left;
            padding-top: 10px;
            font-size: 18px;
            color:#666;
        }
        .dataTables_paginate .button
        {
            border:1px solid #ccc;
            cursor: pointer;
            display: inline-block;
            margin-left: 2px;
            text-align: center;
            text-decoration: none;
            color: #666;
            height: 26px;
            margin: 14px 0 6px 6px;
            padding: 0 10px;
            font-size: 18px;
            float: right!important;
        }
        .current
        {
            background:#5a98de;
            color: #fff;
        }
    </style>
</head>
<body>
<nav class="homepage">首页
    <span class="classic">&gt;</span> 库存管理
    <span class="classic">&gt;</span> 库存列表
    <a class="button btn-succeed" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新"><i class="Hui-iconfont"></i></a>
</nav>

    <div class="text-c">
        <form action="<%=basepath%>backStoreHouseSearch.action" method="post">
            <input type="text" name="store" placeholder=" 库存信息" style="width:250px" class="input-text">
            <button name=""  href="" class="buttons btn-success" type="submit"><i class="Hui-iconfont"></i>搜库存信息</button>
        </form>
       </div>


<div class="page-container">
    <div class="text-c"></div>
    <div class="AddAdmin">
		<span class="add">
			<a href="<%=basepath%>backStoreHouseManageAdd.action" onclick="addAdmin()" class="btn"><i class="Hui-iconfont"></i>添加库存</a></span>
        <span class="dataAll">共有数据：<strong>${sumStorenum}</strong> 条</span>
    </div>
    <div class="MidBody">
        <div id="DataTables" class="dataTables_footer">
            <div class="dataTables_length" id="DataTables_length">

            </div>
            <table class="tables" id="DataTables" role="grid" aria-describedby="DataTables_info">
                <thead>
                <tr class="text-c" role="row">
                    <th class="sorting" style="width: 10%;"><input type="checkbox" name="" value=""></th>
                    <th class="sorting" aria-label="ID" style="width:30%;">原材料编号</th>
                    <th class="sorting" aria-label="订单日期" style="width: 20%;">原材料名称</th>
                    <th class="sorting" aria-label="订单总额" style="width: 20%;">库存</th>
                    <th class="sorting" aria-label="操作" style="width:20%;">操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${listStoreHouse}" var="store" varStatus="loop">
                    <tr class="text-c" role="row">
                        <td class="box"><input type="checkbox" name="" value=""></td>
                        <td class="box">${store.materialid}</td>
                        <td class="box">${store.materialname}</td>
                        <td class="box">${store.materialsurplus}</td>
                        <td class="box">
                            <a style="text-decoration:none;color:#333;" href="<%=basepath%>backStoreHouseManageEdit.action?materialid=${store.materialid}" title="编辑"><i class="Hui-iconfont"></i></a>
                            <a style="text-decoration:none;color:#333;" href="<%=basepath%>backStoreHouseManageDelete.action?materialid=${store.materialid }" title="删除"><i class="Hui-iconfont"></i></a>
                        </td>
                    </tr>
                </c:forEach>
                <tr class="text-c" role="row">
                    <td class="box"><input name="" type="checkbox" value=""></td>
                    <td class="box">0001</td>
                    <td class="box">2018-05-01</td>
                    <td class="box">$1000</td>
                    <td class="box">

                        <a style="text-decoration:none;color:#333;" href="javascript:;" title="编辑"><i class="Hui-iconfont"></i></a>
                        <a style="text-decoration:none;color:#333;" href="javascript:;" title="删除"><i class="Hui-iconfont"></i></a>
                    </td>
                </tr>
                </tbody>
            </table>
            <div class="dataTables_info" id="DataTables_info" role="status" aria-live="polite">显示 1 到 ${sumStorenum} ，共 ${sumStorenum} 条
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