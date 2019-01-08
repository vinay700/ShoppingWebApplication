package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSetMetaData;
import java.sql.*;

public final class bill_005f2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles/cart_styles.css\">\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("        table\n");
      out.write("        {\n");
      out.write("            border-collapse:collpse;\n");
      out.write("            width:100%;\n");
      out.write("        }\n");
      out.write("        th,td\n");
      out.write("        {\n");
      out.write("            padding:15px;\n");
      out.write("        }\n");
      out.write("        </style>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<div class=\"cart_title\">Shopping Cart</div><br><br>");

    try
{   String u=(String)session.getAttribute("invoice");
    String BID="";
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","");
    PreparedStatement ps = null;
    String sql = "select Subject ,BookName, Image ,Price,BID from addtocart";
    ps = conn.prepareStatement(sql);
    ResultSet rs = ps.executeQuery();
    out.println("<table class='w3-table-all' border=1 align=center width=50% bordercolor='#e0e0eb'><tr class='w3-hover-light-gray'>");
    ResultSetMetaData rmd; 
    rmd =rs.getMetaData();
    int n=rmd.getColumnCount();
    String s="",s2="",s1="",s5="";
    while (rs.next())
    {
        for(int x=1;x<=n;x++)
        {
           if(x==3)
           {
               s5=rs.getString(x);
               out.println("<td><center><img src='images/"+s5+"'  height='100' width='100'> </center></td>");
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
        out.println("<td><b><a href=deletebooks.jsp?f="+BID+">Place Order</b><a/></td>");
        out.println("</tr>");
    }
    //out.println("<td><b><a href=deleteall.jsp>Order All</b><a/></td>");
    out.println("</table><br></body></html>");
    rs.close();
    String sql1 = "select sum(Price) from addtocart";
    ps = conn.prepareStatement(sql1);
    rs = ps.executeQuery();
    while (rs.next())
    {
        for(int x=1;x<=n;x++)
            {
                if(x==1)
                {
                    s5=rs.getString(x);
                    out.println("<p align='right'>Total Amount : "+s5+"<br>");
                }
            }
    }
    out.println("Invoice number : "+u+"</p>");

}
catch(Exception e)
{out.println(e);}

      out.write("\n");
      out.write("        </body>\n");
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
