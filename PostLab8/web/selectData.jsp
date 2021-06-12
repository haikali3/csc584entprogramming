<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : selectData
    Created on : Jun 5, 2021, 3:48:12 PM
    Author     : TUF
--%>
<sql:setDataSource var = "myDatasource" driver = "org.apache.derby.jdbc.ClientDriver" url = "jdbc:derby://localhost:1527/dvdlibrary" user = "root"  password = "root"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <sql:query var="result" dataSource="${myDatasource}">
            SELECT id,title,"year",genre FROM ROOT.ITEM
        </sql:query>
    
        <table border="1">
            <!-- column headers -->
            <tr>
                <th>Number</th>
                <th>Title</th>
                <th>Year</th>
                <th>Genre</th>
            </tr>
            <!-- column data -->
            <c:forEach var="row" items="${result.rowsByIndex}">
                <tr>
                    <c:forEach var="column" items="${row}">
                        <td><c:out value="${column}"/></td>
                    </c:forEach>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
