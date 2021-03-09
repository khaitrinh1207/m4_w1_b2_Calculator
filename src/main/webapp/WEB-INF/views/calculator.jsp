<%--
  Created by IntelliJ IDEA.
  User: khai trinh
  Date: 09/03/2021
  Time: 8:45 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form action="" method="get">
    <input type="number" name="inp1" value="10">
    <input type="number" name="inp2" value="10"><br>
    <input type="submit" name="submit" value="Addtion(+)">
    <input type="submit" name="submit" value="Subtraction(-)">
    <input type="submit" name="submit" value="Mutiplication(X)">
    <input type="submit" name="submit" value="Division(/)">
</form>
<h3 style="color: red">Total : ${total}</h3>
</body>
</html>
