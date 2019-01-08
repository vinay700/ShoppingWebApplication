<%-- 
    Document   : Update
    Created on : Oct 26, 2015, 2:23:59 PM
    Author     : OM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update</title>
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
                            <li><a  href="Delete.jsp">Delete Record</a></li>
                            <li><a class="active"href="Update.jsp">Update Record</a></li>
                            <li><a href="View.jsp">View Record</a></li>
                            <li style="float:right"><a href="logout.jsp">Logout</a>
                      </ul>
                    </td>
                </tr>
                <tr>
                    <td>
                        <h2>Update Record</h2>
                    </td>
                </tr>
                     <tr>
                    <form name="form_updt" action="updt_valid.jsp" method="post" onsubmit="return insvalid();">
                        <table border="0" align="center">
                            <td class="lbl_txt">  Subject :</td>
                                    <td><select name="Subject">
                                            <option value="Engineering">Engineering</option>
                                            <option value="Computer Science">Computer Science</option>
                                            <option value="Medical">Medical</option>
                                            <option value="Architecture">Architecture</option>
                                            <option value="Banking">Banking</option>
                                        </select> 
                                    </td>
                               <tr>
                                   <td class="lbl_txt"> Book Name :</td>
                                   <td><input type="text" name="Bname" class="txt" /></td>
                               </tr>
                               <tr>
                                   <td class="lbl_txt"> New Price :</td>
                                   <td><input type="text" name="Price" class="txt" /></td>
                               </tr>
                               <tr>
                                   <td>
                                       <input type="submit" name="submit" value="Update" class="btn" />
                                   </td>
                                   <td>
                                       <input type="reset" value="Reset" name="reset"  class="btn" onclick="return clear();" />
                                   </td>
                               </tr>
                               <tr>
                                 <td align="center" colspan="2">
                                    <a href="View.jsp">View Records</a>
                                 </td>
                               </tr>
                        </table>
                    </form>
         

                </tr>
                
          </table>

    </body>
</html>


<%
Connection conn=null;
PreparedStatement pstmt = null;
ResultSet rs=null;
String url= "jdbc:mysql://localhost:3306/shopping";
String bname=request.getParameter("Bname");
String Price=request.getParameter("Price");

try
{
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    conn=DriverManager.getConnection(url,"root", "");
    pstmt = conn.prepareStatement("UPDATE Books SET Price = '"+Price+"' WHERE BooksName = '"+bname+"'");
    int count = pstmt.executeUpdate();
    out.println("Price Of The Book Updated successfully");
    
    
    rs.close();
    pstmt.close();
    conn.close();
}
catch(Exception e)
{
}


%>