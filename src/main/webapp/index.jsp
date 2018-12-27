<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test</title>
    <script src="js/jquery-3.3.1.js" type="application/javascript"></script>
    <script>
        $(function () {
            $('#btn').click(
                function () {
                    
                }
            )
        })
    </script>
</head>
<body>
<a href="book/findAll">findAll</a>
<a href="book/update?bookName=time&price=12.2&id=24">update</a>
<button id="btn">测试</button></body>
</html>
