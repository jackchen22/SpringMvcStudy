<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/7
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <table border="1">
    <thead>
    <th>id</th>
    <th>name</th>
    <th>price</th>
    <th>createDate</th>
    <th>brand</th>
    </thead>
    <tbody>
    <c:forEach items="${products}" var="item">
      <tr>
        <td>${item.id}</td>
        <td>${item.name}</td>
        <td>${item.price}</td>
        <td>${item.time}</td>
        <td>${item.brand}</td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
  </body>
</html>
