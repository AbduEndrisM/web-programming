<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Abdu
  Date: 20-Apr-19
  Time: 8:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1 align="center"> Beer selection page</h1>

<form method="GET" action="SelectBeer">
    Select beer characteristics <p>
    color:
</p>

     <select name="color" size="1">
    <option> Light</option>
    <option> Amber</option>
         <option> Brown</option>
         <option> Dark</option>
        </select>
    <br><br>
    <input type="submit">


</form>

<%--

<% List styles = (List) request.getAttribute("styles");
    Iterator it = styles.iterator();
    while (it.hasNext()) {
        out.print("<br>try:" + it.next());
    } %>
--%>


</body>
</html>
