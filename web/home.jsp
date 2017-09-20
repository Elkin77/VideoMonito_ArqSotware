<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta  charset=UTF-8"/>
        <title>Bienvenido</title>
    </head>
    <body>
        <h1>Bienvenido</h1>
        <p>hay <c:out value="${datos.size()}" />  </p>
        <ul>
            <c:forEach items="${datos}" var="dato">
                <li>
                    ID: <c:out value="${dato.getNombre()}" />
                </li>
            </c:forEach>
        </ul> 
    </body>
</html>
