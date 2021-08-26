<%-- 
    Document   : home
    Created on : Jul 2, 2021, 8:37:21 PM
    Author     : TUF
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <div style="text-align: center">
            <h1>Home Page!</h1>
            <p>Welcome, <%= request.getSession().getAttribute("username") %></p>
            <form action="LogoutServlet" method="post">
                <input type="submit" value="Log Out">
            </form>
        </div>
        
    </body>
</html>
