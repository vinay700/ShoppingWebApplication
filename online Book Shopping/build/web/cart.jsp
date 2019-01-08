<%-- 
    Document   : cart.jsp
    Created on : 1 Aug, 2018, 12:21:59 PM
    Author     : Vinay
--%>

<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

<%
    try
{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/shopping","root",""); 
    Statement stmt=con.createStatement();
    ResultSet rs;
    ResultSetMetaData rmd;
    String s1="select Image,Price,BookName,Subject from addtocart";
    rs = stmt.executeQuery(s1);
    out.println("<table class='w3-table-all' border=1 align=center width=50% bordercolor='#e0e0eb'><tr class='w3-hover-light-gray'>");
    rmd =rs.getMetaData();
    int n=rmd.getColumnCount();
    for(int i=1;i<=n+1;i++)
    {
        if(i<=n)
        out.println("<td><b><font size=5>"+rmd.getColumnName(i)+"</font></b></td>");
    }
    String s="",s5="";
    while (rs.next())
    {
        out.println("<tr>");
            for(int x=1;x<=n;x++)
            {
                     if(x==1)
                {
                     s=rs.getString(x);
                     out.println("<td><center><img src='images/"+s+"'  height='100' width='100'> </center></td>");

                }
                     else if(x==2)
                {
                     s=rs.getString(x);
                     out.println("<td><b>"+s+".00</b></td>");

                } 
                else if(x==3)
                {
                    s=rs.getString(x);
                    out.println("<td><b>"+s+"</b></td>");
                }
                else if(x==4)
                {
                    s=rs.getString(x);
                    out.println("<td><b>"+s+"</b></td>");

                }
            }   
            out.println("</tr>");
    }
    out.println("</table><br></body></html>");
    rs.close();
    stmt.close();
    con.close();

    
}
  catch(Exception e)
    {
      out.println(e);
    }
%>
</body>
</html>
