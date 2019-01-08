<%-- 
    Document   : logout
    Created on : 7 Jul, 2018, 3:23:51 PM
    Author     : Vinay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
request.getSession(true);
System.out.println("1");
session.invalidate();
System.out.println("2");
response.sendRedirect("logout2.jsp");
%>