<%-- 
    Document   : success
    Created on : May 20, 2021, 11:09:54 PM
    Author     : TUF
--%>

<%@page contentType="text/html"%>
<%@page pageEncoding ="UTF-8"%>
<jsp:useBean id="dvdItem" scope="request" type="com.dvd.model.DVDItem"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add DVD Success (JSP)</h1>
        You have add the following DVD: <br/>
        Title: <jsp.getProperty name="dvdItem" property="title"/><br/>
        Year Released: <jsp.getProperty name="dvdItem" property="year"/><br/>
        Genre of film: <jsp.getProperty name="dvdItem" property="genre"/><br/>
        
        <br/><a href="index.html">Home</a>
        
        
    </body>
</html>
