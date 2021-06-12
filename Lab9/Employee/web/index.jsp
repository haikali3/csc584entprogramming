<%-- 
    Document   : index
    Created on : Jun 10, 2021, 11:57:50 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Staff Details</h1>
        <form method="POST" action="bean.jsp">
            <table>
                <tr>
                    <td>Firstname:</td>
                    <td><input type="text" name="firstname"></td>
                </tr>
                <tr>
                    <td>Lastname:</td>
                    <td><input type="text" name="lastname"></td>
                </tr>
                <tr>
                    <td>Age:</td>
                    <td><input type="text" name="age"></td>
                </tr>
                <tr><td><input type="submit" value="Submit"></td></tr>
            </table>
        </form>
    </body>
</html>
