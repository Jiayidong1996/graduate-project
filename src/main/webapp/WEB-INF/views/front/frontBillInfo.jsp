<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>

<%String path =request.getContextPath();
    String basepath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>账单界面</title>
    <style type="text/css">
        *{
            margin: 0px;
            padding: 0px;
        }
        .head
        {
            height: 140px;
            background-color: #8B5742;
        }
        .consumeInfo
        {
            height: 60px;
            padding: 10px;
            margin-left: 10px;
            width: 90%;
            background-color: #8B5742;
            /*background-color:#B8860B;*/
        }
        /*label的格式*/
        .consumeNum,.consumePrice,.Paid,.notPay,.consumenum,.consumeprice,.paid,.notpay{
            color: #fff;
            font-size: 14px;
            font-family:  "Microsoft Yahei","Hiragino Sans GB","Helvetica Neue",Helvetica,tahoma,arial,"WenQuanYi Micro Hei",Verdana,sans-serif,"\5B8B\4F53";
        }

        /*桌号显示框*/
        .desk
        {
            color:#fff;
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
            margin-top: 20px;
            font-family:  "Microsoft Yahei","Hiragino Sans GB","Helvetica Neue",Helvetica,tahoma,arial,"WenQuanYi Micro Hei",Verdana,sans-serif,"\5B8B\4F53";
        }
        .middle
        {
            width: 100%;
            background-color: #88BECC;
        }
        /*中部表格*/
        thead
        {
            display: table-header-group;
            vertical-align: middle;
            border-color: inherit;
        }
        .sorting
        {
            background-color: #88BECC;
            height: 30px;
        }

        .text-c
        {
            font-family:  "Microsoft Yahei","Hiragino Sans GB","Helvetica Neue",Helvetica,tahoma,arial,"WenQuanYi Micro Hei",Verdana,sans-serif,"\5B8B\4F53";
            text-align: center;
            background-color: #88BECC;

        }
        tbody
        {
            display: table-row-group;
            vertical-align: middle;
            border-color: inherit;
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
            height: 20px;
        }


        /*页脚部分*/
        .footer
        {
            position:absolute;
            height: 50px;
            left:0;
            right:0;
            bottom: 0px;
            background-color:#55AA77;
        }
        .Total
        {
            height: 40px;
            padding: 10px;
            margin-left: 10px;
            width: 90%;
        }
        .total
        {
            color:#fff;
            font-family:  "Microsoft Yahei","Hiragino Sans GB","Helvetica Neue",Helvetica,tahoma,arial,"WenQuanYi Micro Hei",Verdana,sans-serif,"\5B8B\4F53";
            font-size: 18px;
            margin-left: 40px;
        }
        .totalPrice
        {
            color:#FAFA5B;
            font-family:  "Microsoft Yahei","Hiragino Sans GB","Helvetica Neue",Helvetica,tahoma,arial,"WenQuanYi Micro Hei",Verdana,sans-serif,"\5B8B\4F53";
            font-size: 18px;
            margin-left: 40px;
        }
    </style>


</head>
<body>
<div class="head">
    <div class="consumeInfo">
        <!-- 这块到时候需要从数据库中读取数据 -->
        <label class="consumeNum">消费人数：</label><label class="consumenum">0</label><br>
        <label class="consumePrice">消费金额：</label><label class="consumeprice">0</label><br>
        <label class="Paid">当前桌位已收金额：</label><label class="paid">0</label><br>
        <label class="notPay">当前桌位未收金额：</label><label class="notpay">0</label><br>
    </div>
    <div class="deskID">
        <span class="desk">桌号</span>
        <input type="text"  name="" id="inputdesk" placeholder="餐桌号" style="width:250px" class="text">
    </div>
</div>

<div class="middle">
    <div class="middleContainer">
        <table class="tables" id="DataTables" role="grid" aria-describedby="DataTables_info">
            <thead>
            <tr class="text-c" role="row">
                <th class="sorting" aria-label="序号" style="width:15%;">序号</th>
                <th class="sorting" aria-label="品名" style="width: 30%;">品名</th>
                <th class="sorting" aria-label="数量" style="width: 8%;">数量</th>
                <th class="sorting" aria-label="金额" style="width:28%;">金额</th>
                <th class="sorting" aria-label="折扣" style="width:15px;">折扣</th>
            </tr>
            </thead>

            <tbody>
            <tr class="text-c" role="row">
                <td class="box">1</td>
                <td class="box">Admin</td>
                <td class="box">1300</td>
                <td class="box">admin</td>
                <td class="box">超级</td>

            </tr>
            </tbody>
        </table>
    </div>
</div>

<footer class="footer">
    <div class="Total">
        <span class="total">合计：</span>
        <label class="totalPrice">￥123.68</label>
    </div>
</footer>


</body>
</html>