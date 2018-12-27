<%--
  Created by IntelliJ IDEA.
  User: kejin
  Date: 2018/12/21
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    success
    <hr/>
    <c:forEach items="${list}" var="book" >
        ${book}<br/>
    </c:forEach>

</body>
</html>
