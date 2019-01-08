
<%@page import="com.mysql.cj.xdevapi.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Book Store</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="OneTech shop project">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="styles/bootstrap4/bootstrap.min.css">
<link href="plugins/fontawesome-free-5.0.1/css/fontawesome-all.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/owl.carousel.css">
<link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/owl.theme.default.css">
<link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/animate.css">
<link rel="stylesheet" type="text/css" href="plugins/slick-1.8.0/slick.css">
<link rel="stylesheet" type="text/css" href="styles/main_styles.css">
<link rel="stylesheet" type="text/css" href="styles/responsive.css">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="OneTech shop project">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="styles/bootstrap4/bootstrap.min.css">
<link href="plugins/fontawesome-free-5.0.1/css/fontawesome-all.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="styles/cart_styles.css">
<link rel="stylesheet" type="text/css" href="styles/cart_responsive.css">

</head>

<body>
    <style>
        table
        {
            border-collapse:collpse;
            width:100%;
        }
        th,td
        {
            padding:15px;
        }
        </style>
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
 <div class="super_container">

	<!-- Header -->
	
	<header class="header">

		<!-- Top Bar -->

		<div class="top_bar">
                    <div class="container">
                        <div class="row">
                            <div class="col d-flex flex-row">
                                <div class="top_bar_contact_item"><div class="top_bar_icon"><img src="images/phone.png" alt=""></div>phone_no : +91 98807 78964</div>
                                    <div class="top_bar_contact_item"><div class="top_bar_icon"><img src="images/mail.png" alt=""></div><a href="mailto:fastsales@gmail.com">email_id : bookstore123@gmail.com</a></div>
                                    <div class="top_bar_content ml-auto">
                                    <div class="top_bar_menu">
                                        <ul class="standard_dropdown top_bar_dropdown">
                                            <li>
                                                <a href="#">My Account<i class="fas fa-chevron-down"></i></a>
                                                <ul>
                                                    <li><a href="changepassword.jsp">Change Password</a></li>
                                                    <li><a href="myorders.jsp">My Orders</a></li>
                                                    <li><a href="reviwe.jsp">Reviews</a></li>
                                                    <li><a href="logout.jsp">LogOut</a></li>
                                                </ul>
                                            </li>
                                        </ul>
                                    </div>
                                    </div>
                            </div>
                        </div>
                    </div>		
		</div>

		<!-- Header Main -->

		<div class="header_main">
			<div class="container">
				<div class="row">
                                    <div class="col-lg-2 col-sm-3 col-3 order-1">
                                            <div class="logo_container">
                                                    <div class="logo"><a href="#">Book Store</a></div>
						</div>
					</div>

					<!-- Search -->
					<div class="col-lg-6 col-12 order-lg-2 order-3 text-lg-left text-right">
						<div class="header_search">
							<div class="header_search_content">
								<div class="header_search_form_container">
									<form action="#" class="header_search_form clearfix">
										<input type="search" required="required" class="header_search_input" placeholder="Search for products...">
										<div class="custom_dropdown">
											<div class="custom_dropdown_list">
												<span class="custom_dropdown_placeholder clc">All Categories</span>
												<i class="fas fa-chevron-down"></i>
												<ul class="custom_list clc">
													<li><a class="clc" href="#">All Categories</a></li>
													<li><a class="clc" href="engineering.jsp">Engineering	</a></li>
													<li><a class="clc" href="#">Computer Science</a></li>
													<li><a class="clc" href="#">Medical</a></li>
													<li><a class="clc" href="#">Architecture</a></li>
													<li><a class="clc" href="#">Banking</a></li>
												</ul>
											</div>
										</div>
										<button type="submit" class="header_search_button trans_300" value="Submit"><img src="images/search.png" alt=""></button>
									</form>
								</div>
							</div>
						</div>
					</div>

					<!-- Wishlist -->
					<div class="col-lg-4 col-9 order-lg-3 order-2 text-lg-left text-right">
							<!-- Cart -->
							<div class="cart">
								<div class="cart_container d-flex flex-row align-items-center justify-content-end">
									<div class="cart_icon">
										<img src="images/cart.png" alt="">
										<div class="cart_count"><span><%

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
                                                                                %></span></div>
									</div>
									<div class="cart_content">
										<div class="cart_text"><a href="cart.jsp">Cart</a></div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		
		<!-- Main Navigation -->

		<nav class="main_nav">
			<div class="container">
				<div class="row">
					<div class="col">
						<div class="main_nav_content d-flex flex-row">
							<!-- Categories Menu -->

							<div class="cat_menu_container">
								<div class="cat_menu_title d-flex flex-row align-items-center justify-content-start">
									<div class="cat_burger"><span></span><span></span><span></span></div>
									<div class="cat_menu_text">categories</div>
								</div>
								<ul class="cat_menu">
									<li class="hassubs">
										<a href="#">Engineering<i class="fas fa-chevron-right"></i></a>
										<ul>
                                                                        <%
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
                                                                                %>
                                                                            <li><a href="product.jsp"><%=BookName %><i class="fas fa-chevron-right"></i></a></li>
                                                                                <%

                                                                                }
                                                                            conn.close();
 %>
                                                                            <div class="dropDownSelect2"></div>
                                                                            </p>
                                                                            <%
                                                                            }
                                                                            catch(Exception e)
                                                                            {}
                                                                            %>
                                                                            </ul>
									<li class="hassubs">
										<a href="#">Computer Science<i class="fas fa-chevron-right"></i></a>
										<ul>
                                                                        <%
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
                                                                                %>
                                                                            <li><a href="#"><%=BookName %><i class="fas fa-chevron-right"></i></a></li>
                                                                                <%

                                                                                }
                                                                            conn.close();
                                                                            %>
                                                                            <div class="dropDownSelect2"></div>
                                                                            </p>
                                                                            <%
                                                                            }
                                                                            catch(Exception e)
                                                                            {}
                                                                            %>
                                                                       </ul>
                                                                        <li class="hassubs">
										<a href="#">Medical<i class="fas fa-chevron-right"></i></a>
										<ul>
                                                                        <%
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
                                                                                %>
                                                                            <li><a href="#"><%=BookName %><i class="fas fa-chevron-right"></i></a></li>
                                                                                <%

                                                                                }
                                                                            conn.close();
                                                                            %>
                                                                            <div class="dropDownSelect2"></div>
                                                                            </p>
                                                                            <%
                                                                            }
                                                                            catch(Exception e)
                                                                            {}
                                                                            %>
                                                                       </ul>
									<li class="hassubs">
										<a href="#">Architecture<i class="fas fa-chevron-right"></i></a>
										<ul>
                                                                        <%
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
                                                                                %>
                                                                            <li><a href="#"><%=BookName %><i class="fas fa-chevron-right"></i></a></li>
                                                                                <%

                                                                                }
                                                                            conn.close();
                                                                            %>
                                                                            <div class="dropDownSelect2"></div>
                                                                            </p>
                                                                            <%
                                                                            }
                                                                            catch(Exception e)
                                                                            {}
                                                                            %>
                                                                       </ul>
									<li class="hassubs">
										<a href="#">Banking<i class="fas fa-chevron-right"></i></a>
										<ul>
                                                                        <%
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
                                                                                %>
                                                                            <li><a href="#"><%=BookName %><i class="fas fa-chevron-right"></i></a></li>
                                                                                <%

                                                                                }
                                                                            conn.close();
                                                                            %>
                                                                            <div class="dropDownSelect2"></div>
                                                                            </p>
                                                                            <%
                                                                            }
                                                                            catch(Exception e)
                                                                            {}
                                                                            %>
                                                                       </ul>
								</ul>
							</div>

							<!-- Main Nav Menu -->

							

							<!-- Menu Trigger -->

							<div class="menu_trigger_container ml-auto">
								<div class="menu_trigger d-flex flex-row align-items-center justify-content-end">
									<div class="menu_burger">
										<div class="menu_trigger_text">menu</div>
										<div class="cat_burger menu_burger_inner"><span></span><span></span><span></span></div>
									</div>
								</div>
							</div>

						</div>
					</div>
				</div>
			</div>
		</nav>
		
		<!-- Menu -->

		<div class="page_menu">
			<div class="container">
				<div class="row">
					<div class="col">
						
						<div class="page_menu_content">
							
							<div class="page_menu_search">
								<form action="#">
									<input type="search" required="required" class="page_menu_search_input" placeholder="Search for products...">
								</form>
							</div>
							<ul class="page_menu_nav">
								<li class="page_menu_item">
									<a href="#">Home<i class="fa fa-angle-down"></i></a>
								</li>
								<li class="page_menu_item has-children">
									<a href="#">Super Deals<i class="fa fa-angle-down"></i></a>
									<ul class="page_menu_selection">
										<li><a href="#">Super Deals<i class="fa fa-angle-down"></i></a></li>
										<li class="page_menu_item has-children">
											<a href="#">Menu Item<i class="fa fa-angle-down"></i></a>
											<ul class="page_menu_selection">
												<li><a href="#">Menu Item<i class="fa fa-angle-down"></i></a></li>
												<li><a href="#">Menu Item<i class="fa fa-angle-down"></i></a></li>
												<li><a href="#">Menu Item<i class="fa fa-angle-down"></i></a></li>
												<li><a href="#">Menu Item<i class="fa fa-angle-down"></i></a></li>
											</ul>
										</li>
										<li><a href="#">Menu Item<i class="fa fa-angle-down"></i></a></li>
										<li><a href="#">Menu Item<i class="fa fa-angle-down"></i></a></li>
										<li><a href="#">Menu Item<i class="fa fa-angle-down"></i></a></li>
									</ul>
								</li>
								<li class="page_menu_item has-children">
									<a href="#">Featured Brands<i class="fa fa-angle-down"></i></a>
									<ul class="page_menu_selection">
										<li><a href="#">Featured Brands<i class="fa fa-angle-down"></i></a></li>
										<li><a href="#">Menu Item<i class="fa fa-angle-down"></i></a></li>
										<li><a href="#">Menu Item<i class="fa fa-angle-down"></i></a></li>
										<li><a href="#">Menu Item<i class="fa fa-angle-down"></i></a></li>
									</ul>
								</li>
								<li class="page_menu_item has-children">
									<a href="#">Trending Styles<i class="fa fa-angle-down"></i></a>
									<ul class="page_menu_selection">
										<li><a href="#">Trending Styles<i class="fa fa-angle-down"></i></a></li>
										<li><a href="#">Menu Item<i class="fa fa-angle-down"></i></a></li>
										<li><a href="#">Menu Item<i class="fa fa-angle-down"></i></a></li>
										<li><a href="#">Menu Item<i class="fa fa-angle-down"></i></a></li>
									</ul>
								</li>
								<li class="page_menu_item"><a href="blog.html">blog<i class="fa fa-angle-down"></i></a></li>
								<li class="page_menu_item"><a href="contact.html">contact<i class="fa fa-angle-down"></i></a></li>
							</ul>
							
							<div class="menu_contact">
								<div class="menu_contact_item"><div class="menu_contact_icon"><img src="images/phone_white.png" alt=""></div>+38 068 005 3570</div>
								<div class="menu_contact_item"><div class="menu_contact_icon"><img src="images/mail_white.png" alt=""></div><a href="mailto:fastsales@gmail.com">fastsales@gmail.com</a></div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

	</header>
	
	<!-- Banner -->
        <center>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.*,java.util.*" %>
