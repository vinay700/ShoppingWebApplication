<%-- 
    Document   : addtocart
    Created on : 18 Jul, 2018, 11:37:15 AM
    Author     : Vinay
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.*,java.util.*" %>

<html>
<%
    
    try
{
    String f="";
    f=request.getParameter("f");
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","");
    PreparedStatement ps = null;
    String sql = "select Subject,BookName,Price,Image from books where BookID='"+f+"'";
    ps = conn.prepareStatement(sql);
    ResultSet rs = ps.executeQuery();
    ResultSetMetaData rmd; 
    rmd =rs.getMetaData();
    int n=rmd.getColumnCount();
    String s="",s2="",s1="",s3="";
    while (rs.next())
    {
            for(int x=1;x<=n;x++)
            {
                     if(x==1)
                {
                     s=rs.getString(x);

                }
                     else if(x==2)
                {
                     s1=rs.getString(x);

                } 
                     else if(x==3)
                {
                    s2=rs.getString(x);
                }
                else
                {
                       s3=rs.getString(x);
                }
           }   
    }
    ps = conn.prepareStatement("insert into addtocart (Subject ,BookName, Image ,Price,BID) values (?,?,?,?,?)");
    ps.setString(1, s);
    ps.setString(2, s1);
    ps.setString(3, s3);
    ps.setString(4, s2);
    ps.setString(5, f);

    int count = ps.executeUpdate();
    ps.close(); 
    String sql1 = "select Subject ,BookName, Image ,Price,BID from addtocart";
    ps = conn.prepareStatement(sql1);
    rs = ps.executeQuery();
    out.println("<table class='w3-table-all' border=1 align=center width=50% bordercolor='#e0e0eb'><tr class='w3-hover-light-gray'>");
    rmd =rs.getMetaData();
    int n1=rmd.getColumnCount();
        out.println("<td><b><font size=5>CART</font></b></td>");
    String s5="",s6="", BID="";
    while (rs.next())
    {
        out.println("<tr>");
            for(int x=1;x<=n1;x++)
            {
                if(x==3)
                {
                    s6=rs.getString(x);
                    out.println("<td><center><img src='images/"+s6+"'  height='100' width='100'> </center></td>");
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
            out.println("<td><b><a href=deletebooks.jsp?f="+BID+">DELETE</b><a/></td>");
            out.println("</tr>");
    }
    out.println("<td><b><a href=bill_1.jsp?f="+BID+">BUY NOW</b><a/></td>");
    out.println("<td><b><a href=deleteall.jsp>DELETE ALL</b><a/></td>");

    
    rs.close();
    conn.close();
}
    catch(Exception e)
    {out.println(e);
        
    }
%>
</html>


