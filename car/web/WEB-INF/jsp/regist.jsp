<%--
  Created by IntelliJ IDEA.
  User: 17519
  Date: 2021/2/26
  Time: 22:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/car/regist" method="post">
    <input type="hidden" name="userid" value="${user.getUserid()}"/>
    用户姓名：<input type="text" name="username" value="${user.getUsername()}"/>
    用户密码：<input type="text" name="password" value="${user.getPassword()}"/>
    <input type="submit" value="注册"/>
</form>
</body>
</html>
