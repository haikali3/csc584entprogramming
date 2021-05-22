<%-- 
    Document   : add_dvd
    Created on : May 20, 2021, 11:23:50 PM
    Author     : TUF
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.dvd.model.DVDItem" %>
<%@page import="java.util.*" %>
<%
    String genre_list = "Comedy,Action,Drama";
    String[] genres = null;
    genres = genre_list.split(",");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DVD Library Application: Add DVD Form</title>
    </head>
    <body>
        <h1>Add DVD (JSP)</h1>
        <form action="add_dvd.do" method="POST">
            Title: <input type="text" name="title" value="${param.title}"/><br/><br/>
            Year: <input type="text" name="year" value="${param.year}"/><br/><br/>
        </form>
            <%
                String genre = request.getParameter("genre");
            %>
            Genre: <select name="genre">
                <%
                    for(int i=0; i<genres.length;i++){
                        String genre_item = genres[i];
                %>
                <option value='<%= genre_item %>'
                        <%
                            if(genre_item.equals(genre)){
                                out.print(" selected");
                            }
                        %>
                        ><%=genre_item %></option>
                <%
                    }
                 %>
            </select>
            
            or new genre: <input type='text' name='newGenre' value='${param.newGenre}'/>
            <input type="Submit" value='Add DVD'/>
            <%
            List errorMsgs = (List) request.getAttribute("errorMsgs");
            if(errorMsgs != null){
            %>
        <p>
            <font color="red">Please correct the following errors:
        <ul>
            <%
                Iterator items = errorMsgs.iterator();
                while(items.hasNext()){
                    String message = (String) items.next();
            %>
            <li><%=message%></li>
            <%
                }
            %>
        </ul>
        </font>
        </p>
        <%
            }
        %>
    </body>
</html>
