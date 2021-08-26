<%-- 
    Document   : login
    Created on : Jul 2, 2021, 8:30:50 PM
    Author     : TUF
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1 style="text-align: center">Login using MVC-DAO</h1>
        <form name="form" action="LoginServlet" method="POST" style="margin-left: 40%" onsubmit="return validate()">
            <table>
                <tr>
                    <td>Username:</td>
                    <td><input type="text" name="username" required></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="password" name="password" required></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Submit"> <input type="reset" name="Reset" value="Reset"></td>
                </tr>
                <tr>
                <span style="color: red">
                    <%=(request.getAttribute("errMsg")== null)?"": request.getAttribute("errMsg")%>
                </span>
                </tr>
            </table>
        </form>
    </body>
</html>
