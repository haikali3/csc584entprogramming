<%-- 
    Document   : bean
    Created on : Jun 10, 2021, 12:06:31 PM
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
        <jsp:useBean id="staff" class="person.bean.Staff" />
        <jsp:setProperty name="staff" property="firstname" />
        <jsp:setProperty name="staff" property="lastname"/>
        <jsp:setProperty name="staff" property="age"/>
        
        <p>Staff First Name: <jsp:getProperty name="staff" property="firstname" /></p>
        <p>Staff Last Name: <jsp:getProperty name="staff" property="lastname" /></p>
        <p>Staff Age: <jsp:getProperty name="staff" property="age" /></p>
        <p>Staff Fullname: <%= staff.getFullName() %></p>
    </body>
</html>
