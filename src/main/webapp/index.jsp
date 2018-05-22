<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<title>Test</title>
<body>
<h1>Hello World!</h1>
<h1>测试前后台界面Start...</h1>
<div>
    <a href="backAdminLogin.action">进入后台登录界面</a>
</div>
<br>
<div>
    <a href="frontAdminIndex.action">进入前台界面</a>
</div>

<br>
<span style="font-size:14px;"><a href="#">回到最顶端</a></span>
<br>
<a href="userTest01.action">登录界面测试</a>
<br>



<br>
<br>
${user.id}:${user.username}


<%
    String path =request.getContextPath();
    String basepath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!--添加测试-->
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


<!--删除测试-->
<form class="form" id="add" action="<%=basepath%>delete.action">
    <div class="row cl">
        <label><span class="c-red">*</span>id：</label>
        <div>
            <input type="text" class="input-text" value="" placeholder="" id="id" name="id" required>
        </div>
    </div>

    <div class="row cl">
        <div>
            <input type="submit" value="&nbsp;&nbsp;删除&nbsp;&nbsp;">
        </div>
    </div>
</form>

<!--修改测试-->
<form class="form" id="add" action="<%=basepath%>update.action">
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
            <input type="submit" value="&nbsp;&nbsp;修改&nbsp;&nbsp;">
        </div>
    </div>
</form>

</body>
</html>


