<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%String path =request.getContextPath();
    String basepath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />

    <link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css" />
    <link rel="stylesheet" type="text/css" href="css/common.css"/>
    <link rel="stylesheet" type="text/css" href="css/table.css"/>
    <link rel="stylesheet" type="text/css" href="css/button.css"/>


    <title>开台点菜</title>
    <style type="text/css">

        *{
            font-family:  "Microsoft Yahei","Hiragino Sans GB","Helvetica Neue",Helvetica,tahoma,arial,"WenQuanYi Micro Hei",Verdana,sans-serif,"\5B8B\4F53";
            font-size: 18px;
        }
        /*桌号显示框*/
        .desk
        {
            color:#333;
            font-family:  "Microsoft Yahei","Hiragino Sans GB","Helvetica Neue",Helvetica,tahoma,arial,"WenQuanYi Micro Hei",Verdana,sans-serif,"\5B8B\4F53";
            font-size: 18px;
            margin-left: 50px;
        }
        .text
        {
            box-sizing:border-box;
            border:solid 1px #ddd;
            transition:all .2s linear 0s;
            font-size: 18px;
            height: 31px;
            line-height: 1.42875;
            padding: 4px;
            margin-top: 0px;
            font-family:  "Microsoft Yahei","Hiragino Sans GB","Helvetica Neue",Helvetica,tahoma,arial,"WenQuanYi Micro Hei",Verdana,sans-serif,"\5B8B\4F53";
        }
        /*按钮*/
        .btn
        {
            display: inline-block;
            box-sizing: border-box;
            cursor: pointer;
            text-align: center;
            font-weight: 400;
            white-space: nowrap;
            vertical-align: middle;
            border: solid 1px #ddd;
            width: auto;
            -o-transition: background-color .1s linear;
            transition: background-color .1s linear;
            padding: 4px 12px;
            margin: 4px;
            font-size: 14px;
            height: 31px;
            width: 60px;
            line-height: 1.42857;
            padding: 4px;

        }
        .radius
        {
            border-radius: 4px;
        }
        .btn-order
        {
            color: #fff;
            background-color: #5a98de;
            border-color: #5a98de;
        }
        .btn-order:hover
        {
            color: #fff;
            background-color:#0a6999;
            border-color: #0a6999;
        }


    </style>
</head>
<body>
<div class="title">
    <h3>开台点菜</h3>
</div>
<div class="deskID">
    <span class="desk">桌号</span>
    <input type="text" value="${deskId}" readonly="readonly" name="deskId" id="inputdesk" style="width:250px" class="text">
</div>
<div class="MidBody">
    <div id="DataTables" class="dataTables_footer">
        <table class="tables" role="grid" aria-describedby="DataTables_info">
            <thead>

            <tr class="text-c" role="row">
                <th class="sorting" aria-label="菜品ID" style="width:20%;">菜品ID</th>
                <th class="sorting" aria-label="菜品名称" style="width: 20%;">菜品名称</th>
                <th class="sorting" aria-label="单价" style="width: 10%;">单价</th>
                <th class="sorting" aria-label="数量" style="width:20%;">数量</th>
                <th class="sorting" aria-label="操作" style="width:10%;">操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${listDish}" var="dishinfo" varStatus="loop">
                <tr class="text-c" role="row">
                    <td class="box">${dishinfo.dishid}</td>
                    <td class="box">${dishinfo.dishname}</td>
                    <td class="box">${dishinfo.dishprice}</td>
                    <td class="box">
                        <input type="button" value="-" style="width: 30px; text-align: center;" onclick="deleteOne()" />
                        <input type="text" style="width: 60px; text-align: center;" id="num" value="1" name="dishnum">
                        <input type="button" value="+" style="width: 30px; text-align: center;" onclick="addOne()" />
                    </td>
                    <td class="box">
                       <a style="text-decoration:none;color:#333;" href="<%=basepath%>frontOpenTableAdd.action?dishid=${dishinfo.dishid}&deskId=${deskId}&dishnum=1" title="添加">
                            <input class="btn btn-order radius" type="button" value="添加"><%--=document.getElementById('num').value--%>
                       </a>
                    </td>
                </tr>
            </c:forEach>
            <tr class="text-c" role="row">
                <td class="box">1</td>
                <td class="box">鱼香肉丝</td>
                <td class="box">13</td>
                <td class="box">
                    <input type="button" value="-" style="width: 30px; text-align: center;" onclick="deleteOne()" />
                    <input type="text" style="width: 60px; text-align: center;" id="num" value="1" name="">
                    <input type="button" value="+" style="width: 30px; text-align: center;" onclick="addOne()" />
                </td>
                <td class="box">
                    <a style="text-decoration:none;color:#333;" href="" title="添加"><input class="btn btn-order radius" type="button" value="添加"></a>
                </td>
            </tr>
            </tbody>
        </table>

    </div>
</div>

<script src="http://cdn.static.runoob.com/libs/jquery/1.10.2/jquery.min.js"></script>
<script type="text/javascript">

    /*添加num*/
    function addOne() {
        var num = document.getElementById("num");
        num.value = parseInt(num.value) + 1;
    }

    /*减少num*/
    function deleteOne() {
        var num = document.getElementById("num");
        if(num.value==1){
            alert("不可以再减少了！")
        }
        else{
            num.value = parseInt(num.value) - 1;
        }
    }

    /*提交数据*/
   function Tijiao(${dishinfo.dishid},num) {
        var num = document.getElementById("num");
        alert(${dishinfo.dishid});
        window.location.href='<%=path%>/frontOpenTableAdd?dishid'+${dishinfo.dishid};
    }

</script>

</body>
</html>