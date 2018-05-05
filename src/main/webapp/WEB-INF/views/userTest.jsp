<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
    String path =request.getContextPath();
    String basepath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>管理员登录界面</title>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <article class="page-container">
        <form action="<%=basepath%>AdminIndex.action" class="form form-horizontal" method="post" id="form-change-password">
            <div class="row cl">
                <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>账户：</label>
                <div class="formControls col-xs-8 col-sm-9">
                    <input type="text" class="input-text" autocomplete="off" placeholder="请输入管理员账号" name="adminid" reqired>
                </div>
            </div>
            </div>
            <div class="row cl">
                <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>密码：</label>
                <div class="formControls col-xs-8 col-sm-9">
                    <input type="password" class="input-text" autocomplete="off" placeholder="不修改请留空" name="adminpassword" reqired>
                </div>
            </div>


            <div class="row cl">
                <div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
                    <label><input name="limits" type="radio" checked="checked" value="超级管理员" />超级管理员 </label>
                    <label><input name="limits" type="radio" value="普通管理员" />普通管理员</label>
                </div>
            </div>

            <div class="row cl">
                <div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
                    <input class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;登录&nbsp;&nbsp;">
                </div>
            </div>
        </form>
    </article>
    </body>
</head>
</html>