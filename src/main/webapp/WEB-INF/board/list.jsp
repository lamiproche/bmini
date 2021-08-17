<%--
  Created by IntelliJ IDEA.
  User: bumre
  Date: 2021-08-17
  Time: 오후 3:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Board List!!!!</h1>

<c:forEach items="${list}" var="dto">
    <input type="text" value="${dto.bno}">
    <input type="text" value="${dto.title}">
    <input type="text" value="${dto.content}">
    <input type="text" value="${dto.writer}">
    <input type="text" value="${dto.regdate}">
    <br>
</c:forEach>

</body>
</html>
