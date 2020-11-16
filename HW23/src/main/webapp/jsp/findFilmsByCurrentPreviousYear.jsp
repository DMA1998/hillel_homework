<%@ page import="com.mykh.videolib.dao.FilmDao" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style><%@include file="/css/style.css" %></style>
    <meta content="text/html;charset=utf-8" http-equiv="Content-Type">
    <meta content="utf-8" http-equiv="encoding">
    <title>Hillel</title>
</head>
<body>
<c:import url="/jspf/header.jspf"></c:import>
<ul>
    <c:forEach var="film" items="${films}">
        <h1>
        <li>Film name: ${film.name}</li>
        <li>Film release: ${film.filmRelease}</li>
        <li>Film country: ${film.country}</li>
        <li>Film producer: ${film.producer.name}</li>
        <li>Film actors:</li>
        </h1>
        <c:forEach var="actor" items="${film.actors}">
            <h1> <li>${actor.name}</li> </h1>
        </c:forEach>
        <br><br>
    </c:forEach>
</ul>
</body>
</html>