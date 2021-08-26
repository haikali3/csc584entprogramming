<%-- 
    Document   : error
    Created on : Jun 27, 2021, 3:32:23 PM
    Author     : TUF
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error</title>
    </head>
    <% List errorMsgs = (List) request.getAttribute("errorMsgs"); %>
    <body>
        <h1>Error!</h1>
        Please correct the following errors:<br/>
        <ul>
            <li> message </li>
        </ul>
    </body>
</html>
