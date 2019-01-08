<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<title>Epost2018</title>
<meta http-equiv="content-type" content="text/html;charset=utf-8" />
<link rel="stylesheet" type="text/css" href="style.css" media="screen" />
<style type="text/css">
<!--
.style1 {color: #000000}
.style2 {color: #275050;
	font-size: 24px;
	font-weight: bold;
}
-->
</style>
</head>
<body>

    <div id="wrap">
  <div id="top">
    <div id="menu">
      <ul>
    					 <li ><a href="epws.jsp">EditPass</a></li>
                        <li ><a href="savcer.jsp">saving certificates</a></li>
                        <li ><a href="regpost.jsp">Reg Post</a></li>
                     <li><a href="compplaints.jsp">Complaints</a></li>
					   <li><a href="reports.jsp">Reports</a></li>
					    <li><a href="index.jsp">SignOut</a></li> 
      </ul>
    </div>
  </div>
			<section class="about text-center" id="about">
				<div class="container">
				  <div class="row">
						<h3>Reset Password </h3>
						<h4><form id="contact-form" action="">
      		<label class="phone">Log As:
			<select name="select" class="phone">
			  <option value="Admin">Admin</option>
			  <option value="Staff">Staff</option>
		    </select>
                </label></br>
                        <br>
			<label>Email Id :
			<input type="text" name="textfield" required="required">
			</label></br>
                                                        </br>
    <label> Password:
        <input type="password" name="textfield2" required="required">
    </label></br>  
    </br>
						<label>
						<input type="submit" name="Submit" value="Reset Password">
						</label>
                                                </div>
						</form>
			</h4>
				  </div>
				</div>
			</section>
<section class="team" id="team">
  <div align="center"><strong><a href="signin.jsp">Sign In</a> </strong></div>
          <div align="center">
              <span class="wow zoomIn">
            <%@page import="javax.mail.*"%>
                <%@page import="javax.mail.internet.*"%>
                <%@page import="javax.activation.*"%>
                <%@page import="java.util.Random"%>
                <%@page import="javax.swing.JOptionPane"%>
                <%@page import="java.util.Properties"%>
                <%@page import="java.util.*,java.io.*"%>
                <%@page import ="java.sql.*"%>
                <%@page import ="java.text.SimpleDateFormat"%>
                <%@page import ="java.util.Date"%>
                <%@page import ="java.util.Properties"%>
                <%@page import ="javax.mail.Message"%>
                <%@page import ="javax.mail.MessagingException"%>
                <%@page import ="javax.mail.PasswordAuthentication"%>
                <%@page import ="javax.mail.Session"%>
                <%@page import ="javax.mail.Transport"%>
                <%@page import ="javax.mail.internet.InternetAddress"%>
                <%@page import ="javax.mail.internet.MimeMessage"%>
                <%@page import ="java.util.Random"%>"
                <%
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
%>
       </span>   
          </div>
</section>
<!-- end of team section -->

			<!-- map section -->
			<section class="api-map" id="contact">
				<div class="container-fluid">
				  <div class="row"></div>
				</div>
			</section><!-- end of map section -->

			<!-- contact section starts here -->
			<!-- end of contact section -->
            <!-- footer starts here -->
<div id="footer">
    <p>Copyright 2006 Epost2018. Design by <a href="http://www.colorlightstudio.com">Igor Penjivrag</a></p>
  </div>
<div align=center>This template  downloaded form <a href='#'>free website templates</a></div></body>
</html>