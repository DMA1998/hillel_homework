<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta content="text/html;charset=utf-8" http-equiv="Content-Type">
    <meta content="utf-8" http-equiv="encoding">
    <title>Hillel</title>
</head>
<body>
<c:import url="/jspf/header.jspf"></c:import>
<ul>
    <c:forEach var="film" items="${films}">
        <h3>
        <li>Film name: ${film.name}</li>
        <li>Film release: ${film.filmRelease}</li>
        <li>Film country: ${film.country}</li>
        <li>Film producer: ${film.producer.name}</li>
        <li>Films actors:</li>
        </h3>
        <c:forEach var="actor" items="${film.actors}">
            <h3> <li>${actor.name}</li> </h3>
        </c:forEach>
        <br>
    </c:forEach>
</ul>
</body>
</html>