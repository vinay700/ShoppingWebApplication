package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class ackno_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Acknowledgement Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");

try
{    
    String u=(String)session.getAttribute("email");
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","");
    PreparedStatement pstmt = null;
    String sql = "select Subject,BookName,Price,Image from buynow where email='"+u+"'";
    pstmt = conn.prepareStatement(sql);
    ResultSet rs = pstmt.executeQuery();
    ResultSetMetaData rmd; 
    out.println("<table class='w3-table-all' border=1 align=center width=50% bordercolor='#e0e0eb'><tr class='w3-hover-light-gray'>");
    rmd =rs.getMetaData();
    int n=rmd.getColumnCount();
    String s="",s2="",s1="";
    int i=0,tot=0;
    while (rs.next())
    {
        for(int x=1;x<=n;x++)
        {
            if(x==4)
            {
                 s=rs.getString(x);
                 out.println("<td><center><img src='images/"+s+"'  height='100' width='100'> </center></td>");
            }
            else if(x==3)
            {
                 s1=rs.getString(x);  
                 out.println("<td><b>"+s1+"</b></td>");
            } 
            else 
            {
                s2=rs.getString(x);
                out.println("<td><b>"+s2+"</b></td>");
            }
        }   
    }
    out.println("Thanks For Booking.....");
    out.println("<a href=mainshoping.jsp><b>Continue Shopping</b><a/>");
}
catch(Exception e)
{
}
    
      out.write("\n");
      out.write("    </body>\n");
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
