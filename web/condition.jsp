<%-- 
    Document   : condition
    Created on : Nov 9, 2015, 5:56:42 PM
    Author     : shree
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Condition JSP</title>
    </head>
    <body>
        <!-- below code will be places under service code -->
        <%! int age=20; %>
        <%
            if(age<20)
        {
        %>
        Not allowed to get married
        <%
          }
         else{ 
        %>
        allowed to get married
        <% } %>
        
        
    </body>
</html>
