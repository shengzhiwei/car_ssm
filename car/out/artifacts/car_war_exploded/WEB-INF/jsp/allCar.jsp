<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>车辆列表</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>车辆列表 —— 显示所有车辆</small>
                </h1>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/car/toaddCar/">新增</a>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>车辆编号</th>
                    <th>车辆名字</th>
                    <th>车辆公司</th>
                    <th>车辆数量</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="car" items="${requestScope.get('cars')}">
                    <tr>
                        <td>${car.getCarid()}</td>
                        <td>${car.getCarname()}</td>
                        <td>${car.getCarcompany()}</td>
                        <td>${car.getCarcount()}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/car/toUpdateUser?id=${car.getCarid()}">更改</a> |
                            <a href="${pageContext.request.contextPath}/car/deleteCar/${car.getCarid()}">删除</a>
                        </td>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>