<%-- 
    Document   : registration
    Created on : Jul 11, 2021, 1:03:08 AM
    Author     : TUF
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Registration</title>
    </head>
    <body>
        <h1>User Registration</h1>
        <form name="form" action="RegisterServlet" method="get">
            <ul>
                <li>Name</li>
                <input type="text" name="name" placeholder="Enter Your Name"/>
                <li>Email</li>
                <input type="text" name="email" placeholder="Enter Your Email"/>
                <li>Username</li>
                <input type="text" name="username" placeholder="Enter Your Username"/>
                <li>Password</li>
                <input type="password" name="password" placeholder="Enter Password"/>
                <li>Confirm Password</li>
                <input type="password" name="confirm" placeholder="Confirm Password"/>
                <br><br>
                <input type="submit"  value="Confirm Registration"/>
                <input type="Reset"  value="Reset"/>
            </ul>
        </form>
    </body>
</html>
