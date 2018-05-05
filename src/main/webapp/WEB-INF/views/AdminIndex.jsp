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
    <title>后台主界面</title>
    <style>
        *{
            margin:0;
            padding:0;
            font-family:  "Microsoft Yahei","Hiragino Sans GB","Helvetica Neue",Helvetica,tahoma,arial,"WenQuanYi Micro Hei",Verdana,sans-serif,"\5B8B\4F53";
        }

        .header{
            width:100%;
            height:50px;
            background: #556B2F;
            /* color:#ccffcc;*/
            color:   #EEE685;
            font-family:  "Microsoft Yahei","Hiragino Sans GB","Helvetica Neue",Helvetica,tahoma,arial,"WenQuanYi Micro Hei",Verdana,sans-serif,"\5B8B\4F53";
        }
        .brand{
            position: absolute;
            top:20px;
            left: 20px;

            font-size:16px;
        }

        .Info{
            position: absolute;
            top:20px;
            right: 10px;
            z-index: 2;

            font-size:16px;
        }
        .Info h4{
            float: right;
        }
        .topmenu{
            float: right;
        }
        .headermenu{
            width:100px;
            margin:0 40px;
            line-height: 30px;
        }
        .headermenu li{
            /* 去除小标点 */
            list-style:none;
            margin: 0px;
            background:#556B2F;
            color:#336633;
        }

        /*头部信息菜单栏条目*/
        .headermenu li a{
            /* 取出下划线 */
            text-decoration:none;
            display:block;  /* 块级元素 */
            color: #EEE685;
            border-bottom:2px solid #ccffcc;
            height:30px;
            font-size:18px;
            padding-right:20px;
        }
        /*头部子菜单*/
        .subheadermenu{
            /*不占位隐藏*/
            display: none;
        }
        .subheadermenu li a{
            background:#cccc33;
            border:1px;
            border:solid;
            border: #336633;
            padding-right:20px;
            /*color:#1111cc;*/
            color:#556B2F;
        }
        .subheadermenu li a:hover{
            background: #B8860B;
        }


        .aside-left{
            position: absolute;
            top:60px;
            left: 0px;
            padding-top: 10px;
            width: 200px;
            z-index: 0;
            overflow: auto;
            /*background: rgba(238,238,238,0.98);*/
            background: #cccc33;
            border-right:1px solid #e5e5e5;
        }

        .aside-right{
            position: absolute;
            top:60px;
            right:0px;
            bottom:0px;
            left: 222px;
            z-index: 0;
            overflow: auto;
            background-color:#fff;
        }


        /* 功能菜单宽度*/
        .menu{
            width:200px;
        }

        /*功能菜单 条目设置*/
        .menu li{
            /* 去除小标点 */
            list-style:none;
            background:rgba(255,255,255,0.2);
            color:#000;
        }

        /*功能条目链接设置*/
        .menu li a{
            /* 取出下划线 */
            text-decoration:none;
            display:block;  /* 块级元素 */
            color:#556B2F;
            border-bottom:2px solid #ccffcc;
            height:40px;
            font-size:18px;
            padding-left:10px;
            line-height:40px;
        }

        /*子功能条目设置*/
        .submenu{
            /* 不占位隐藏 */
            display:none;
        }
        .submenu li a{
            background:#EEE685;
            border:1px;
            border:solid;
            border: #336633;
            padding-left:20px;
            color:#339900;
        }
        .menu li a:hover{
            /* background:#006666;*/
            background:#B8860B;
        }

        .show_iframe{
            position: absolute;
            top:0;
            right:0;
            left: 0;
            bottom:150px;

        }

        /*底部*/
        .footer{
            position:absolute;
            left:0;
            right:0;
            bottom:20px;

        }

        /*底部字体和居中*/
        .container{
            text-align: center;
            font-size:12px;
        }

    </style>
</head>
<body>
<header class="header">
    <div  class="headerbox">
        <div class="brand">
            <span>山海餐饮管理后台</span>
        </div>
        <div class="Info">
            <div class="topmenu">
                <ul class="headermenu" >
                    <li><a href="#">Admin&gt;</a>
                        <ul class="subheadermenu">
                            <li><a href="<%=basepath%>back_Changepassword.action" target="showPage">修改密码</a></li>
                            <li><a href="<%=basepath%>back_ChangeAccount.action" target="showPage">切换账号</a> </li>
                            <li><a href="<%=basepath%>back_OutIndex.action">安全退出</a> </li>
                        </ul>
                    </li>
                </ul>
            </div>
            <h4>普通管理员:<%=session.getAttribute("AdminIdentity") %></h4>
        </div>
    </div>
</header>

<div class="aside-left">
    <ul class="menu">

        <li><a href="javascript:void(0)">商品管理</a>
            <ul class="submenu">

                <li><a href="<%=basepath%>back_GoodsManage.action" target="showPage">商品列表</a></li>
                <li><a href="<%=basepath%>back_GoodsAdd.action" target="showPage">商品添加</a></li>
                <li><a href="<%=basepath%>back_GoodsClassManage.action" target="showPage">商品分类管理</a></li>
            </ul>
        </li>

        <li><a href="javascript:void(0)">库存管理</a>
            <ul class="submenu">

                <li><a href="<%=basepath%>back_GoodsManage.action" target="showPage">库存列表</a></li>
            </ul>
        </li>

        <li><a href="javascript:void(0)">用户管理</a>
            <ul class="submenu">
                <li><a href="<%=basepath%>back_UserManage.action" target="showPage">用户列表</a></li>
            </ul>
        </li>

        <li><a href="javascript:void(0)">数据分析</a>
            <ul class="submenu">
                <li><a href="<%=basepath%>back_UserManage.action" target="showPage">数据报表</a></li>
            </ul>
        </li>

        <li><a href="javascript:void(0)">订单管理</a>
            <ul class="submenu">
                <li><a href="<%=basepath%>back_OrderManage.action" target="showPage">订单列表</a></li>

                <li><a href="<%=basepath%>back_OrderStateManage.action" target="showPage">订单状态查询</a></li>

            </ul>
        </li>

        <li><a href="javascript:void(0)">组织管理</a>
            <ul class="submenu">
                <li><a href="<%=basepath%>back_UserManage.action" target="showPage">职员管理</a></li>
                <li><a href="<%=basepath%>back_UserManage.action" target="showPage">部门管理</a></li>
            </ul>
        </li>

        <li><a href="javascript:void(0)">系统管理</a>
            <ul class="submenu">
                <li><a href="<%=basepath%>back_UserManage.action" target="showPage">权限设置</a></li>
                <li><a href="<%=basepath%>back_UserManage.action" target="showPage">系统设置</a></li>
            </ul>
        </li>

    </ul>
</div>

<div class="aside-right">
    <div  class="tab_nav_hidden-xs">
        <div class="tabNav_wp">
            <ul  id= "min_title_list" class="acrosssTab" style="width: 130px;left: 0px">
                <li class="active">
                    <span title="管理首页" deta-href="next.html" style="font-size:18px">后台业务处理</span>
                    <em></em>
                </li>
            </ul>
        </div>

    </div>

    <iframe name="showPage" scrolling="yes" frameborder="1"  width=97%  height=85%>
        <a href=""></a>
    </iframe>
</div>
<footer class="footer">
    <div class="container">
        Copyright ©2017-2018 ShanHai.FOOD v1.0 All Rights Reserved.
    </div>
</footer>

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