package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class star_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<body>\n");
      out.write("<link rel=\"stylesheet\" href=\"style.css\" />\n");
      out.write("<form id=\"ratingsForm\" action=\"star.jsp\" method=\"post\">\n");
      out.write("\t<div class=\"stars\">\n");
      out.write("\t\t<input name=\"star\" type=\"radio\" class=\"star-1\" id=\"star-1\" value=\"1\" />\n");
      out.write("\t\t<label class=\"star-1\" for=\"star-1\">1</label>\n");
      out.write("\t\t<input name=\"star\" type=\"radio\" class=\"star-2\" id=\"star-2\" value=\"2\" />\n");
      out.write("\t\t<label class=\"star-2\" for=\"star-2\">2</label>\n");
      out.write("\t\t<input name=\"star\" type=\"radio\" class=\"star-3\" id=\"star-3\" value=\"3\" />\n");
      out.write("\t\t<label class=\"star-3\" for=\"star-3\">3</label>\n");
      out.write("\t\t<input name=\"star\" type=\"radio\" class=\"star-4\" id=\"star-4\" value=\"4\" />\n");
      out.write("\t\t<label class=\"star-4\" for=\"star-4\">4</label>\n");
      out.write("\t\t<input name=\"star\" type=\"radio\" class=\"star-5\" id=\"star-5\" value=\"5\" />\n");
      out.write("\t\t<label class=\"star-5\" for=\"star-5\">5</label>\n");
      out.write("\t\t<span></span>\n");
      out.write("\t</div>\n");
      out.write("    <input type=submit value=\"submit\" >\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>\n");

        

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
