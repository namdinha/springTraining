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
    <title>Homepage</title>
</head>
<body>
    <div>
        <h1>Welcome to your training</h1>
    </div>
    <form:form modelAttribute="user" action="/showUserName" name="user" method="post">
        <label for="name">Name:</label>
        <input id="name" type="text" name="name">
        <label for="email">Email:</label>
        <input id="email" type="text" name="email">
        <button type="submit">Send</button>
    </form:form>
    <form:form action="/createUser" method="get">
        <button type="submit">Create User</button>
    </form:form>
    <form:form action="/showUsers" method="get">
        <button type="submit">Show Users</button>
    </form:form>
</body>
</html>
