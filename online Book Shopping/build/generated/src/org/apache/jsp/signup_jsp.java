package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import sun.misc.BASE64Encoder;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.AddressException;
import java.util.regex.Pattern;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.sql.*;
import java.sql.*;
import java.util.*;
import java.util.Base64.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


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
    }
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=iso-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"signup.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"signup.jsp\" style=\"border:1px solid #ccc\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <h1>Sign Up</h1>\r\n");
      out.write("    <p>Please fill in this form to create an account.</p>\r\n");
      out.write("    <hr>\r\n");
      out.write("\r\n");
      out.write("    <label for=\"email\"><b>Email</b></label>\r\n");
      out.write("    <input type=\"text\" placeholder=\"Enter Email\" name=\"email\" required>\r\n");
      out.write("\r\n");
      out.write("    <label for=\"psw\"><b>Password</b></label>\r\n");
      out.write("    <input type=\"password\" placeholder=\"Enter Password\" name=\"psw\" required>\r\n");
      out.write("\r\n");
      out.write("    <label for=\"psw-repeat\"><b>Repeat Password</b></label>\r\n");
      out.write("    <input type=\"password\" placeholder=\"Repeat Password\" name=\"psw-repeat\" required>\r\n");
      out.write("\r\n");
      out.write("    <label>\r\n");
      out.write("      <input type=\"checkbox\" checked=\"checked\" name=\"remember\" style=\"margin-bottom:15px\"> Remember me\r\n");
      out.write("    </label>\r\n");
      out.write("\r\n");
      out.write("    <p>By creating an account you agree to our <a href=\"#\" style=\"color:dodgerblue\">Terms & Privacy</a>.</p>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"clearfix\">\r\n");
      out.write("      <a href=\"onlineshop.jsp\"><button type=\"button\" class=\"cancelbtn\">Cancel</button></a>\r\n");
      out.write("      <button type=\"submit\" class=\"signupbtn\">Sign Up</button>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write('\r');
      out.write('\n');

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
out.print(e);
}

      out.write(' ');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
