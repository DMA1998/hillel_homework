<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        <%@include file="/css/style.css" %>
    </style>
    <meta content="text/html;charset=utf-8" http-equiv="Content-Type">
    <meta content="utf-8" http-equiv="encoding">
    <title>Hillel</title>
</head>
<body>
<c:import url="/jspf/header.jspf"></c:import>
<br>
<div align="center" class="oneFilmStyle">
    <h2>Enter the name of the film:</h2>
    <br>
    <form method="post" action="findActorsInParticularFilmServlet">
        <input type="text" name="filmName">
        <input type="submit" value="Go" name="Submit" class="oneFilmButton">
    </form>
    <br>
    <ul class="oneFilmUl">
        <c:forEach var="actor" items="${actors}">
            <li>Actor: ${actor.name}</li>
            <li>Actor's birthday: ${actor.date}</li>
            <br>
        </c:forEach>
    </ul>
</div>
</body>
</html>