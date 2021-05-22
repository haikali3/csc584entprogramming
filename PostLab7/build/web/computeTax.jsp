<%-- 
    Document   : computeTax
    Created on : May 20, 2021, 11:51:44 PM
    Author     : TUF
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Compute Tax</title>
    </head>
    <body>
            <%
            double price = Double.parseDouble(request.getParameter("price"));
            double tax = Double.parseDouble(request.getParameter("tax"));
            %>
            
            <%!
                public double calculateTax(double type,double price){
                    return (price*type)+price;
                }
            %>
        <h1>Computed Tax</h1>
        Net Amount(Excluding tax):RM <%= price %><br/>
        Tax Type:<%= tax %><br/>
        Gross Amount(Including tax):RM <%= calculateTax(tax,price)%>
           
    </body>
</html>
