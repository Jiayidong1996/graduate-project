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
    <title>添加管理员</title>
</head>
<body>
<div >
    <h3> 添加管理员信息</h3>

</div>
<article class="page-container">
    <form class="form" id="add" action="<%=basepath%>insert.action">
        <div class="row cl">
            <label><span class="c-red">*</span>id：</label>
            <div>
                <input type="text" class="input-text" value="" placeholder="" id="id" name="id" required>
            </div>
        </div>
        <div class="row cl">
            <label><span class="c-red">*</span>用户名：</label>
            <div>
                <input type="text" class="input-text" value="" placeholder="" id="username" name="username" required>
            </div>
        </div>
        <div class="row cl">
            <label><span class="c-red">*</span>初始密码：</label>
            <div>
                <input type="password" class="input-text" autocomplete="off"  placeholder="密码" id="password" name="password" required>
            </div>
        </div>
        <div class="row cl">
            <label>角色：</label>
            <div> <span class="select-box" style="width:150px;">
			<select class="select" name="limits" size="1">
				<option value="普通管理员">普通管理员</option>
				<option value="超级管理员">超级管理员</option>
			</select>
			</span>
            </div>
        </div>
        <div class="row cl">
            <div>
                <input type="submit" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
            </div>
        </div>
    </form>
</article>

</body>
</html>