<%-- 
    Document   : bill-1
    Created on : 30 Jul, 2018, 12:23:47 PM
    Author     : Vinay
--%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <table border="0" align="center">
        <form action="bill_1.jsp">
            <tr>
                <td>
                    <% String u=(String)session.getAttribute("email");
                    out.println(u);%>
                </td>
            </tr>
        <tr>
            <td class="lbl_txt">Name:</td>
            <td class="lbl_txt"><input type="text" name="name"class="txt" ><br>
            </td>
        </tr>
        <tr>
            <td class="lbl_txt">Contact Number:</td>
            <td class="lbl_txt">
            <input type="text" name="phno"class="txt"><br>
        </td>
        </tr>
        <tr>
            <td class="lbl_txt"> Alternate Number:</td>
            <td><input type="text" name="altnum"class="txt"><br>
            </td>
        </tr>
        <tr>
            <td class="lbl_txt">Shipping address:</td>
            <td><input type="text" name="addr"class="txt"><br></td>
            </tr>
            <tr>
            <td><input type="submit"value="Place Order"></td>
        
            <td><% 
                out.println("<a href=bill_2.jsp.jsp >Click Here</a> For Free Deliver </td>");
                %>
        </tr>
        </form>
    </table>
    </body>
</html>
<%
Connection conn=null;
PreparedStatement pstmt = null;
ResultSet rs=null;
String url= "jdbc:mysql://localhost:3306/shopping";
String Name=request.getParameter("name");
String Phno=request.getParameter("phno");
String Altnum=request.getParameter("altnum");
String Address=request.getParameter("addr");
int invoice=0;
try
{
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    conn=DriverManager.getConnection(url,"root", "");
    pstmt = conn.prepareStatement("insert into userdetail (Name ,Phno, Altnum, Address) values (?,?,?,?)");
    pstmt.setString(1, Name);
    pstmt.setString(2, Phno);
    pstmt.setString(3, Altnum);   
    pstmt.setString(4, Address);
    int count = pstmt.executeUpdate();
    for(int i=1;i<100;i++)
    {
            invoice = count+i;
    }
    out.println("invoice number"+invoice );
    session.setAttribute("invoiice", invoice);
    response.sendRedirect("bill_2.jsp");                
    rs.close();
    pstmt.close();
    conn.close();

}
catch(Exception e)
{
}


%>    </body>
</html>
