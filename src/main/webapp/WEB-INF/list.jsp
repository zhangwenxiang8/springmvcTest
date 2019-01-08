<%--
  Created by IntelliJ IDEA.
  User: 章文翔
  Date: 2019/1/6
  Time: 21:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="list.do" method="post">
   <table>
       <thead>
       <tl>
           <th>ID</th>
           <th>名称</th>
           <th>密码</th>
           <th>操作</th>
       </tl>
       </thead>
        <c:forEach items="${user}" var="u">
                <tr>
                    <td>${u.id}</td>
                    <td>${u.name}</td>
                    <td>${u.pwd}</td>
                    <td><a href="delete.do?id=${u.id}">删除</a>/<a href="add.do">添加</a>/<a href="update.do?id=${u.id}">修改</a></td>
                </tr>
        </c:forEach>
   </table>
</form>

</body>
</html>
