<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>

<h1>Login 页面</h1>


<form id="loginId" name="loginName" method="GET" action="/login/doLogin">
    <input type="text" id="userName" name="userName"> <br/>
    <input type="password" id="userPassword" name="userPassword"> <br/>
    <input type="submit" value="登陆">
</form>

</body>
</html>
