<%-- 
    Document   : bill-2
    Created on : 30 Jul, 2018, 12:34:42 PM
    Author     : Vinay
--%>

<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="styles/cart_styles.css">

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <style>
        table
        {
            border-collapse:collpse;
            width:70%;
        }
        th,td
        {
            padding:10px;
        }
        </style>
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    </head>
    <body>
<div class="cart_title">Shopping Cart</div><br><br><%
    try
{   String u=(String)session.getAttribute("invoice");
    String BID="";
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","");
    PreparedStatement ps = null;
    String sql = "select Subject ,BookName, Image ,Price,BID from addtocart";
    ps = conn.prepareStatement(sql);
    ResultSet rs = ps.executeQuery();
    out.println("<table class='w3-table-all' border=1 align=center width=50% bordercolor='#e0e0eb'><tr class='w3-hover-light-gray'>");
    ResultSetMetaData rmd; 
    rmd =rs.getMetaData();
    int n=rmd.getColumnCount();
    String s="",s2="",s1="",s5="";
    while (rs.next())
    {
        for(int x=1;x<=n;x++)
        {
           if(x==3)
           {
               s5=rs.getString(x);
               out.println("<td><center><img src='images/"+s5+"'  height='100' width='100'> </center></td>");
           }
           else if(x==2)
           {
               s5=rs.getString(x);
               out.println("<td><b>"+s5+"</b></td>");	
           }
           else if(x==1){
               s5=rs.getString(x);
               out.println("<td><b>"+s5+"</b></td>");
           }
           else if(x==4){
               s5=rs.getString(x);
               out.println("<td><b>"+s5+"</b></td>");
           }
           else
                {
                     BID=rs.getString(x);
                }
        } 
        out.println("<td><b><a href=buynow.jsp?f="+BID+" Order Placed</b><a/></td>");
        out.println("</tr>");
    }
    //out.println("<td><b><a href=deleteall.jsp>Order All</b><a/></td>");
    out.println("</table><br></body></html>");
    rs.close();
    String sql1 = "select sum(Price) from addtocart";
    ps = conn.prepareStatement(sql1);
    rs = ps.executeQuery();
    while (rs.next())
    {
        for(int x=1;x<=n;x++)
            {
                if(x==1)
                {
                    s5=rs.getString(x);
                    out.println("<p align='right'>Total Amount : "+s5+"<br>");
                }
            }
    }
    out.println("Invoice number : 10332526</p>");

}
catch(Exception e)
{out.println(e);}
%>
        </body>
</body>
</html>
