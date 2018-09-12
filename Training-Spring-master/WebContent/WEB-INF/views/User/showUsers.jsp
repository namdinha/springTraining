<%--
  Created by IntelliJ IDEA.
  User: I867174
  Date: 07/02/2018
  Time: 12:58
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<style>
    body{
        background-color: aquamarine;
        font-family: Monospace;
    }
    div{
        display: flex;
        justify-content: center;
    }
</style>
<html>
<head>
    <title>Users</title>
</head>
<body>
<div>
    <h1>Showing Users</h1>
</div>
<c:forEach var="user" items="${users}">
    <h3>
        <div>
                ${user.name}
        </div>
        <div>
                ${user.phone}
        </div>
        <div>
                ${user.email}
        </div>
    </h3>
</c:forEach>
</body>
</html>
