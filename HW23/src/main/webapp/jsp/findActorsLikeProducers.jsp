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
<c:import url="/header/header.jsp"></c:import>
<div align="left">
    <ul>
        <c:forEach var="producer" items="${producers}">
            <h1>
                <li>Producer name: ${producer.name}</li>
                <li>Producer's birthday: ${producer.date}</li>
            </h1>
            <br>
        </c:forEach>
    </ul>
</div>
</body>
</html>