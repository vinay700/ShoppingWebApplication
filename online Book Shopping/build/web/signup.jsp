    <%@page import="sun.misc.BASE64Encoder"%>
<%@page import="javax.mail.internet.InternetAddress"%>
<%@page import="javax.mail.internet.AddressException"%>
<%@page import="java.util.regex.Pattern"%>
<%@page import="java.security.Key,javax.crypto.Cipher,javax.crypto.spec.SecretKeySpec" %>

<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<%@page import="java.sql.*,java.util.*, java.util.Base64.*"%><head>
    <link rel="stylesheet" href="signup.css">
</head>



<form action="signup.jsp" style="border:1px solid #ccc">
  <div class="container">
    <h1>Sign Up</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>

    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required>

    <label for="psw-repeat"><b>Repeat Password</b></label>
    <input type="password" placeholder="Repeat Password" name="psw-repeat" required>

    <label>
      <input type="checkbox" checked="checked" name="remember" style="margin-bottom:15px"> Remember me
    </label>

    <p>By creating an account you agree to our <a href="#" style="color:dodgerblue">Terms & Privacy</a>.</p>

    <div class="clearfix">
      <a href="onlineshop.jsp"><button type="button" class="cancelbtn">Cancel</button></a>
      <button type="submit" class="signupbtn">Sign Up</button>
    </div>
  </div>
</form>



        <%!
            public class staffreg
    {
                static final String ALGORITHM = "AES";
                static final String KEY = "1Hbfh667adfDEJ78";
             String encrypt(String value) throws Exception
            {
                Key key = generateKey();
                Cipher cipher = Cipher.getInstance(staffreg.ALGORITHM);
                cipher.init(Cipher.ENCRYPT_MODE, key);
                byte [] encryptedByteValue = cipher.doFinal(value.getBytes("utf-8"));
                String encryptedValue64 = new BASE64Encoder().encode(encryptedByteValue);
                return encryptedValue64;
            }
            Key generateKey() throws Exception 
            {
                Key key = new SecretKeySpec(staffreg.KEY.getBytes(),staffreg.ALGORITHM);
                return key;
            }
    }%>
<%
String email=request.getParameter("email");
String pass=request.getParameter("psw");
String repass=request.getParameter("psw-repeat");
 staffreg staffreg=new staffreg();
 String pass1 = staffreg.encrypt("pass");

try
{
        out.println("<b>" +pass+" ");
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","");
	Statement st=conn.createStatement();
	if(pass.equals(repass))
	{
		int i=st.executeUpdate("insert into logintab(email,password,repassword)values('"+email+"','"+pass1+"','"+repass+"')");
		out.println("<html><body><b><h1>Registered successfully </h1></b></body></html>");
	}
	else{
	out.println("<b><h1>Password doesnot match</h1></b>");
	}

}
catch(Exception e)
{
out.println("invalid Email ID");
}
%> 