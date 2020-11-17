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
<c:import url="/jspf/header.jsp"></c:import>
<br>
<div align="center" class="oneFilmStyle">
    <h1>Enter the name of the film:</h1>
    <br>
    <form method="post" action="findActorsInParticularFilmServlet">
        <input type="text" name="filmName" style="font-size: 27px">
        <input type="submit" value="Go" name="Submit" class="oneFilmButton" style="font-size: 33px">
    </form>
    <br>
    <ul class="oneFilmUl">
        <br>
        <c:forEach var="actor" items="${actors}">
            <h2><li>Actor: ${actor.name}</li>
                <li>Actor's birthday: ${actor.date}</li></h2>
            <br>
        </c:forEach>
    </ul>
</div>
</body>
</html>