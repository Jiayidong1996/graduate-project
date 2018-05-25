<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%String path =request.getContextPath();
    String basepath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>餐桌界面</title>
    <style type="text/css">

        *{
            margin:0;
            padding:0;
            font-family:  "Microsoft Yahei","Hiragino Sans GB","Helvetica Neue",Helvetica,tahoma,arial,"WenQuanYi Micro Hei",Verdana,sans-serif,"\5B8B\4F53";
        }
        body
        {
            background-color: rgba(238,238,238,0.98);
        }

        .desk{
           height:100px;
           width:100px;
           float: left;
           position: relative;
           padding: 30px;
           -webkit-transition:all 0.5s;
       }
       .desk img{
           width: 100px;
           height: 100px;
           opacity: 0.7;
       }
       .desk:hover{
           -webkit-transform:scale(1.1);

       }
       .desk img:hover{
           opacity: 1;
       }


        .aside-left{
            position: absolute;
            top:0px;
            left: 0px;
            /*padding-top: 10px;*/
            width: 69%;
            z-index: 0;
            height: 91%;
            overflow: auto;
            background-color: rgba(238,238,238,0.98);
            /*border-right:1px solid rgba(238,238,238,0.98); */
        }

        .aside-right{
            position: absolute;
            top:0px;
            bottom:20px;
            right: 10px;
            left: 70%;
            height: 91%;
            z-index: 0;
            overflow: auto;
            background-color:#fff;
            /*改不过来，最后的时候用*/
            /*background-color: rgba(238,238,238,0.98)*/
        }

        /*.show_iframe{
            position: absolute;
            top:0;
            right:0;
            left: 0;
            bottom:150px;

        }*/

        /*底部*/
        .footer{
            position:absolute;
            left:0;
            right:0;
            bottom:5px;

        }

        /*底部字体和居中*/
        .container{
            text-align: center;
            font-size:12px;
            /* background-color: #333;*/
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

        }
        .btn
        {
            padding: 4px 12px;
            margin: 4px;
        }
        .input-text, .btn
        {
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
        .btn-reserve
        {
            color: #fff;
            background-color: #3bb4f2;
            border-color: #3bb4f2;
        }
        .btn-reserve:hover
        {
            color: #fff;
            background-color: #0f9ae0;
            border-color: #0f9ae0;
        }
        .btn-pay
        {
            color: #fff;
            background-color: #dd514c;
            border-color: #dd514c;
        }
        .btn-pay:hover
        {
            color: #fff;
            background-color: #c62b26;
            border-color: #c62b26;
        }
        .btn-search
        {
            color: #fff;
            background-color: #f37b1d;
            border-color: #f37b1d;
        }
        .btn-search:hover
        {
            color: #fff;
            background-color: #c85e0b;
            border-color:#c85e0b;
        }
        .btn-cancel
        {
            color: #fff;
            background-color: #787878;
            border-color: #787878;
        }
        .btn-cancel:hover
        {
            color: #fff;
            background-color: #333;
            border-color:#333;
        }

    </style>


</head>
<body>

<div class=contain>
    <div class="aside-left">
        <!-- 显示桌面信息 这里暂时不需要，先注释掉-->
        <c:forEach items="${mapDesk}" var="desk">
            <div class="desk">
                <img  src="<%=basepath %>pic/${desk.value.deskstate}.jpg" />
                <%--<div style="position:relative;width:20px;height:20px;z-indent:2;left:80px;top:80px;">--%>
                    <c:out value="${desk.value.deskId}">
                    </c:out>
                    <c:out value="${desk.value.deskname}">

                    </c:out>
                <%--</div>--%>
            </div>
        </c:forEach>
    </div>


    <div class="aside-right">
        <!-- 关于滚动条的一些设置 -->
        <!-- scrolling="no" 无滚动条 -->
        <!-- scrolling="yes" 或者 scrolling="auto" 有滚动条 -->
        <iframe name="showPage" scrolling="no"  frameborder="0" width=100%  height=99%  src="<%=basepath%>frontBillInfo.action">
            <a href=""></a>
        </iframe>
    </div>


</div>


<footer class="footer">
    <div class="container">
        <a href="<%=basepath%>FrontDeskStateInfo.action"><input class="btn btn-order radius" type="button" value="开台"></a>
        <input class="btn btn-reserve radius" type="button" value="预定">
        <input class="btn btn-search radius" type="button" value="查询">
        <input class="btn btn-pay radius" type="button" value="付款">
        <input class="btn btn-cancel radius" type="button" value="取消">
    </div>
</footer>


</body>
</html>