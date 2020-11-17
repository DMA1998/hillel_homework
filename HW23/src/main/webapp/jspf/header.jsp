<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <style><%@include file="/css/style.css" %></style>
    <meta content="text/html;charset=utf-8" http-equiv="Content-Type">
    <meta content="utf-8" http-equiv="encoding">
    <title>Hillel</title>
</head>
<body>
<div class="header">
    <div class="inner_header" style="width: 87%">
                <div class="logo_container">
                    <c:set var="user" value="${sessionScope.user}" />
                    <c:choose>
                    <c:when test="${sessionScope.user == NULL}">
                        <a href="loginServlet" class="logo_container">
                        <h1><span style="font-size: 60px">Log in</span></h1>
                        </a>
                    </c:when>
                    <c:otherwise>
                        <a href="logoutServlet" class="logo_container">
                            <h1><span style="font-size: 60px">Log out</span></h1>
                        </a>
                    </c:otherwise>
                    </c:choose>
                </div>
        <ul class="navigation">
            <a href="findActorsInParticularFilmServlet">
                <li>
                    Find actors<br> in particular film
                </li>
            </a>
            <a href="findActorsByManyFilmsServlet">
                <li>
                    Find actors by <br> many films
                </li>
            </a>
            <a href="findActorsLikeProducersServlet">
                <li>
                    Find actors <br> like producers
                </li>
            </a>
            <a href="findFilmsByCurrentPreviousYearServlet">
                <li>
                    Find films by current <br> and previous year
                </li>
            </a>
            <a href="removeFilmsByYearServlet">
                <li>
                    Remove films <br> by year
                </li>
            </a>
        </ul>
    </div>
</div>
</body>
</html>


