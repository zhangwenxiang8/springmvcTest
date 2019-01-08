<%--
  Created by IntelliJ IDEA.
  User: 章文翔
  Date: 2019/1/7
  Time: 8:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<form action="updateto.do" method="post">
    <input type="text" name="id" hidden="hidden" value="${user.id}">
    姓名:  <input type="text" name="name" value="${user.name}">
    密码:   <input type="password" name="pwd" value="${user.pwd}">
    <input type="submit">
</form>

</body>
</html>
