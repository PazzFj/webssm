<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<a href="/person/getPersons.action" style="font-size: 26px;">跳转</a>
<br>


<form id="formid" name="myform" method = "GET" action="/person/updatePerson.action" >
    <input type="text" id="name" name = "name"> &nbsp;
    <input type="submit" value="修改">
</form>

</body>
</html>
