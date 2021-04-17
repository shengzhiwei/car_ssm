<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>新增车辆</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增车辆</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/car/addCar" method="post">
        车辆名称：<input type="text" name="carname"><br><br><br>
        车辆库存：<input type="text" name="carcount"><br><br><br>
        车辆公司：<input type="text" name="carcompany"><br><br><br>
        <input type="submit" value="添加">
    </form>

</div>