<%
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
%>
</center>
	
	<!-- Footer -->

	<footer class="footer">
		<div class="container">
			<div class="row">

				<div class="col-lg-3 footer_col">
					<div class="footer_column footer_contact">
						<div class="logo_container">
							<div class="logo"><a href="#">Book Store</a></div>
						</div>
						<div class="footer_title">Got Question? Call Us 24/7</div>
						<div class="footer_phone">+91 98807 78964</div>
						
						<div class="footer_social">
							<ul>
								<li><a href="#"><i class="fab fa-facebook-f"></i></a></li>
								<li><a href="#"><i class="fab fa-twitter"></i></a></li>
								<li><a href="#"><i class="fab fa-youtube"></i></a></li>
								<li><a href="#"><i class="fab fa-google"></i></a></li>
								<li><a href="#"><i class="fab fa-vimeo-v"></i></a></li>
							</ul>
						</div>
					</div>
				</div>
				<div class="col-lg-2">
					<div class="footer_column">
						<div class="footer_title">Customer Care</div>
						<ul class="footer_list">
							<li><a href="#">My Account</a></li>
							<li><a href="#">Order Tracking</a></li>
							<li><a href="#">Wish List</a></li>
							<li><a href="#">Customer Services</a></li>
							<li><a href="#">Returns / Exchange</a></li>
							<li><a href="#">FAQs</a></li>
							<li><a href="#">Product Support</a></li>
						</ul>
					</div>
				</div>

			</div>
		</div>
	</footer>

	<!-- Copyright -->

	<div class="copyright">
		<div class="container">
			<div class="row">
				<div class="col">
					
					<div class="copyright_container d-flex flex-sm-row flex-column align-items-center justify-content-start">
						
						<div class="logos ml-sm-auto">
							<ul class="logos_list">
								<li><a href="#"><img src="images/logos_1.png" alt=""></a></li>
								<li><a href="#"><img src="images/logos_2.png" alt=""></a></li>
								<li><a href="#"><img src="images/logos_3.png" alt=""></a></li>
								<li><a href="#"><img src="images/logos_4.png" alt=""></a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
     
     
     
     
     
 







<script src="js/jquery-3.3.1.min.js"></script>
<script src="styles/bootstrap4/popper.js"></script>
<script src="styles/bootstrap4/bootstrap.min.js"></script>
<script src="plugins/greensock/TweenMax.min.js"></script>
<script src="plugins/greensock/TimelineMax.min.js"></script>
<script src="plugins/scrollmagic/ScrollMagic.min.js"></script>
<script src="plugins/greensock/animation.gsap.min.js"></script>
<script src="plugins/greensock/ScrollToPlugin.min.js"></script>
<script src="plugins/OwlCarousel2-2.2.1/owl.carousel.js"></script>
<script src="plugins/slick-1.8.0/slick.js"></script>
<script src="plugins/easing/easing.js"></script>
<script src="js/custom.js"></script>
<script src="js/book.js"></script>



 
</body>

</html>