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
    String u=(String)session.getAttribute("email");
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","");
    PreparedStatement ps = null;
    String sql = "select email,Subject ,BookName, Image ,Price, BID from buynow where email='"+u+"'";
    ps = conn.prepareStatement(sql);
    ResultSet rs = ps.executeQuery();
    ResultSetMetaData rmd; 
    out.println("<table class='w3-table-all' border=1 align=center width=50% bordercolor='#e0e0eb'><tr class='w3-hover-light-gray'>");
    rmd =rs.getMetaData();
    int n=rmd.getColumnCount();
    String s="",s2="",s1="",s3="",s4="";
    while (rs.next())
    {
        for(int x=1;x<=n;x++)
        {
                 if(x==1)
            {
                 s=rs.getString(x);
                 out.println("<b>"+s+"</b><br>");

            }
                 else if(x==2)
            {
                 s1=rs.getString(x);
                 out.println("<td><b>"+s1+"</b></td>");

            } 
                 else if(x==4)
            {
                s2=rs.getString(x);
                out.println("<td><img src='images/"+s2+"'  height='100' width='100'></td> ");
            }
                 else if(x==6)
            {
                   s3=rs.getString(x);
            }
                 else 
            {
                   s4=rs.getString(x);
                   out.println("<td><b>"+s4+"</b></td>");
            }
       }  
       out.println("<td><b><a href=rating.jsp?p="+s3+">Add Book Rating</b><a/></td>");
       out.println("</tr>");
    }
        out.println("</table><br>");

    rs.close();
    conn.close();
    }
    catch(Exception e)
    {
        out.println(e);        
    }
%>
</html>


