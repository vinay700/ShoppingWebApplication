package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");

    try
{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/shopping","root",""); 
    Statement stmt=con.createStatement();
    ResultSet rs;
    ResultSetMetaData rmd;
    String s1="select Image,Price,BookName,Subject from addtocart";
    rs = stmt.executeQuery(s1);
    out.println("<table class='w3-table-all' border=1 align=center width=50% bordercolor='#e0e0eb'><tr class='w3-hover-light-gray'>");
    rmd =rs.getMetaData();
    int n=rmd.getColumnCount();
    for(int i=1;i<=n+1;i++)
    {
        if(i<=n)
        out.println("<td><b><font size=5>"+rmd.getColumnName(i)+"</font></b></td>");
    }
    String s="",s5="";
    while (rs.next())
    {
        out.println("<tr>");
            for(int x=1;x<=n;x++)
            {
                     if(x==1)
                {
                     s=rs.getString(x);
                     out.println("<td><center><img src='images/"+s+"'  height='100' width='100'> </center></td>");

                }
                     else if(x==2)
                {
                     s=rs.getString(x);
                     out.println("<td><b>"+s+".00</b></td>");

                } 
                else if(x==3)
                {
                    s=rs.getString(x);
                    out.println("<td><b>"+s+"</b></td>");
                }
                else if(x==4)
                {
                    s=rs.getString(x);
                    out.println("<td><b>"+s+"</b></td>");

                }
            }   
            out.println("</tr>");
    }
    out.println("</table><br></body></html>");
    rs.close();
    stmt.close();
    con.close();

    
}
  catch(Exception e)
    {
      out.println(e);
    }

      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
