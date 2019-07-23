<%--
  Created by IntelliJ IDEA.
  User: Aidos.Gabdollin
  Date: 23.07.2019
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
    <style>
        .main{
            display: flex;
            justify-content: center;
        }
        .login{
            display: flex;
            flex-direction: row;
            color: coral;
            font-family: "Altel Pro";

        }
        .password{
            display: flex;
            flex-direction: row;
            color: coral;
            font-family: "Altel Pro";
        }
        .button{
            display: flex;
            flex-direction: row;
            color: coral;
            font-family: "Altel Pro";
        }
    </style>
</head>
<body>

<form action="LoginServlet" method="post">
    <div class="main">
    <div class=login>
    Username: <input type="text" name="user">
    </div>
    <br>
<div class="password">
    Password: <input type="password" name="pwd">
    </div>
    <br>
<div>
    <input class="button" type="submit" value="Login">
    </div>
    </div>
</form>
</body>
</html>
