<%--
  Created by IntelliJ IDEA.
  User: pengjian
  Date: 2019/3/11
  Time: 17:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <c:forEach items="${users}" var="user">
        <c:out value="${user.name}" /> <br/>
        <c:out value="${user.age}" /> <br/>
    </c:forEach>
</head>
<body>

</body>
</html>
