<%@page import="java.io.InputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.File"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.*,java.util.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin</title>
        <link href="stylesheet.css" type="text/css" rel="stylesheet" media="all" />
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
        <style type="text/css">
            body
            {
                background-color:rgb(234,234,234);
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
                color:rgb(102,160,50);
            }
            h2
            {
                text-align:center;
                color:olive;
                font-size:30px;
            }
        </style>
        
    </head>
    <body>
       
            <table border="0">
                <tr><td><h1> Book Shop Admin Page</h1></td></tr><tr>
                    <td class="header">
                        <img src="images/books.jpg" width="1310px" height="350px"/>                    
                    </td>
                </tr>
                <tr>
                    <td class="menu">
                       <ul>
                            <li><a  href="#home">Add Record</a></li>
                            <li><a class="active" href="Delete.jsp">Delete Record</a></li>
                            <li><a href="Update.jsp">Update Record</a></li>
                            <li><a href="View.jsp">View Record</a></li>
                            <li style="float:right"><a href="logout.jsp">Logout</a>
                      </ul>
                    </td>
                </tr>
                <tr>
                    <td>
                        <h2>Delete Record</h2>
                    </td>
                </tr>
                    <form name="form_insert" action="Delete.jsp" method="post" >
                        <table border="0" align="center">
                            <tr>
                                   <td class="lbl_txt">Subject :</td>
                                    <td><select name="Subject">
                                        <option value="Engineering">Engineering</option>
                                        <option value="Computer Science">Computer Science</option>
                                        <option value="Medical">Medical</option>
                                        <option value="Architecture">Architecture</option>
                                        <option value="Banking">Banking</option>
                                      </select> 
                                        </td>
                               </tr>
                               <tr>
                                   <td class="lbl_txt">Book Name :</td>
                                   <td><input type="text" name="Bname" class="txt" /></td>
                               </tr>
                        <tr>
                            <td align="center" colspan="2">
                                <input type="submit" name="delete" value="Delete" class="btn">
                            </td>
                        </tr>
                        <tr>
                           <td align="center" colspan="2">
                              <a href="View.jsp">View Records</a>
                           </td>
                        </tr>
                    </table>
                    </form>
                <tr>
                    
                </tr>
          </table>

    </body>
</html>
<%
    try
{
Connection conn=null;
PreparedStatement pstmt = null;
ResultSet rs=null;
String url= "jdbc:mysql://localhost:3306/shopping";
Statement st = conn.createStatement();
String Sub=request.getParameter("Subject");
String bname=request.getParameter("Bname");


    Class.forName("com.mysql.jdbc.Driver").newInstance();
    conn=DriverManager.getConnection(url,"root", "");
    rs = st.executeQuery("select * from Books where BookName='" + bname + "'");
    if (rs.next()) 
    {
       pstmt = conn.prepareStatement("delete from Books where BookName ='"+bname+"'");
       int count = pstmt.executeUpdate();
       out.println("Deleted successfully");
   }
   else
   {  
       out.println("Book Not Found");
   }
}
catch(Exception e)
{
}
%>
