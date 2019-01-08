package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.File;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\" />\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin</title>\n");
      out.write("        <link href=\"\" type=\"text/css\" rel=\"stylesheet\" media=\"all\" />\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("ul {\n");
      out.write("    list-style-type: none;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    overflow: hidden;\n");
      out.write("    background-color: #333;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li {\n");
      out.write("    float: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a {\n");
      out.write("    display: block;\n");
      out.write("    color: white;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 14px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a:hover {\n");
      out.write("    background-color: #111;\n");
      out.write("}\n");
      out.write(".active {\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("                background-color:rgb(234,234,234);\n");
      out.write("            }\n");
      out.write("            .wel\n");
      out.write("            {\n");
      out.write("              color:rgb(121,56,250);\n");
      out.write("              font-size:24px;\n");
      out.write("            }\n");
      out.write("            .bm\n");
      out.write("            {\n");
      out.write("                color:red;\n");
      out.write("                font-size:18px;\n");
      out.write("            }\n");
      out.write("            a\n");
      out.write("            {\n");
      out.write("                text-decoration:none;\n");
      out.write("                color:maroon;\n");
      out.write("                font-size:20px;\n");
      out.write("            }\n");
      out.write("            a:hover\n");
      out.write("            {\n");
      out.write("                text-decoration:underline;\n");
      out.write("                color:rgb(102,160,50);\n");
      out.write("            }\n");
      out.write("            h2\n");
      out.write("            {\n");
      out.write("                text-align:center;\n");
      out.write("                color:olive;\n");
      out.write("                font-size:30px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("   \n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("            <table border=\"0\">\n");
      out.write("                <tr><td><h1> Book Shop Admin Page</h1></td></tr><tr>\n");
      out.write("                    <td class=\"header\">\n");
      out.write("                        <img src=\"images/books.jpg\" width=\"1310px\" height=\"350px\"/>                    \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"menu\">\n");
      out.write("                       <ul>\n");
      out.write("                            <li><a class=\"active\" href=\"#home\">Add Record</a></li>\n");
      out.write("                            <li><a href=\"Delete.jsp\">Delete Record</a></li>\n");
      out.write("                            <li><a href=\"Update.jsp\">Update Record</a></li>\n");
      out.write("                            <li><a href=\"View.jsp\">View Record</a></li>\n");
      out.write("                            <li style=\"float:right\"><a href=\"logout.jsp\">Logout</a>\n");
      out.write("                      </ul>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <h2>Add Record</h2>\n");
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                    <form name=\"form_insert\" action=\"star.jsp\" method=\"post\" >\n");
      out.write("                            <table border=\"0\" align=\"center\">\n");
      out.write("                            <tr>\n");
      out.write("                                   <td class=\"lbl_txt\">Subject :</td>\n");
      out.write("                                    <td><select name=\"Subject\">\n");
      out.write("                                        <option value=\"Engineering\">Engineering</option>\n");
      out.write("                                        <option value=\"Computer Science\">Computer Science</option>\n");
      out.write("                                        <option value=\"Medical\">Medical</option>\n");
      out.write("                                        <option value=\"Architecture\">Architecture</option>\n");
      out.write("                                        <option value=\"Banking\">Banking</option>\n");
      out.write("                                      </select> \n");
      out.write("                                        </td>\n");
      out.write("                               </tr>\n");
      out.write("                               <tr>\n");
      out.write("                                   <td class=\"lbl_txt\">Book Name :</td>\n");
      out.write("                                   <td><input type=\"text\" name=\"Bname\" class=\"txt\" /></td>\n");
      out.write("                               </tr>\n");
      out.write("                               <tr>\n");
      out.write("                                   <td class=\"lbl_txt\">Author Name :</td>\n");
      out.write("                                   <td><input type=\"text\" name=\"Aname\" class=\"txt\" /></td>\n");
      out.write("                               </tr>\n");
      out.write("                               <tr>\n");
      out.write("                                   <td class=\"lbl_txt\">Publisher :</td>\n");
      out.write("                                   <td><input type=\"text\" name=\"Publisher\" class=\"txt\" /></td>\n");
      out.write("                               </tr>\n");
      out.write("                               \n");
      out.write("                               <tr>\n");
      out.write("                                   <td class=\"lbl_txt\">Price :</td>\n");
      out.write("                                   <td><input type=\"text\" name=\"Price\" class=\"txt\" /></td>\n");
      out.write("                               </tr>\n");
      out.write("                               <tr><td class=\"lbl_txt\">Upload Photo :</td>\n");
      out.write("                                   <td><input type=\"file\" name=\"Image\" class=\"txt\" /></td></tr>\n");
      out.write("                               \n");
      out.write("                               <tr>\n");
      out.write("                                    <td>\n");
      out.write("                                        <a  href=\"star.jsp\" >next</a>\n");
      out.write("                                   </td>\n");
      out.write("                                   <td>\n");
      out.write("                                       <input type=\"reset\" value=\"Reset\" name=\"reset\"  class=\"btn\" onclick=\"return clear();\" />\n");
      out.write("                                   </td>\n");
      out.write("                                  \n");
      out.write("                               </tr>\n");
      out.write("                               <tr>\n");
      out.write("                                 <td align=\"center\" colspan=\"2\">\n");
      out.write("                                    <a href=\"View.jsp\">View Records</a>\n");
      out.write("                                 </td>\n");
      out.write("                               </tr>\n");
      out.write("                        </table>                   \n");
      out.write("                    </form>\n");
      out.write("          </table>\n");
      out.write("       \n");
      out.write("    </body>\n");
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
