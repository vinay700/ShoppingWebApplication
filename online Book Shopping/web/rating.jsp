<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<html>
<body>
    <p>Rating for <b>Software Engineering </b>
<link rel="stylesheet" href="style.css" />
<form id="ratingsForm" action="rating.jsp" method="post">
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
String r=request.getParameter("star");
String p=request.getParameter("p");
try
{
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    conn=DriverManager.getConnection(url,"root", "");
    pstmt = conn.prepareStatement("update buynow set where rating=? where BID=?");
    pstmt.setString(1, r);
    pstmt.setString(2, p);
    int count = pstmt.executeUpdate();
    response.sendRedirect("mainshoping.jsp");  
    rs.close();
    pstmt.close();
    conn.close();
}
catch(Exception e)
{
    
}


%>