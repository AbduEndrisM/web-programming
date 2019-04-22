<%--
  Created by IntelliJ IDEA.
  User: Abdu
  Date: 20-Apr-19
  Time: 8:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.util.Iterator" %>
<%@page import="java.util.List" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Custom Tags</title>
</head>
<body>
<h1 align="center"> Beer Recommendations JSP </h1>

<p>

    List styles = (List) request.getAttribute("styles");<%--
    <%
        Iterator it = styles.iterator();
        while (it.hasNext()) {
            out.print("<br>try:" + it.next());
        } %>--%>

    <c:forEach var="x" items="${styles}">
        out.print("<br>try:" + ${item});
    </c:forEach>
</p>
</body>
</html>
