<%-- 
    Document   : View
    Created on : Oct 25, 2015, 7:54:44 PM
    Author     : OM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin</title>
        <link href="stylesheet.css" type="text/css" rel="stylesheet" media="all" />
        <style type="text/css">
            body
            {
                background-color:rgb(237,218,193);
            }
            .wel
            {
              color:rgb(121,56,250);
              font-size:24px;
            }
            .bm
            {
                color:red;
                font-size:18px;
            }
            a
            {
                text-decoration:none;
                color:maroon;
                font-size:20px;
            }
            a:hover
            {
                text-decoration:underline;
                color:rgb(90,216,210);
            }
            h2
            {
                text-align:center;
                color:olive;
                font-size:30px;
            }
           
        </style>
         <style>
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
}

li {
    float: left;
}

li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover {
    background-color: #111;
}
.active {
    background-color: #4CAF50;
}
</style>
        
    </head>
    <body>
        
            <table border="0">
                <tr>
                    <td class="top">
                       
                    </td>
                </tr>
                <tr>
                    <td class="header">
                        <img src="images/books.jpg" width="1310px" height="350px"/>                    
                    </td>
                </tr>
                <tr>
                    <td class="menu">
                       <ul>
                            <li><a  href="admin.jsp">Add Record</a></li>
                            <li><a href="Delete.jsp">Delete Record</a></li>
                            <li><a href="Update.jsp">Update Record</a></li>
                            <li><a class="active" href="View.jsp">View Record</a></li>
                            <li style="float:right"><a href="logout.jsp">Logout</a>
                      </ul>
                    </td>
                </tr>
</form>
</html> 
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
    ResultSetMetaData rmd;
    String s1="select * from books";
    rs = stmt.executeQuery(s1);
    out.println("<table border=2 align=center width=50% bordercolor=blue ><tr>");
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
                     s=rs.getString(x);
                     out.println("<td><b>"+s+"</b></td>");	  
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
