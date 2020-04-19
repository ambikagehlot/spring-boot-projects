<%-- 
    Document   : table
    Created on : Nov 9, 2015, 5:41:26 PM
    Author     : shree
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Table</title>
    </head>
    <body>
        <table border="5" align="center">
            <tr><th>NUMBER</th><th>VALUE</th></tr>
        <%
            for(int i=0;i<10;i++)
            {
        %>
            <tr><td>Number=</td><td><%=i+1%></td></tr>
               
        <%    
             }
        %>
        </table>
          
    </body>
</html>
