<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<title>Test</title>
<body>
<h1>Hello World!</h1>
<h1>a标签使用示例</h1>
<a href="http://baidu.com">Baidu</a>
<br>
<span style="font-size:14px;"><a href="#">回到最顶端</a></span>
<br>

<a href="userTest01.jsp">登录界面测试111</a>
<br>
<a href="userTest01.action">登录界面测试222</a>
<br>
<a href="AdminIndex.jsp">后台主界面111</a>
<br>
<a href="AdminIndex.action">登录界面测试222</a>
<br>


<div>
    <div>
    <a href="userTest01.action">登录界面测试</a>
    </div>
</div>

<br>
<br>
${user.id}:${user.username}

</body>
</html>
