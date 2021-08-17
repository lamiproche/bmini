<%--
  Created by IntelliJ IDEA.
  User: luke
  Date: 2021/08/17
  Time: 6:18 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>read.html</title>
    <style>
        * {
            font-family: Arial;
            text-decoration: none;
        }

        .title {
            font-weight: bolder;
            font-size: 25pt;
            margin-left: 120pt;
            margin-right: 120pt;
            text-decoration: none;
        }

        .Author {
            font-size: 15pt;
            font-weight: bold;
            margin-left: 120pt;
            margin-right: 120pt;
            text-decoration: none;
        }

        .content {
            margin-left: 120pt;
            margin-right: 120pt;
            text-decoration: none;
        }

        .head {
            font-family: Brush Script MT;
            font-size: 40pt;
            font-weight: bold;
            text-decoration: none;
        }

        .menu {

            padding: 20px;
            background: black;
            height: 50pt;
            color: white;
            font-weight: bolder;
            font-size: 15pt;
            text-decoration: none;
        }

        a {
            font-family: Arial;
            font-size: 15pt;
            text-decoration: none;
            color: white;
            font-weight: bold;
        }

        a:hover {
            font-size: 17pt;
            text-decoration: none;
            color: white;
            font-family: Arial;
        }

    </style>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
</head>
<body>
<div class="menu" align="center">
    <span style="float: left; font-family: Brush Script MT; font-size: 20pt; margin-left: 50px">B.R.ROH</span>
    <span style="float: right;  margin-right: 70pt">
        <a href="/board/list" style="text-decoration: none; color: white">List</a> &nbsp;&nbsp;&nbsp;&nbsp;
        <a href="list.html" style="text-decoration: none; color: white">Photo</a> &nbsp;&nbsp;&nbsp;&nbsp;
        <a href="layout.html" style="text-decoration: none; color: white">Login</a> &nbsp;&nbsp;&nbsp;&nbsp;
        <a href="layout.html" style="text-decoration: none; color: white">Create Account</a> &nbsp;&nbsp;&nbsp;&nbsp;
        </span>
</div>

