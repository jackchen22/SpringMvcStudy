<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/7
  Time: 16:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/login.action" method="post">
    <input name="name">
    <input name="password">
    <input type="submit">
</form>
</body>
</html>
