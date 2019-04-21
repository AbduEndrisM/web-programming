<%--
  Created by IntelliJ IDEA.
  User: Abdu
  Date: 20-Apr-19
  Time: 1:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--<%@  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>

<%--<%@  taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>--%>
<%--<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>--%>


<!-- No session required-->


<html>
<head>
    <title>User</title>
    <style>
        .color {
            color: green;
        }
    </style>
</head>
<body>

<%
    if (session.getAttribute("Username") != null) {

    }
%>

welcome <%= session.getAttribute("username")%>

<a href="login.jsp"> Logout</a>

</body>
</html>
