<%--
  Created by IntelliJ IDEA.
  User: Abdu
  Date: 20-Apr-19
  Time: 10:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<h2>Login Form</h2>

<form action="login" method="POST">

    <div class="container">
        <label for="uname"><b>Username</b></label>
        <input type="text" placeholder="Enter Username" name="username" id="uname"required>

        <label for="psw"><b>Password</b></label>
        <input type="password" placeholder="Enter Password" name="password" id="psw" required>

        <button type="submit">Login</button>

    </div>

</form>
${error}

</body>
</html>
