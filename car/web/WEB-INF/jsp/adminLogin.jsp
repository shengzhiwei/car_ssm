<%--
  Created by IntelliJ IDEA.
  User: 17519
  Date: 2021/04/05
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>用户登录</h1>
<form action="${pageContext.request.contextPath}/car/login" method="post">
    <div>
        <label>用户名：</label>
        <input type="text" name="adminname">
    </div>
    <div>
        <label>密码：</label>
        <input type="password" name="adminpassword">
    </div>
    <div>
        <input type="submit" value="登录">
    </div>
</form>
</body>
</html>
