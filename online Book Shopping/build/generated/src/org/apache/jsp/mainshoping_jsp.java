package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.mysql.cj.xdevapi.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.*;
import java.util.*;

public final class mainshoping_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>Book Store</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"description\" content=\"OneTech shop project\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles/bootstrap4/bootstrap.min.css\">\n");
      out.write("<link href=\"plugins/fontawesome-free-5.0.1/css/fontawesome-all.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"plugins/OwlCarousel2-2.2.1/owl.carousel.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"plugins/OwlCarousel2-2.2.1/owl.theme.default.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"plugins/OwlCarousel2-2.2.1/animate.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"plugins/slick-1.8.0/slick.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles/main_styles.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles/responsive.css\">\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"description\" content=\"OneTech shop project\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles/bootstrap4/bootstrap.min.css\">\n");
      out.write("<link href=\"plugins/fontawesome-free-5.0.1/css/fontawesome-all.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles/cart_styles.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles/cart_responsive.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <style>\n");
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
      out.write(" <div class=\"super_container\">\n");
      out.write("\n");
      out.write("\t<!-- Header -->\n");
      out.write("\t\n");
      out.write("\t<header class=\"header\">\n");
      out.write("\n");
      out.write("\t\t<!-- Top Bar -->\n");
      out.write("\n");
      out.write("\t\t<div class=\"top_bar\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col d-flex flex-row\">\n");
      out.write("                                <div class=\"top_bar_contact_item\"><div class=\"top_bar_icon\"><img src=\"images/phone.png\" alt=\"\"></div>phone_no : +91 98807 78964</div>\n");
      out.write("                                    <div class=\"top_bar_contact_item\"><div class=\"top_bar_icon\"><img src=\"images/mail.png\" alt=\"\"></div><a href=\"mailto:fastsales@gmail.com\">email_id : bookstore123@gmail.com</a></div>\n");
      out.write("                                    <div class=\"top_bar_content ml-auto\">\n");
      out.write("                                    <div class=\"top_bar_menu\">\n");
      out.write("                                        <ul class=\"standard_dropdown top_bar_dropdown\">\n");
      out.write("                                            <li>\n");
      out.write("                                                <a href=\"#\">My Account<i class=\"fas fa-chevron-down\"></i></a>\n");
      out.write("                                                <ul>\n");
      out.write("                                                    <li><a href=\"changepassword.jsp\">Change Password</a></li>\n");
      out.write("                                                    <li><a href=\"myorders.jsp\">My Orders</a></li>\n");
      out.write("                                                    <li><a href=\"reviwe.jsp\">Reviews</a></li>\n");
      out.write("                                                    <li><a href=\"logout.jsp\">LogOut</a></li>\n");
      out.write("                                                </ul>\n");
      out.write("                                            </li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                    </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<!-- Header Main -->\n");
      out.write("\n");
      out.write("\t\t<div class=\"header_main\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("                                    <div class=\"col-lg-2 col-sm-3 col-3 order-1\">\n");
      out.write("                                            <div class=\"logo_container\">\n");
      out.write("                                                    <div class=\"logo\"><a href=\"#\">Book Store</a></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- Search -->\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-6 col-12 order-lg-2 order-3 text-lg-left text-right\">\n");
      out.write("\t\t\t\t\t\t<div class=\"header_search\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"header_search_content\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"header_search_form_container\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<form action=\"#\" class=\"header_search_form clearfix\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"search\" required=\"required\" class=\"header_search_input\" placeholder=\"Search for products...\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"custom_dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"custom_dropdown_list\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"custom_dropdown_placeholder clc\">All Categories</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fas fa-chevron-down\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<ul class=\"custom_list clc\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a class=\"clc\" href=\"#\">All Categories</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a class=\"clc\" href=\"engineering.jsp\">Engineering\t</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a class=\"clc\" href=\"#\">Computer Science</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a class=\"clc\" href=\"#\">Medical</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a class=\"clc\" href=\"#\">Architecture</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a class=\"clc\" href=\"#\">Banking</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"header_search_button trans_300\" value=\"Submit\"><img src=\"images/search.png\" alt=\"\"></button>\n");
      out.write("\t\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- Wishlist -->\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-4 col-9 order-lg-3 order-2 text-lg-left text-right\">\n");
      out.write("\t\t\t\t\t\t\t<!-- Cart -->\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cart\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"cart_container d-flex flex-row align-items-center justify-content-end\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"cart_icon\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"images/cart.png\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"cart_count\"><span>");


                                                                                    try
{
    Connection conn=null;
    PreparedStatement pstmt = null;
    ResultSet rs=null;
    String url= "jdbc:mysql://localhost:3306/shopping";
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    conn=DriverManager.getConnection(url,"root", "");
    pstmt = conn.prepareStatement("select count(*) from addtocart");
    rs = pstmt.executeQuery();
    while(rs.next())
    {
        int count =rs.getInt(1);
        out.println(count);

    }
    rs.close();
    pstmt.close();
    conn.close();
}
catch(Exception e)
{
    out.println(e);
} 
                                                                                
      out.write("</span></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"cart_content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"cart_text\"><a href=\"cart.jsp\">Cart</a></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Main Navigation -->\n");
      out.write("\n");
      out.write("\t\t<nav class=\"main_nav\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col\">\n");
      out.write("\t\t\t\t\t\t<div class=\"main_nav_content d-flex flex-row\">\n");
      out.write("\t\t\t\t\t\t\t<!-- Categories Menu -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cat_menu_container\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"cat_menu_title d-flex flex-row align-items-center justify-content-start\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"cat_burger\"><span></span><span></span><span></span></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"cat_menu_text\">categories</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"cat_menu\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"hassubs\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\">Engineering<i class=\"fas fa-chevron-right\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("                                                                        ");

                                                                            Class.forName("com.mysql.jdbc.Driver");
                                                                            try
                                                                            {
                                                                                PreparedStatement ps = null;
                                                                                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","");

                                                                                String sql = "SELECT * FROM books where subject= 'Engineering'";
                                                                                ps = conn.prepareStatement(sql);
                                                                                ResultSet rs = ps.executeQuery(); 

                                                                                while(rs.next())
                                                                                {
                                                                                    String BookName = rs.getString("BookName"); 
                                                                                
      out.write("\n");
      out.write("                                                                            <li><a href=\"product.jsp\">");
      out.print(BookName );
      out.write("<i class=\"fas fa-chevron-right\"></i></a></li>\n");
      out.write("                                                                                ");


                                                                                }
                                                                            conn.close();
 
      out.write("\n");
      out.write("                                                                            <div class=\"dropDownSelect2\"></div>\n");
      out.write("                                                                            </p>\n");
      out.write("                                                                            ");

                                                                            }
                                                                            catch(Exception e)
                                                                            {}
                                                                            
      out.write("\n");
      out.write("                                                                            </ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"hassubs\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\">Computer Science<i class=\"fas fa-chevron-right\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("                                                                        ");

                                                                            Class.forName("com.mysql.jdbc.Driver");
                                                                            try
                                                                            {
                                                                                PreparedStatement ps = null;
                                                                                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","");


                                                                                String sql = "SELECT * FROM books where subject= 'Computer Science'";
                                                                                ps = conn.prepareStatement(sql);
                                                                                ResultSet rs = ps.executeQuery(); 

                                                                                while(rs.next())
                                                                                {
                                                                                    String BookName = rs.getString("BookName"); 
                                                                                
      out.write("\n");
      out.write("                                                                            <li><a href=\"#\">");
      out.print(BookName );
      out.write("<i class=\"fas fa-chevron-right\"></i></a></li>\n");
      out.write("                                                                                ");


                                                                                }
                                                                            conn.close();
                                                                            
      out.write("\n");
      out.write("                                                                            <div class=\"dropDownSelect2\"></div>\n");
      out.write("                                                                            </p>\n");
      out.write("                                                                            ");

                                                                            }
                                                                            catch(Exception e)
                                                                            {}
                                                                            
      out.write("\n");
      out.write("                                                                       </ul>\n");
      out.write("                                                                        <li class=\"hassubs\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\">Medical<i class=\"fas fa-chevron-right\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("                                                                        ");

                                                                            Class.forName("com.mysql.jdbc.Driver");
                                                                            try
                                                                            {
                                                                                PreparedStatement ps = null;
                                                                                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","");

                                                                                String sql = "SELECT * FROM books where subject= 'Medical'";
                                                                                ps = conn.prepareStatement(sql);
                                                                                ResultSet rs = ps.executeQuery(); 

                                                                                while(rs.next())
                                                                                {
                                                                                    String BookName = rs.getString("BookName"); 
                                                                                
      out.write("\n");
      out.write("                                                                            <li><a href=\"#\">");
      out.print(BookName );
      out.write("<i class=\"fas fa-chevron-right\"></i></a></li>\n");
      out.write("                                                                                ");


                                                                                }
                                                                            conn.close();
                                                                            
      out.write("\n");
      out.write("                                                                            <div class=\"dropDownSelect2\"></div>\n");
      out.write("                                                                            </p>\n");
      out.write("                                                                            ");

                                                                            }
                                                                            catch(Exception e)
                                                                            {}
                                                                            
      out.write("\n");
      out.write("                                                                       </ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"hassubs\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\">Architecture<i class=\"fas fa-chevron-right\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("                                                                        ");

                                                                            Class.forName("com.mysql.jdbc.Driver");
                                                                            try
                                                                            {
                                                                                PreparedStatement ps = null;
                                                                                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","");


                                                                                String sql = "SELECT * FROM books where subject= 'Architecture'";
                                                                                ps = conn.prepareStatement(sql);
                                                                                ResultSet rs = ps.executeQuery(); 

                                                                                while(rs.next())
                                                                                {
                                                                                    String BookName = rs.getString("BookName"); 
                                                                                
      out.write("\n");
      out.write("                                                                            <li><a href=\"#\">");
      out.print(BookName );
      out.write("<i class=\"fas fa-chevron-right\"></i></a></li>\n");
      out.write("                                                                                ");


                                                                                }
                                                                            conn.close();
                                                                            
      out.write("\n");
      out.write("                                                                            <div class=\"dropDownSelect2\"></div>\n");
      out.write("                                                                            </p>\n");
      out.write("                                                                            ");

                                                                            }
                                                                            catch(Exception e)
                                                                            {}
                                                                            
      out.write("\n");
      out.write("                                                                       </ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"hassubs\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\">Banking<i class=\"fas fa-chevron-right\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("                                                                        ");

                                                                            Class.forName("com.mysql.jdbc.Driver");
                                                                            try
                                                                            {
                                                                                PreparedStatement ps = null;
                                                                                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","");


                                                                                String sql = "SELECT * FROM books where subject= 'Banking'";
                                                                                ps = conn.prepareStatement(sql);
                                                                                ResultSet rs = ps.executeQuery(); 

                                                                                while(rs.next())
                                                                                {
                                                                                    String BookName = rs.getString("BookName"); 
                                                                                
      out.write("\n");
      out.write("                                                                            <li><a href=\"#\">");
      out.print(BookName );
      out.write("<i class=\"fas fa-chevron-right\"></i></a></li>\n");
      out.write("                                                                                ");


                                                                                }
                                                                            conn.close();
                                                                            
      out.write("\n");
      out.write("                                                                            <div class=\"dropDownSelect2\"></div>\n");
      out.write("                                                                            </p>\n");
      out.write("                                                                            ");

                                                                            }
                                                                            catch(Exception e)
                                                                            {}
                                                                            
      out.write("\n");
      out.write("                                                                       </ul>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<!-- Main Nav Menu -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<!-- Menu Trigger -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"menu_trigger_container ml-auto\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"menu_trigger d-flex flex-row align-items-center justify-content-end\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"menu_burger\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"menu_trigger_text\">menu</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"cat_burger menu_burger_inner\"><span></span><span></span><span></span></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</nav>\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Menu -->\n");
      out.write("\n");
      out.write("\t\t<div class=\"page_menu\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col\">\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"page_menu_content\">\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"page_menu_search\">\n");
      out.write("\t\t\t\t\t\t\t\t<form action=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"search\" required=\"required\" class=\"page_menu_search_input\" placeholder=\"Search for products...\">\n");
      out.write("\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"page_menu_nav\">\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"page_menu_item\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">Home<i class=\"fa fa-angle-down\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"page_menu_item has-children\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">Super Deals<i class=\"fa fa-angle-down\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"page_menu_selection\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Super Deals<i class=\"fa fa-angle-down\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"page_menu_item has-children\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\">Menu Item<i class=\"fa fa-angle-down\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"page_menu_selection\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Menu Item<i class=\"fa fa-angle-down\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Menu Item<i class=\"fa fa-angle-down\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Menu Item<i class=\"fa fa-angle-down\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Menu Item<i class=\"fa fa-angle-down\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Menu Item<i class=\"fa fa-angle-down\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Menu Item<i class=\"fa fa-angle-down\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Menu Item<i class=\"fa fa-angle-down\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"page_menu_item has-children\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">Featured Brands<i class=\"fa fa-angle-down\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"page_menu_selection\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Featured Brands<i class=\"fa fa-angle-down\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Menu Item<i class=\"fa fa-angle-down\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Menu Item<i class=\"fa fa-angle-down\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Menu Item<i class=\"fa fa-angle-down\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"page_menu_item has-children\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">Trending Styles<i class=\"fa fa-angle-down\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"page_menu_selection\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Trending Styles<i class=\"fa fa-angle-down\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Menu Item<i class=\"fa fa-angle-down\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Menu Item<i class=\"fa fa-angle-down\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Menu Item<i class=\"fa fa-angle-down\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"page_menu_item\"><a href=\"blog.html\">blog<i class=\"fa fa-angle-down\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"page_menu_item\"><a href=\"contact.html\">contact<i class=\"fa fa-angle-down\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"menu_contact\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"menu_contact_item\"><div class=\"menu_contact_icon\"><img src=\"images/phone_white.png\" alt=\"\"></div>+38 068 005 3570</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"menu_contact_item\"><div class=\"menu_contact_icon\"><img src=\"images/mail_white.png\" alt=\"\"></div><a href=\"mailto:fastsales@gmail.com\">fastsales@gmail.com</a></div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</header>\n");
      out.write("\t\n");
      out.write("\t<!-- Banner -->\n");
      out.write("        <center>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

try
{
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","");
    PreparedStatement ps = null;
    String sql = "select Image,Price,BookName,BookID from books where Subject='Engineering'";
    ps = conn.prepareStatement(sql);
    ResultSet rs = ps.executeQuery();
    ResultSetMetaData rmd; 
    out.println("<table class='w3-table-all' border=1 align=center width=50% bordercolor='#e0e0eb'><tr class='w3-hover-light-gray'>");
    rmd =rs.getMetaData();
    int n=rmd.getColumnCount();
        out.println("<td><b><font size=5>ENGINEERING BOOKS</font></b></td>");
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
                else 
                {
                    s=rs.getString(x);
                }
                   
            }   
              out.println("<td><b><a href=addtocart.jsp?f="+s+">Addtocart</b><a/></td>");
            out.println("</tr>");
    }
                

    out.println("</table><br></body></html>");
    rs.close();
    conn.close();

    
}
  catch(Exception e)
    {
      out.println(e);
    }
try
{
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","");
    PreparedStatement ps = null;
    String sql = "select Image,Price,BookName,BookID from books where Subject='Computer Science'";
    ps = conn.prepareStatement(sql);
    ResultSet rs = ps.executeQuery();
    ResultSetMetaData rmd; 
    out.println("<table border=1 align=center width=50% bordercolor='#e0e0eb'><tr>");
    rmd =rs.getMetaData();
    int n=rmd.getColumnCount();
        out.println("<td><b><font size=5>COMPUTER SCIENCE BOOKS</font></b></td>");
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
                else 
                {
                    s=rs.getString(x);
                }
                   
            }   
              out.println("<td><b><a href=addtocart.jsp?f="+s+">Addtocart</b><a/></td>");
            out.println("</tr>");
    }
                

    out.println("</table><br></body></html>");
    rs.close();
    conn.close();

    
}
  catch(Exception e)
    {
      out.println(e);
    }
try
{
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","");
    PreparedStatement ps = null;
    String sql = "select Image,Price,BookName,BookID from books where Subject='Medical'";
    ps = conn.prepareStatement(sql);
    ResultSet rs = ps.executeQuery();
    ResultSetMetaData rmd; 
    out.println("<table border=1 align=center width=50% bordercolor='#e0e0eb'><tr>");
    rmd =rs.getMetaData();
    int n=rmd.getColumnCount();
        out.println("<td><b><font size=5>MEDICAL BOOKS</font></b></td>");
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
                else 
                {
                    s=rs.getString(x);
                }
                   
            }   
              out.println("<td><b><a href=addtocart.jsp?f="+s+">Addtocart</b><a/></td>");
            out.println("</tr>");
    }
                

    out.println("</table><br></body></html>");
    rs.close();
    conn.close();

    
}
  catch(Exception e)
    {
      out.println(e);
    }
