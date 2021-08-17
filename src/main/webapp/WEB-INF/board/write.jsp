<%--
  Created by IntelliJ IDEA.
  User: 82103
  Date: 2021-08-17
  Time: 오후 3:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>입력</title>
    <style>
        .bbb {
            width: 500px;
        }
    </style>
</head>
<body>
<h1> 게시글 등록</h1> <br>


<form action="/board/write" method="post">
    <div class="bbb">
    <input type="text" name="writer" placeholder="작성자">  <br>
    <input type="text" name="title" placeholder="제목">  <br>
    <input type="text" name="content" style="height: 690px" placeholder="내용" required>  <br>

    <button type="submit">등록하기</button>
    </div>
</form>

<form action="/board/list" method="get">
    <button type="submit">취소</button>
</form>

</body>
</html>
