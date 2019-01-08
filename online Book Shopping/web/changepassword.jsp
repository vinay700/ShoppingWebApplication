<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Change Password</title>
    </head>
    <body>
        <form action="changepassword.jsp" >
            <input type="text" name="email" placeholder="Enter Your EmailID" size="50">
            <br><br>
            <input type="password" name="passP" placeholder="Enter your old Password" size="50">
            <br><br>
            <input type="password" name="passFP" placeholder="Enter your new Password" size="50">
            <br><br>
            <input type="password" name="repassFP" placeholder="Re-Enter your new Password" size="50">
            <br><br>            
            <input type="submit"  value="Change Password">
        </form>
    </body>
</html>

<%
    String email = request.getParameter("email");
    String passP = request.getParameter("passP");
    String passFP = request.getParameter("passFP");
    String repassFP = request.getParameter("repassFP");

    try{
        if(passFP.equals(repassFP))
        {
            PreparedStatement ps;
            ResultSet rs;
            String query;

            try
            {
                 Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping", "root","");
                query = "select * from logintab where email=? and password=?";
                ps = con.prepareStatement(query);
                ps.setString(1, email);
                ps.setString(2, passP);
                rs = ps.executeQuery();

                if(rs.next())
                {
                    query = "update logintab set password=? where email=?";
                    ps = con.prepareStatement(query);
                    ps.setString(1,passFP);
                    ps.setString(2,email);
                    ps.executeUpdate();
                    out.println("<br> Password Changed Successfully... Please <a href=\"login.jsp\"> Click Here </a> to login... <br>");
                }
                else
                {
                    out.println("Invalid Credentials provided!!!!");
                }

            }
            catch(SQLException e)
            {
                out.println(e);
            }

        }
    }
    catch(Exception e)
    {
        out.println(e);
    }
     
%>