try
{
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","");
    PreparedStatement ps = null;
    String sql = "select Image,Price,BookName,BookID from books where Subject='Architecture'";
    ps = conn.prepareStatement(sql);
    ResultSet rs = ps.executeQuery();
    ResultSetMetaData rmd; 
    out.println("<table border=1 align=center width=50% bordercolor='#e0e0eb'><tr>");
    rmd =rs.getMetaData();
    int n=rmd.getColumnCount();
        out.println("<td><b><font size=5>ARCHITECTURE BOOKS</font></b></td>");
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
                else 
                {
                    s=rs.getString(x);
                }
                   
            }   
              out.println("<td><b><a href=addtocart.jsp?f="+s+">Addtocart</b><a/></td>");
            out.println("</tr>");
    }
                

    out.println("</table><br></body></html>");
    rs.close();
    conn.close();
    
}
  catch(Exception e)
    {
      out.println(e);
    }
try
{
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","");
    PreparedStatement ps = null;
    String sql = "select Image,Price,BookName,BookID from books where Subject='Banking'";
    ps = conn.prepareStatement(sql);
    ResultSet rs = ps.executeQuery();
    ResultSetMetaData rmd; 
    out.println("<table border=1 align=center width=50% bordercolor='#e0e0eb'><tr>");
    rmd =rs.getMetaData();
    int n=rmd.getColumnCount();
        out.println("<td><b><font size=5>BANKING BOOKS</font></b></td>");
    String s="",s5="",s2="",s1="";
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
                     s1=rs.getString(x);
                     out.println("<td><b>"+s1+".00</b></td>");

                } 
                     else if(x==3)
                {
                    s=rs.getString(x);
                    out.println("<td><b>"+s+"</b></td>");
                }
                else 
                {
                    s=rs.getString(x);
                }
                   
            }   
              out.println("<td><b><a href=addtocart.jsp?f="+s+">Addtocart</b><a/></td>");
            out.println("</tr>");
    }
                

    out.println("</table><br></body></html>");
    rs.close();
    conn.close();
    
}
  catch(Exception e)
    {
      out.println(e);
    }

      out.write("\n");
      out.write("</center>\n");
      out.write("\t\n");
      out.write("\t<!-- Footer -->\n");
      out.write("\n");
      out.write("\t<footer class=\"footer\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"col-lg-3 footer_col\">\n");
      out.write("\t\t\t\t\t<div class=\"footer_column footer_contact\">\n");
      out.write("\t\t\t\t\t\t<div class=\"logo_container\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"logo\"><a href=\"#\">Book Store</a></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"footer_title\">Got Question? Call Us 24/7</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"footer_phone\">+91 98807 78964</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"footer_social\">\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fab fa-facebook-f\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fab fa-twitter\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fab fa-youtube\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fab fa-google\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fab fa-vimeo-v\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-lg-2\">\n");
      out.write("\t\t\t\t\t<div class=\"footer_column\">\n");
      out.write("\t\t\t\t\t\t<div class=\"footer_title\">Customer Care</div>\n");
      out.write("\t\t\t\t\t\t<ul class=\"footer_list\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">My Account</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Order Tracking</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Wish List</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Customer Services</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Returns / Exchange</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">FAQs</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Product Support</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</footer>\n");
      out.write("\n");
      out.write("\t<!-- Copyright -->\n");
      out.write("\n");
      out.write("\t<div class=\"copyright\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"copyright_container d-flex flex-sm-row flex-column align-items-center justify-content-start\">\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"logos ml-sm-auto\">\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"logos_list\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/logos_1.png\" alt=\"\"></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/logos_2.png\" alt=\"\"></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/logos_3.png\" alt=\"\"></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/logos_4.png\" alt=\"\"></a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("     \n");
      out.write("     \n");
      out.write("     \n");
      out.write("     \n");
      out.write("     \n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("<script src=\"styles/bootstrap4/popper.js\"></script>\n");
      out.write("<script src=\"styles/bootstrap4/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"plugins/greensock/TweenMax.min.js\"></script>\n");
      out.write("<script src=\"plugins/greensock/TimelineMax.min.js\"></script>\n");
      out.write("<script src=\"plugins/scrollmagic/ScrollMagic.min.js\"></script>\n");
      out.write("<script src=\"plugins/greensock/animation.gsap.min.js\"></script>\n");
      out.write("<script src=\"plugins/greensock/ScrollToPlugin.min.js\"></script>\n");
      out.write("<script src=\"plugins/OwlCarousel2-2.2.1/owl.carousel.js\"></script>\n");
      out.write("<script src=\"plugins/slick-1.8.0/slick.js\"></script>\n");
      out.write("<script src=\"plugins/easing/easing.js\"></script>\n");
      out.write("<script src=\"js/custom.js\"></script>\n");
      out.write("<script src=\"js/book.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("</body>\n");
      out.write("\n");
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
