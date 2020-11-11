<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <style><%@include file="/css/style.css" %></style>
    <meta content="text/html;charset=utf-8" http-equiv="Content-Type">
    <meta content="utf-8" http-equiv="encoding">
    <title>Hillel</title>
</head>
<body>
<c:import url="/jspf/header.jspf"></c:import>
<br>
<div align="center" class="manyFilmsStyle" >
    <h1>Enter the number of films:</h1>
    <br>
<form method="post" action="findActorsByManyFilmsServlet">
    <label>
        <input type="text" name="filmsQuantity" style="font-size: 27px">
    </label>
    <input type="submit" value="Go" name="Submit" class="manyFilmsButton" style="font-size: 33px">
</form>
    <br>
<ul class="manyFilmsUl">
    <br>
    <c:forEach var="actor" items="${actorsFilms}">
        <h2><li>Actor: ${actor.name}</li>
        <li>Actor's birthday: ${actor.date}</li></h2>
        <br>
    </c:forEach>
</ul>
</div>
</body>
</html>