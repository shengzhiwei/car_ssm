<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
  <title>首页</title>
  <style type="text/css">
    a {
      text-decoration: none;
      color: black;
      font-size: 18px;
    }
    h3 {
      width: 180px;
      height: 38px;
      margin: 100px auto;
      text-align: center;
      line-height: 38px;
      background: deepskyblue;
      border-radius: 4px;
    }
  </style>
</head>
<body>

<h3>
  <a href="${pageContext.request.contextPath}/car/allUser">点击进入用户列表页</a>
  <a href="${pageContext.request.contextPath}/car/allCar">点击进入汽车列表页</a>
  <a href="${pageContext.request.contextPath}/car/toAdminLogin">点击进入登录</a>
</h3>
</body>
</html>