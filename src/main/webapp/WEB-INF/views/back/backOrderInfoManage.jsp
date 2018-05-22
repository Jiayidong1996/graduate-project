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

    <link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css" />

    <!--日期相关-->



    <title>订单详情页面 </title>
    <style type="text/css">
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
        .sorting,.role
        {
            background-color: #f5fafe;
            height :40px;
            text-align: center;
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
        .title{
            font-family:  "Microsoft Yahei","Hiragino Sans GB","Helvetica Neue",Helvetica,tahoma,arial,"WenQuanYi Micro Hei",Verdana,sans-serif,"\5B8B\4F53";
            font-size: 18px;
        }


    </style>
</head>
<body>
<div class="title">
    <h3>订单详情</h3>

</div>
<div class="MidBody">
    <div id="DataTables" class="dataTables_footer">
        <table class="tables" id="DataTables" role="grid" aria-describedby="DataTables_info">
            <thead>

            <tr class="text-c" role="row">
                <th class="sorting" style="width: 10%;"><input type="checkbox" name="" value=""></th>
                <th class="sorting" aria-label="订单ID" style="width:20%;">订单ID</th>
                <th class="sorting" aria-label="原材料ID" style="width: 20%;">原材料ID</th>
                <th class="sorting" aria-label="名称" style="width: 20%;">名称</th>
                <th class="sorting" aria-label="单价" style="width:10%;">单价</th>
                <th class="sorting" aria-label="数量" style="width:10%;">数量</th>
                <th class="sorting" aria-label="操作" style="width:10%;">操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${ListOrderInfo}" var="orderinfo" varStatus="loop">
                <tr class="text-c" role="row">
                    <td class="box"><input type="checkbox" name="" value=""></td>
                    <td class="box">${orderinfo.orderid}</td>
                    <td class="box">${orderinfo.materiaid}</td>
                    <td class="box">${orderinfo.materianame}</td>
                    <td class="box">${orderinfo.materiaprice}</td>
                    <td class="box">${orderinfo.materianum}</td>
                    <td class="box">
                        <a style="text-decoration:none;color:#333;" href="" title="删除"><i class="Hui-iconfont"></i></a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

    </div>
</div>


</body>
</html>