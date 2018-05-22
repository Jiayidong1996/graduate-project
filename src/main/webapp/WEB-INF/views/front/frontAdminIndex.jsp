<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%String path =request.getContextPath();
    String basepath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>前台主界面</title>
    <!--图标用-->
    <link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css" />
    <link rel="stylesheet" type="text/css" href="css/index.css">
    <style type="text/css">


        .aside-left{
            position: absolute;
            top:60px;
            left: 0px;
            /*padding-top: 10px;*/
            width: 100px;
            z-index: 0;
            overflow: hidden;
            background-color: #fff;
            border-right:1px solid rgba(238,238,238,0.98);
            height: 90%;
        }

        .aside-right{
            position: absolute;
            top:60px;
            right:0px;
            bottom:0px;
            left: 105px;
            z-index: 0;
            overflow: auto;
            /*background-color:#fff;*/
            background-color: rgba(238,238,238,0.98);
        }

        /*按钮风格*/
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
        }
        .btn
        {
            padding: 4px 12px;
            margin: 6px;
        }
        .input-text, .btn
        {
            font-size: 16px;
            height: 60px;
            width: 88px;
            line-height: 1.42857;
            padding: 4px;

        }
        .radius
        {
            border-radius: 4px;
        }
        .btn-all,.btn-two,.btn-four,.btn-six,.btn-room
        {
            color: #fff;
            background-color: #5a98de;
            border-color: #5a98de;
        }
        .btn-all:focus,.btn-two:focus,.btn-four:focus,.btn-six:focus,.btn-room:focus
        {
            color: #fff;
            background-color:#0a6999;
            border-color: #0a6999;
        }

    </style>
</head>
<body>
<header class="header">
    <div  class="headerbox">
        <div class="brand">
            <span><i class="Hui-iconfont"></i>山海餐饮管理前台</span>
        </div>
        <div class="Info">
            <div class="topmenu">
                <ul class="headermenu" >
                    <li><a href="#">Admin&gt;</a>
                        <ul class="subheadermenu">
                            <li><a href="<%=basepath%>back_ChangeAccount.action" target="showPage">切换账号</a> </li>
                            <li><a href="<%=basepath%>back_OutIndex.action">安全退出</a> </li>
                        </ul>
                    </li>
                </ul>
            </div>
            <!-- <h4>普通管理员:<%=session.getAttribute("AdminIdentity") %></h4>  -->
            <h4>普通管理员</h4>
        </div>
    </div>
</header>
<div class=contain>
    <div class="aside-left">
        <ul class="menu">
            <input class="btn btn-all radius"  autofocus="yes"  type="button" value="全部餐桌">
            <input class="btn btn-two radius" type="button" value="二人座">
            <input class="btn btn-four radius" type="button" value="四人座">
            <input class="btn btn-six radius" type="button" value="六人座">
            <input class="btn btn-room radius" type="button" value="包间">
        </ul>
    </div>


    <div class="aside-right">
        <!-- 关于滚动条的一些设置 -->
        <!-- scrolling="no" 无滚动条 -->
        <!-- scrolling="yes" 或者 scrolling="auto" 有滚动条 -->
        <iframe name="showPage" scrolling="no" frameborder="0"  width=100%  height=99%  src="<%=basepath%>frontAdminIndexContainer.action">
            <a href=""></a>
        </iframe>
    </div>
</div>


<!--联网情况下用-->
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script type="text/javascript">
    $(function () {
        $(".menu>li>a").click(function () {
            $(this).next(".submenu").toggle("1s").
            parent().siblings().children(".submenu").hide();

        });
        $(".headermenu>li>a").click(function () {
            $(this).next(".subheadermenu").toggle("1s");
        });
    });


</script>
<script>

    function changepage(id,url){
        $(id).attr("src",url);
    }
</script>

</body>
</html>
