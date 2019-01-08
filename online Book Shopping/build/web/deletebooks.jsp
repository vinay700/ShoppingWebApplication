<%-- 
    Document   : deletebooks
    Created on : 31 Jul, 2018, 11:45:31 AM
    Author     : Vinay
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>  
<%
String f=request.getParameter("f");
try
{
    Connection conn=null;
    PreparedStatement pstmt = null;
    ResultSet rs=null;
    String url= "jdbc:mysql://localhost:3306/shopping";
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    conn=DriverManager.getConnection(url,"root", "");
    pstmt = conn.prepareStatement("delete from addtocart where BID='"+f+"'");
    int count = pstmt.executeUpdate();
    response.sendRedirect("cart.jsp");                 
    rs.close();
    pstmt.close();
    conn.close();
}
catch(Exception e)
{
}

%>  </body>
</html>
