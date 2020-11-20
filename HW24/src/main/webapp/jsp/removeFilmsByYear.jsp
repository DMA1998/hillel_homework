<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>

<fmt:setBundle basename="/localization/lang"/>

<fmt:message key="rm.enter" var="enterDelete"/>
<fmt:message key="b1.go" var="Go"/>

<html>
<head>
    <style>
        <%@include file="/css/style.css" %>
    </style>
    <meta content="text/html;charset=utf-8" http-equiv="Content-Type">
    <meta content="utf-8" http-equiv="encoding">
    <title>Hillel</title>
<body>
<c:import url="/header/header.jsp"></c:import>
<br>
<div align="center" class="removedStyle">
    <h1>${enterDelete}</h1>
    <br>
    <form method="post" action="removeFilmsByYearServlet">
        <label>
            <input type="text" name="filmYear" style="font-size: 27px">
        </label>
        <input type="submit" value="${Go}" name="Submit" class="removedButton" style="font-size: 33px">
    </form>
    <c:set var="rm" value="${remove}"/>
    <c:choose>
        <c:when test="${rm >= 0}">
            <br><br><br>
            <fmt:message key="rm.resp" var="FilmsDeleted"/>
            <h1>${FilmsDeleted}</h1>
        </c:when>
        <c:otherwise>
        </c:otherwise>
    </c:choose>
</div>
</body>
</html>