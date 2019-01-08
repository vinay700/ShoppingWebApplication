<%-- 
    Document   : image
    Created on : 23 Jul, 2018, 1:14:06 PM
    Author     : Vinay
--%>

<%@page import="com.mysql.cj.jdbc.result.ResultSetMetaData"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%
try
{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/shopping","root",""); 
    Statement stmt=con.createStatement();
    ResultSet rs;
    String s="";
    String s1="select * from books where BookName='Programming in ANSI C'";
    rs = stmt.executeQuery(s1);
    while (rs.next())
    {
        s=rs.getString(7);
        out.println("<td><b> <img src='images/"+s+"'  height='420' width='420'> </b></td>");	  
    }
}
    catch(Exception e)
    {
        
    }
     %>

</html>