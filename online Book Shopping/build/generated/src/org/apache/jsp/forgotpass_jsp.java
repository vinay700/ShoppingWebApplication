package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import java.util.Random;
import javax.swing.JOptionPane;
import java.util.Properties;
import java.util.*;
import java.io.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Random;

public final class forgotpass_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>Epost2018</title>\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html;charset=utf-8\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" media=\"screen\" />\n");
      out.write("<style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write(".style1 {color: #000000}\n");
      out.write(".style2 {color: #275050;\n");
      out.write("\tfont-size: 24px;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("}\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div id=\"wrap\">\n");
      out.write("  <div id=\"top\">\n");
      out.write("    <div id=\"menu\">\n");
      out.write("      <ul>\n");
      out.write("    \t\t\t\t\t <li ><a href=\"epws.jsp\">EditPass</a></li>\n");
      out.write("                        <li ><a href=\"savcer.jsp\">saving certificates</a></li>\n");
      out.write("                        <li ><a href=\"regpost.jsp\">Reg Post</a></li>\n");
      out.write("                     <li><a href=\"compplaints.jsp\">Complaints</a></li>\n");
      out.write("\t\t\t\t\t   <li><a href=\"reports.jsp\">Reports</a></li>\n");
      out.write("\t\t\t\t\t    <li><a href=\"index.jsp\">SignOut</a></li> \n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\t\t\t<section class=\"about text-center\" id=\"about\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t  <div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<h3>Reset Password </h3>\n");
      out.write("\t\t\t\t\t\t<h4><form id=\"contact-form\" action=\"\">\n");
      out.write("      \t\t<label class=\"phone\">Log As:\n");
      out.write("\t\t\t<select name=\"select\" class=\"phone\">\n");
      out.write("\t\t\t  <option value=\"Admin\">Admin</option>\n");
      out.write("\t\t\t  <option value=\"Staff\">Staff</option>\n");
      out.write("\t\t    </select>\n");
      out.write("                </label></br>\n");
      out.write("                        <br>\n");
      out.write("\t\t\t<label>Email Id :\n");
      out.write("\t\t\t<input type=\"text\" name=\"textfield\" required=\"required\">\n");
      out.write("\t\t\t</label></br>\n");
      out.write("                                                        </br>\n");
      out.write("    <label> Password:\n");
      out.write("        <input type=\"password\" name=\"textfield2\" required=\"required\">\n");
      out.write("    </label></br>  \n");
      out.write("    </br>\n");
      out.write("\t\t\t\t\t\t<label>\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" name=\"Submit\" value=\"Reset Password\">\n");
      out.write("\t\t\t\t\t\t</label>\n");
      out.write("                                                </div>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t</h4>\n");
      out.write("\t\t\t\t  </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</section>\n");
      out.write("<section class=\"team\" id=\"team\">\n");
      out.write("  <div align=\"center\"><strong><a href=\"signin.jsp\">Sign In</a> </strong></div>\n");
      out.write("          <div align=\"center\">\n");
      out.write("              <span class=\"wow zoomIn\">\n");
      out.write("            \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \"\n");
      out.write("                ");

	String mailid = request.getParameter("textfield");
        String password = request.getParameter("textfield2");
	String group = request.getParameter("select");
        Random rand = new Random();
        int i=rand.nextInt();
        String randomString="";
        randomString=randomString.valueOf(i);
	try {
       Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/epost2018","root","mysql"); 
        Statement stmt=con.createStatement();
	  ResultSet rs;			
	  if(group.equals("Admin"))
	  {
		  rs=stmt.executeQuery("select * from login where uname="+"'"+mailid+"'");
		int found=0;
	      while(rs.next())
    	  {
				found++;
			}
		if(found==0)
		{
				out.println("Sorry, invalid login");
		}
		else
		{	
		  String str="Update login set p=? where u=?";
		  		PreparedStatement psmt =con.prepareStatement(str);
				psmt.setString(1,password);
				psmt.setString(2,mailid);
				psmt.executeUpdate();
				//out.println(s1+","+s3);
				psmt.close();
				rs.close();
                                out.println("Reseted successfully..");
		}	
	}
	else  if(group.equals("Staff"))
	{
		  rs=stmt.executeQuery("select * from staff where email="+"'"+mailid+"'");
		int found=0;
	      while(rs.next())
    	  {
				found++;
			}
		if(found==0)
		{
				out.println("Sorry, invalid login");
		}
		else
		{	
		  String str="Update staff set pwd=? where email=?";
		  		PreparedStatement psmt =con.prepareStatement(str);
				psmt.setString(1,password);
				psmt.setString(2,mailid);
				psmt.close();
				rs.close();
                                session.removeAttribute(mailid);
	
		}	
	
	
	
	}
	
        Properties props = new Properties();
        props.put("mail.smtp.host", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        //Establishing a session with required user details
        Session session1 = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("bhavyajyothihn@gmail.com", "nagarathna123");
            }
        });
        try {
            //Creating a Message object to set the email content
            MimeMessage msg = new MimeMessage(session1);
            //Storing the comma seperated values to email addresses
            String to = "bhavyahn18@gmail.com,bhavyajyothihn@gmail.com";
            /*Parsing the String with defualt delimiter as a comma by marking the boolean as true and storing the email
            addresses in an array of InternetAddress objects*/
            InternetAddress[] address = InternetAddress.parse(to, true);
            //Setting the recepients from the address variable
            msg.setRecipients(Message.RecipientType.TO, address);
            String timeStamp = new SimpleDateFormat("yyyymmdd_hh-mm-ss").format(new Date());
            msg.setSubject("Sample Mail : " + timeStamp);
            msg.setSentDate(new Date());
            //msg.setText("Sampel System Generated mail");
            msg.setText(randomString);
            msg.setHeader("XPriority", "1");
            Transport.send(msg);
            out.println("Mail has been sent successfully");
        }
        catch (MessagingException mex) {
           out.println("Unable to send an email" + mex);
        }
	}
        

	catch (Exception ex) {
		out.println(ex);
	}

      out.write("\n");
      out.write("       </span>   \n");
      out.write("          </div>\n");
      out.write("</section>\n");
      out.write("<!-- end of team section -->\n");
      out.write("\n");
      out.write("\t\t\t<!-- map section -->\n");
      out.write("\t\t\t<section class=\"api-map\" id=\"contact\">\n");
      out.write("\t\t\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t\t  <div class=\"row\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</section><!-- end of map section -->\n");
      out.write("\n");
      out.write("\t\t\t<!-- contact section starts here -->\n");
      out.write("\t\t\t<!-- end of contact section -->\n");
      out.write("            <!-- footer starts here -->\n");
      out.write("<div id=\"footer\">\n");
      out.write("    <p>Copyright 2006 Epost2018. Design by <a href=\"http://www.colorlightstudio.com\">Igor Penjivrag</a></p>\n");
      out.write("  </div>\n");
      out.write("<div align=center>This template  downloaded form <a href='#'>free website templates</a></div></body>\n");
      out.write("</html>");
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
