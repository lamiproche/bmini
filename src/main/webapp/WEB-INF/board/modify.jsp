<%--
  Created by IntelliJ IDEA.
  User: luke
  Date: 2021/08/17
  Time: 5:02 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<form method="post" action="/board/modify">
<div class="input-group mb-3">
    <span class="input-group-text" id="inputGroup-sizing-default">넘버</span>
    <input type="text" name="bno" value="${boardDTO.bno}" readonly class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
</div>

<div class="input-group mb-3">
    <span class="input-group-text" id="inputGroup-sizing-default">제목</span>
    <input type="text" name="title" value="${boardDTO.title}" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
</div>

<div class="input-group mb-3">
    <span class="input-group-text" id="inputGroup-sizing-default">작성자</span>
    <input type="text" name="writer" value="${boardDTO.writer}" readonly class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
</div>

<div class="input-group mb-3">
    <span class="input-group-text" id="inputGroup-sizing-default">내용</span>
    <input type="text" name="content" value="${boardDTO.content}" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
</div>

<div class="input-group mb-3">
    <span class="input-group-text" id="inputGroup-sizing-default">작성일</span>
    <input type="text" name="regdate" value="${boardDTO.regdate}" readonly class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
</div>


    <button type="submit">수정하기</button>
</form>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>
</body>
</html>