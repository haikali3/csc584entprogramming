<%-- 
    Document   : CoffeeProcess
    Created on : Jun 12, 2021, 10:14:12 AM
    Author     : TUF
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Order</title>
    </head>
    <body>
        <jsp:useBean id="CoffeeBean" scope="page" class="coffee.bean.CoffeeBean">
        <jsp:setProperty name="CoffeeBean" property="typeCoffee"  />
        <jsp:setProperty name="CoffeeBean" property="numSugar"/>
        <jsp:setProperty name="CoffeeBean" property="price"/>
        </jsp:useBean>
        
        <h2>Javabeans in JSP</h2>
        
        <h2>Customer Order</h2>
         <table>
                <tr>
                    <td>Type of Coffee</td>
                    <td> <jsp:getProperty name="CoffeeBean" property="typeCoffee" /></td>
                </tr>
                <tr>
                    <td>Number of Sugar</td>
                    <td> <jsp:getProperty name="CoffeeBean" property="numSugar" /> spoon</td>
                </tr>
                <tr>
                    <td>Price</td>
                    <td> RM<jsp:getProperty name="CoffeeBean" property="price" /></td>
                </tr>
         </table>
    </body>
</html>
