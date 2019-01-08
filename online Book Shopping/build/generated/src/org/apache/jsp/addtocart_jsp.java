package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.*;
import java.util.*;

public final class addtocart_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");

    
    try
{
    String f="";
    f=request.getParameter("f");
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","");
    PreparedStatement ps = null;
    String sql = "select Subject,BookName,Price,Image from books where BookID='"+f+"'";
    ps = conn.prepareStatement(sql);
    ResultSet rs = ps.executeQuery();
    ResultSetMetaData rmd; 
    rmd =rs.getMetaData();
    int n=rmd.getColumnCount();
    String s="",s2="",s1="",s3="";
    while (rs.next())
    {
            for(int x=1;x<=n;x++)
            {
                     if(x==1)
                {
                     s=rs.getString(x);

                }
                     else if(x==2)
                {
                     s1=rs.getString(x);

                } 
                     else if(x==3)
                {
                    s2=rs.getString(x);
                }
                else
                {
                       s3=rs.getString(x);
                }
           }   
    }
    ps = conn.prepareStatement("insert into addtocart (Subject ,BookName, Image ,Price,BID) values (?,?,?,?,?)");
    ps.setString(1, s);
    ps.setString(2, s1);
    ps.setString(3, s3);
    ps.setString(4, s2);
    ps.setString(5, f);

    int count = ps.executeUpdate();
    ps.close(); 
    String sql1 = "select Subject ,BookName, Image ,Price,BID from addtocart";
    ps = conn.prepareStatement(sql1);
    rs = ps.executeQuery();
    out.println("<table border=2 align=center width=50% bordercolor=blue ><tr>");
    rmd =rs.getMetaData();
    int n1=rmd.getColumnCount();
        out.println("<td><b><font size=5>CART</font></b></td>");
    String s5="",s6="", BID="";
    while (rs.next())
    {
        out.println("<tr>");
            for(int x=1;x<=n1;x++)
            {
                if(x==3)
                {
                    s6=rs.getString(x);
                    out.println("<td><center><img src='images/"+s6+"'  height='100' width='100'> </center></td>");
                }
                else if(x==2)
                {
                    s5=rs.getString(x);
                    out.println("<td><b>"+s5+"</b></td>");	
                }
                else if(x==1){
                    s5=rs.getString(x);
                    out.println("<td><b>"+s5+"</b></td>");
                }
                else if(x==4){
                    s5=rs.getString(x);
                    out.println("<td><b>"+s5+"</b></td>");
                }
                else
                {
                     BID=rs.getString(x);
                }
            }   
            out.println("<td><b><a href=deletebooks.jsp?f="+BID+">DELETE</b><a/></td>");
            out.println("</tr>");
    }
    out.println("<td><b><a href=bill_1.jsp?f="+BID+">BUY NOW</b><a/></td>");
    out.println("<td><b><a href=deleteall.jsp>DELETE ALL</b><a/></td>");

    
    rs.close();
    conn.close();
}
    catch(Exception e)
    {out.println(e);
        
    }

      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
