<%@ page import="java.util.List" %>
<%@ page import="taglib.BeerExpert" %><%--
  Created by IntelliJ IDEA.
  User: celem
  Date: 4/18/2019
  Time: 2:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib prefix="ct" uri="http://java.sun.com/jsp/jstl/test" %>
<html>
<head>
    <title>Beer Advice Web Application</title>
</head>
<body>
<h2>Beer Advice Web Application</h2>
<%
    request.setAttribute("styles", new BeerExpert().getBrand("amber"));
%>
<c:forEach var="style" items="${styles}">
    <br/>try: ${style}
</c:forEach>
<br/>
<ct:currentDateTime color="red" size="20px"/>
</body>
</html>
