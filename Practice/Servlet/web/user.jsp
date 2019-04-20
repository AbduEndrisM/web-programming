<%--
  Created by IntelliJ IDEA.
  User: Abdu
  Date: 20-Apr-19
  Time: 1:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@  taglib  prefix="c"   uri="http://java.sun.com/jsp/jstl/core"  %>

<html>
<head>
    <title>User</title>
    <style>
        .color{
            color: green;
        }
    </style>
</head>
<body>


<%--${user.toString()}--%>

<%--<c:out value="Hello Abdu" />--%>

<c:forEach  items="${user}" var="x">
    <span class="color"> First Name :  ${x.fName}, Last Name: ${x.lName}, Age:  ${x.age} </span> <br>


</c:forEach>



</body>
</html>
