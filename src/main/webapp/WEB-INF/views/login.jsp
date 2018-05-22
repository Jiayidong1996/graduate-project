<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
    String path =request.getContextPath();
    String basepath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>用户登录</title>
</head>

<body>
<form action="<%=basepath%>login.action" method="post" id="myform">
    <input type="text" id="username" name="username"/>
    <input type="password" id="password" name="password"/>
    <input type="text" id="limits" name="limits"/>
    <input type="submit" value="提交" id="login" />
</form>
</body>

</html>