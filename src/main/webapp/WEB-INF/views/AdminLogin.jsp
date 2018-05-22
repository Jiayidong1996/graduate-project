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
    <TITLE>管理员登录界面</TITLE>
    <link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css" />
    <style type="text/css">
        body
        {
            font-family:  "Microsoft Yahei","Hiragino Sans GB","Helvetica Neue",Helvetica,tahoma,arial,"WenQuanYi Micro Hei",Verdana,sans-serif,"\5B8B\4F53";
            background-color: #333;
        }
        /*header*/
        .header
        {
            width: 100%;/*
		height: 4px;*/
            background: #0dbfdd;
        }

        /*content*/
        .content
        {
            width:28%;
            margin:70px auto 0;
            text-align: center;
        }


        .content-title
        {
            margin: 10px 0 25px 0;
            font-size: 2em;
            color: #747474;
            font-weight: normal;
        }
        .content-form
        {
            width: 100%;
            padding: 36px 0 20px;
            border: 1px solid #333;
            text-align: center;
            /*background: #fff;*/
            background-color: #333;
        }
        /*这边不是太懂*/
        .content-form form div
        {
            margin-bottom: 19px;
        }
        .content-form form .text,.content-form form .password
        {
            width: 77%;
            height: 20px;
            padding: 10px;
            font-size: 1em;
            border: 1px solid  #cccbcb;
            /*border-radius: 7px;*/
            letter-spacing: 1px;
            font-family:  "Microsoft Yahei","Hiragino Sans GB","Helvetica Neue",Helvetica,tahoma,arial,"WenQuanYi Micro Hei",Verdana,sans-serif,"\5B8B\4F53";
        }

        .content-form form input:focus
        {
            outline: none;
            -webkit-box-shadow: 0 0 5px #0dbfdd;
            box-shadow: 0 0 5px #0dbfdd;
        }
        .content-form-signup
        {
            width: 100%;
            margin: 0 auto;
            padding: 10px;
            border: 1px solid  #556B2F;
            /*border-radius: 7px;*/
            font-size: 1em;
            font-weight: bold;
            color: #fff;
            background: #556B2F;
            cursor: pointer;
            font-family:  "Microsoft Yahei","Hiragino Sans GB","Helvetica Neue",Helvetica,tahoma,arial,"WenQuanYi Micro Hei",Verdana,sans-serif,"\5B8B\4F53";
        }
        .content-form-signup:hover
        {
            background: #333300;
            border: 1px solid  #333300;
        }
        .content-form-signup:focus
        {
            outline: none;
            border: 1px solid #0cb3d0;
        }
        .content-login-description
        {
            margin-top: 25px;
            line-height:1.63636364;
            color:#747474;
            font-size:.91666667rem;
        }
        .content-login-link
        {
            font-size: 16px;
            color: #0dbfdd;
            text-decoration: none;
        }

        /*输入框无内容便提示*/
        #remind_1,#remind_2
        {
            width: 76%;
            margin: 0 auto 2px ;
            text-align: left;
            font-size: 2em;
            color:#f00;
        }
        .change_margin_1
        {
            margin: 0 auto;
            text-align: center;
            font-size: 14px;
        }
        .icon
        {
            padding: 10px 10px;
            color: #fff;
            width: 30px;
            display: inline-block;
            background-color: #B8860B;
        }

    </style>

</head>
<body>
<header>
    <div class="header"></div>
</header>
<div class="content">
    <h1 class="content-title">登录</h1>
    <div class="content-form">
        <form method="post" action="<%=basepath%>AdminIndex.action" onsubmit="return submitTest()" >
            <div id="change_margin_1">
                <span class="icon"><i class="Hui-iconfont">&#xe60d;</i></span>
                <input class="text" type="text" name="adminid" autocomplete="off" placeholder="请输入用户名" reqired onblur="oBlur_1()" onfocus="oFocus_1() ">
            </div>
            <!-- input的value为空时弹出提醒 -->
            <p id="remind_1"></p>
            <div id="change_margin_2">
                <span class="icon"><i class="Hui-iconfont">&#xe60e;</i></span>
                <input class="password" type="password" name="adminpassword" autocomplete="off" placeholder="请输入密码" reqired onblur="oBlur_2()" onfocus="oFocus_2()">
            </div>

            <!-- input的value为空时弹出提醒 -->
            <p id="remind_2"></p>
            <div id="change_margin_3">
                <input class="content-form-signup" type="submit" value="&nbsp;&nbsp;登录&nbsp;&nbsp;">
            </div>
        </form>
    </div>
</div>
</body>
</html>