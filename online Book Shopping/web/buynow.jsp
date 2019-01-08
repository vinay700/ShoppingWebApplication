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
    String f=request.getParameter("f");
    String u=(String)session.getAttribute("email");
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","");
    PreparedStatement ps = null;
    String sql = "select Subject,BookName,Price,Image,BookID from books where BookID='"+f+"'";
    ps = conn.prepareStatement(sql);
    ResultSet rs = ps.executeQuery();
    ResultSetMetaData rmd; 
    rmd =rs.getMetaData();
    int n=rmd.getColumnCount();
    String s="",s2="",s1="",s3="",s8="5",s4="";
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
                     else if(x==5)
                {
                       s3=rs.getString(x);
                }
                else
                {
                    s4=rs.getString(x);
                }
           }   
    }
    ps = conn.prepareStatement("insert into buynow (email, Subject ,BookName, Image ,Price,rating,BID) values (?,?,?,?,?,?,?)");
    ps.setString(1, u);
    ps.setString(2, s);
    ps.setString(3, s1);
    ps.setString(4, s4);
    ps.setString(5, s2);
    ps.setString(6, s8);
    ps.setString(7, s3);
    int count = ps.executeUpdate();
    response.sendRedirect("ackno.jsp");                
    ps.close();    
    rs.close();
    conn.close();
    
}
    catch(Exception e)
    {
        out.println(e);
    }
%>
</html>


