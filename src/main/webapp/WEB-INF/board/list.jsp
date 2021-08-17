<%--
  Created by IntelliJ IDEA.
  User: bumre
  Date: 2021-08-17
  Time: 오후 3:51
  To change this template use File | Settings | File Templates.
--%>

<%--<html>--%>
<%--<head>--%>
<%--    <title>Title</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<h1>Board List!!!!</h1>--%>


<%--<c:forEach items="${list}" var="dto">--%>
<%--    <a href="/board/read?bno=${dto.bno}"><input type="text" readonly value="${dto.bno}"></a>--%>
<%--    <input type="text" readonly value="${dto.title}">--%>
<%--    <input type="text" readonly value="${dto.content}">--%>
<%--    <input type="text" readonly value="${dto.writer}">--%>
<%--    <input type="text" readonly value="${dto.regdate}">--%>
<%--    <br>--%>
<%--</c:forEach>--%>

<%--<form action="/board/write" method="get">--%>
<%--    <button type="submit">글쓰기</button>--%>
<%--</form>--%>
<%--</body>--%>
<%--</html>--%>

<%@include file="../header/header.jsp"%>

<div class="head" align="center" style="background: aquamarine;">
    Post List
</div>

<hr> <br><br><br>
<table align="center"  class="table"  style="width: 1300pt" >
    <thead class="table">
    <tr bgcolor="black" style="color: white; font-weight: bolder;">
        <th scope="col">#</th>
        <th scope="col">Title</th>
        <th scope="col">Contents</th>
        <th scope="col">Author</th>
        <th scope="col">Date</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="dto">

    <tr>
        <td><a id="bbb" href="/board/read?bno=${dto.bno}"> ${dto.bno}</a></td>
        <td>${dto.title}</td>
        <td>${dto.content}</td>
        <td>${dto.writer}</td>
        <td>${dto.regdate}</td>
    </tr>

    </c:forEach>
    </tbody>
</table>
<br><br><br>
<nav aria-label="Page navigation example">
    <ul class="pagination justify-content-center">
        <li class="page-item disabled">
            <a class="page-link" href="#" tabindex="-1" aria-disabled="true">Previous</a>
        </li>
        <li class="page-item"><a class="page-link" href="#">1</a></li>
        <li class="page-item"><a class="page-link" href="#">2</a></li>
        <li class="page-item"><a class="page-link" href="#">3</a></li>
        <li class="page-item">
            <a class="page-link" href="#">Next</a>
        </li>
        <li class="page-item">
            <form action="/board/write" method="get">
                <input class="page-link" type="submit" value="Write">
            </form>
        </li>
    </ul>
</nav>


</body>
</html>