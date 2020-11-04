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
<div align="left">
    <ul>
        <c:forEach var="producer" items="${producers}">
            <h2>
                <li>Producer name: ${producer.name}</li>
                <li>Producer's birthday: ${producer.date}</li>
            </h2>
            <br>
        </c:forEach>
    </ul>
</div>
</body>
</html>