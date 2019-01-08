<%-- 
    Document   : ackno
    Created on : 28 Jul, 2018, 7:48:54 AM
    Author     : Vinay
--%>

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
        <title>Acknowledgement Page</title>
    </head>
    <body>
<%
try
{    
    String u=(String)session.getAttribute("email");
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","");
    PreparedStatement pstmt = null;
    String sql = "select Subject,BookName,Price,Image from buynow where email='"+u+"'";
    pstmt = conn.prepareStatement(sql);
    ResultSet rs = pstmt.executeQuery();
    ResultSetMetaData rmd; 
    out.println("<table class='w3-table-all' border=1 align=center width=50% bordercolor='#e0e0eb'><tr class='w3-hover-light-gray'>");
    rmd =rs.getMetaData();
    int n=rmd.getColumnCount();
    String s="",s2="",s1="";
    int i=0,tot=0;
    while (rs.next())
    {
        for(int x=1;x<=n;x++)
        {
            if(x==4)
            {
                 s=rs.getString(x);
                 out.println("<td><center><img src='images/"+s+"'  height='100' width='100'> </center></td>");
            }
            else if(x==3)
            {
                 s1=rs.getString(x);  
                 out.println("<td><b>"+s1+"</b></td>");
            } 
            else 
            {
                s2=rs.getString(x);
                out.println("<td><b>"+s2+"</b></td>");
            }
        }   
    }out.println("</table>");
       out.println("Your order will deliver within 3-4 working days..<br><br>");
    out.println("Thanks For Booking.....<br>");
    out.println("<a href=mainshoping.jsp><b>Continue Shopping</b><a/><br>");
 
}
catch(Exception e)
{
}
    %>
    </body>
</html>


