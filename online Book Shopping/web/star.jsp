<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<html>
<body>
<link rel="stylesheet" href="style.css" />
<form id="ratingsForm" action="star.jsp" method="post">
	<div class="stars">
		<input name="star" type="radio" class="star-1" id="star-1" value="1" />
		<label class="star-1" for="star-1">1</label>
		<input name="star" type="radio" class="star-2" id="star-2" value="2" />
		<label class="star-2" for="star-2">2</label>
		<input name="star" type="radio" class="star-3" id="star-3" value="3" />
		<label class="star-3" for="star-3">3</label>
		<input name="star" type="radio" class="star-4" id="star-4" value="4" />
		<label class="star-4" for="star-4">4</label>
		<input name="star" type="radio" class="star-5" id="star-5" value="5" />
		<label class="star-5" for="star-5">5</label>
		<span></span>
	</div>
    <input type=submit value="submit" >
</form>
</body>
</html>
<%
        

Connection conn=null;
PreparedStatement pstmt = null;
ResultSet rs=null;
String url= "jdbc:mysql://localhost:3306/shopping";
String Sub=request.getParameter("Subject");
String bname=request.getParameter("Bname");
String Aname=request.getParameter("Aname");
String Publisher=request.getParameter("Publisher");
String Price=request.getParameter("Price");
String Image=request.getParameter("Image");
String r=request.getParameter("star");


try
{
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    conn=DriverManager.getConnection(url,"root", "");
    pstmt = conn.prepareStatement("insert into books (Subject ,BookName, AuthorName, Publisher ,Price,Image ,Rating) values (?,?,?,?,?,?,?)");
    pstmt.setString(1, Sub);
    pstmt.setString(2, bname);
    pstmt.setString(3, Aname);
    pstmt.setString(4, Publisher);
    pstmt.setString(5, Price);
    pstmt.setString(6, Image);
    pstmt.setString(7, r);
    int count = pstmt.executeUpdate();
    out.println("Book Added successfully");
    rs.close();
    pstmt.close();
    conn.close();
}
catch(Exception e)
{
    out.println(e);
}


%>