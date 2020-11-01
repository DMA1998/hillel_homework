<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 11/1/2020
  Time: 11:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta content="text/html;charset=utf-8" http-equiv="Content-Type">
    <meta content="utf-8" http-equiv="encoding">
    <title>header</title>
</head>
<body>
<div align="left">
    <% java.util.Date date = new java.util.Date();
        String currentDate = "Current date: " + date;%>
    <%=currentDate%>
</div>
<form method="post" action="findActorsInParticularFilmServlet">
    <h2>Enter the name of the film:</h2>
    <input type="text" name="filmName">
    <input type="submit" name="Run">
</form>
<ul>
    <c:forEach var="actor" items="${actors}">
        <li>Actor: ${actor.name}</li>
        <li>Actor's birthday: ${actor.date}</li>
        <br>
    </c:forEach>
</ul>

</body>
</html>