package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.security.Key;
import java.sql.*;
import java.util.*;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            public class staffreg{
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
    String decrypt(String value) throws Exception
    {
        Key key = generateKey();
        Cipher cipher = Cipher.getInstance(staffreg.ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte [] decryptedValue64 = new BASE64Decoder().decodeBuffer(value);
        byte [] decryptedByteValue = cipher.doFinal(decryptedValue64);
        String decryptedValue = new String(decryptedByteValue,"utf-8");
        return decryptedValue;
                
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("  font-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("* {\r\n");
      out.write("  box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* style the container */\r\n");
      out.write(".container {\r\n");
      out.write("  position: relative;\r\n");
      out.write("  border-radius: 5px;\r\n");
      out.write("  background-color: #f2f2f2;\r\n");
      out.write("  padding: 20px 0 30px 0;\r\n");
      out.write("} \r\n");
      out.write("\r\n");
      out.write("/* style inputs and link buttons */\r\n");
      out.write("input,\r\n");
      out.write(".btn {\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  padding: 12px;\r\n");
      out.write("  border: none;\r\n");
      out.write("  border-radius: 4px;\r\n");
      out.write("  margin: 5px 0;\r\n");
      out.write("  opacity: 0.85;\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  font-size: 17px;\r\n");
      out.write("  line-height: 20px;\r\n");
      out.write("  text-decoration: none; /* remove underline from anchors */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input:hover,\r\n");
      out.write(".btn:hover {\r\n");
      out.write("  opacity: 1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* add appropriate colors to fb, twitter and google buttons */\r\n");
      out.write(".fb {\r\n");
      out.write("  background-color: #3B5998;\r\n");
      out.write("  color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".twitter {\r\n");
      out.write("  background-color: #55ACEE;\r\n");
      out.write("  color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".google {\r\n");
      out.write("  background-color: #dd4b39;\r\n");
      out.write("  color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* style the submit button */\r\n");
      out.write("input[type=submit] {\r\n");
      out.write("  background-color: #4CAF50;\r\n");
      out.write("  color: white;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=submit]:hover {\r\n");
      out.write("  background-color: #45a049;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Two-column layout */\r\n");
      out.write(".col {\r\n");
      out.write("  float: left;\r\n");
      out.write("  width: 50%;\r\n");
      out.write("  margin: auto;\r\n");
      out.write("  padding: 0 50px;\r\n");
      out.write("  margin-top: 6px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Clear floats after the columns */\r\n");
      out.write(".row:after {\r\n");
      out.write("  content: \"\";\r\n");
      out.write("  display: table;\r\n");
      out.write("  clear: both;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* vertical line */\r\n");
      out.write(".vl {\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  left: 50%;\r\n");
      out.write("  transform: translate(-50%);\r\n");
      out.write("  border: 2px solid #ddd;\r\n");
      out.write("  height: 175px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* text inside the vertical line */\r\n");
      out.write(".vl-innertext {\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  top: 50%;\r\n");
      out.write("  transform: translate(-50%, -50%);\r\n");
      out.write("  background-color: #f1f1f1;\r\n");
      out.write("  border: 1px solid #ccc;\r\n");
      out.write("  border-radius: 50%;\r\n");
      out.write("  padding: 8px 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* hide some text on medium and large screens */\r\n");
      out.write(".hide-md-lg {\r\n");
      out.write("  display: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* bottom container */\r\n");
      out.write(".bottom-container {\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  background-color: #666;\r\n");
      out.write("  border-radius: 0px 0px 4px 4px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media screen and (max-width: 650px) {\r\n");
      out.write("  .col {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    margin-top: 0;\r\n");
      out.write("  }\r\n");
      out.write("  /* hide the vertical line */\r\n");
      out.write("  .vl {\r\n");
      out.write("    display: none;\r\n");
      out.write("  }\r\n");
      out.write("  /* show the hidden text on small screens */\r\n");
      out.write("  .hide-md-lg {\r\n");
      out.write("    display: block;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"noBack();\" onpageshow=\"if (event.persisted) noBack();\" onunload=\"\">\r\n");
      out.write("<h1>  Book Mart Login </h1>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("  <form action=\"login.jsp\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("      <h2 style=\"text-align:center\">Login with Social Media or Manually</h2>\r\n");
      out.write("      <div class=\"vl\">\r\n");
      out.write("        <span class=\"vl-innertext\">or</span>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"col\">\r\n");
      out.write("        <a href=\"https://www.facebook.com/\" class=\"fb btn\">\r\n");
      out.write("          <i class=\"fa fa-facebook fa-fw\"></i> Login with Facebook\r\n");
      out.write("         </a>\r\n");
      out.write("        <a href=\"https://twitter.com/login?lang=en\" class=\"twitter btn\">\r\n");
      out.write("          <i class=\"fa fa-twitter fa-fw\"></i> Login with Twitter\r\n");
      out.write("        </a>\r\n");
      out.write("        <a href=\"https://myaccount.google.com/\" class=\"google btn\"><i class=\"fa fa-google fa-fw\">\r\n");
      out.write("          </i> Login with Google+\r\n");
      out.write("        </a>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"col\">\r\n");
      out.write("        <div class=\"hide-md-lg\">\r\n");
      out.write("          <p>Or sign in manually:</p>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <input type=\"text\" name=\"email\" placeholder=\"Email\" required>\r\n");
      out.write("        <input type=\"password\" name=\"password\" placeholder=\"Password\" required>\r\n");
      out.write("        <input type=\"submit\" value=\"Login\">\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("    </div>\r\n");
      out.write("  </form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"bottom-container\">\r\n");
      out.write("  <div class=\"row\">\r\n");
      out.write("    <div class=\"col\">\r\n");
      out.write("      <a href=\"signup.jsp\" style=\"color:white\" class=\"btn\">Sign up</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col\">\r\n");
      out.write("      <a href=\"forgotpass.jsp\" style=\"color:white\" class=\"btn\">Forgot password?</a>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("        ");
      out.write(' ');
      out.write(' ');
    
try{
    String password1="";
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","");
    Statement st = con.createStatement();
    ResultSet rs;
    String email = request.getParameter("email");
    String p = request.getParameter("password");
    if((email.equals("admin@gmail.com"))||(p.equals("admin")))
    {		
        session.setAttribute("email", email);
        response.sendRedirect("admin.jsp");
    }
    else
    {
        PreparedStatement ps = null;
        session.setAttribute("email", "Vinay@gmail.com");
        String sql = "select * from logintab where email='"+email+"'";
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        ResultSetMetaData rmd; 
        rmd =rs.getMetaData();
        int n=rmd.getColumnCount();
        while (rs.next())
        {
            for(int x=1;x<=n;x++)
            {
                if(x==2)
                {
                    password1=rs.getString(x);
                }
            }
            out.println(password1);
            staffreg staffreg=new staffreg();
            String decryptedPassword = staffreg.decrypt(password1);
            out.println(decryptedPassword);
            if(p.equals(decryptedPassword))
            {
                out.println("<b>welcome</b>");
                response.sendRedirect("mainshoping.jsp");                
            }
            else
            {
                   out.println("<b>welcome</b>");
                response.sendRedirect("mainshoping.jsp"); 
            }
        }
    }
 }
 catch(Exception e)
 {
} 
	



      out.write('\r');
      out.write('\n');
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
