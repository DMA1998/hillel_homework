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
<div align="center" class="manyFilmsStyle">
    <h2>Enter the number of films:</h2>
    <br>
<form method="post" action="findActorsByManyFilmsServlet">
    <label>
        <input type="text" name="filmsQuantity">
    </label>
    <input type="submit" value="Go" name="Submit" class="manyFilmsButton">
</form>
    <br>
<ul class="manyFilmsUl">
    <c:forEach var="actor" items="${actorsFilms}">
        <li>Actor: ${actor.name}</li>
        <li>Actor's birthday: ${actor.date}</li>
        <br>
    </c:forEach>
</ul>
</div>
</body>
</html>