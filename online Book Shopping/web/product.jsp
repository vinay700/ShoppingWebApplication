<%-- 
    Document   : product
    Created on : 20 Jul, 2018, 11:34:30 AM
    Author     : Vinay
--%>

<%@page import="com.mysql.cj.jdbc.result.ResultSetMetaData"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Single Product</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="OneTech shop project">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="styles/bootstrap4/bootstrap.min.css">
<link href="plugins/fontawesome-free-5.0.1/css/fontawesome-all.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/owl.carousel.css">
<link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/owl.theme.default.css">
<link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/animate.css">
<link rel="stylesheet" type="text/css" href="styles/product_styles.css">
<link rel="stylesheet" type="text/css" href="styles/product_responsive.css">

</head>

<body>

<div class="super_container">
	<!-- Header -->
	<header class="header">
		<!-- Top Bar -->
		<div class="top_bar">
			<div class="container">
				<div class="row">
					<div class="col d-flex flex-row">
				<div class="top_bar_contact_item"><div class="top_bar_icon"><img src="images/phone.png" alt=""></div>+91 98807 78964</div>
                                    <div class="top_bar_contact_item"><div class="top_bar_icon"><img src="images/mail.png" alt=""></div><a href="mailto:fastsales@gmail.com">BookStroe123@gmail.com</a></div>
						<div class="top_bar_content ml-auto">
                                                <ul class="standard_dropdown top_bar_dropdown">
                                                <li>
                                                <a href="#">My Account<i class="fas fa-chevron-down"></i></a>
                                                <ul>
                                                    <li><a href="changepassword.jsp">Change Password</a></li>
                                                    <li><a href="#">My Orders</a></li>
                                                    <li><a href="logout.jsp">LogOut</a></li>
                                                </ul>
                                            </li>
                                        </ul>
						</div>
					</div>
				</div>
			</div>		
		</div>

		<!-- Header Main -->

		<div class="header_main">
			<div class="container">
				<div class="row">

					<!-- Logo -->
					<div class="col-lg-2 col-sm-3 col-3 order-1">
						<div class="logo_container">
							<div class="logo"><a href="admin.jsp">Book Store</a></div>
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
						<div class="wishlist_cart d-flex flex-row align-items-center justify-content-end">
							<div class="wishlist d-flex flex-row align-items-center justify-content-end">
								<div class="wishlist_icon"><img src="images/heart.png" alt=""></div>
								<div class="wishlist_content">
									<div class="wishlist_text"><a href="#">Wishlist</a></div>
									<div class="wishlist_count">115</div>
								</div>
							</div>

							<!-- Cart -->
							<div class="cart">
								<div class="cart_container d-flex flex-row align-items-center justify-content-end">
									<div class="cart_icon">
										<img src="images/cart.png" alt="">
									</div>
									<div class="cart_content">
										<div class="cart_text"><a href="#">Cart</a></div>
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
					</div>
				</div>
			</div>
		</div>

	</header>

	<!-- Single Product -->
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.*" %>


<%
try
{
    String name=request.getParameter("bname");
    out.println(name);
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root",""); 
    Statement stmt=con.createStatement();
    ResultSet rs;
    String s="",s3="",s5="",s2="";
    String s1="select * from books where BookName='A First Course in Programming with C'";
    rs = stmt.executeQuery(s1);
    while (rs.next())
    {
        s=rs.getString(7);
        s5=rs.getString(6);
        s3=rs.getString(3);
        s2=rs.getString(2);
    }
    

%>

	<div class="single_product">
		<div class="container">
			<div class="row">

				<!-- Images -->
				

				<!-- Selected Image -->
				<div class="col-lg-5 order-lg-2 order-1">
					<div class="image_selected"><div class="image_selected"><%out.println("<td><b> <img src='images/"+s+"'  height='420' width='420'> </b></td>");%></div>
                                        </div>
				</div>

				<!-- Description -->
				<div class="col-lg-5 order-3">
					<div class="product_description">
						<div class="product_category"> <%out.println("<td><b>"+s2+" </b>");%> <b>Books</b></div>
						<div class="product_name"><%out.println("<td><b>"+s3+" </b>");%></div>
						<div class="rating_r rating_r_4 product_rating"><i></i><i></i><i></i><i></i><i></i></div>
						<div class="order_info d-flex flex-row">
							<form action="#">
								<div class="clearfix" style="z-index: 1000;">

									<!-- Product Quantity -->
									<div class="product_quantity clearfix">
										<span>Quantity: </span>
										<input id="quantity_input" type="text" pattern="[0-9]*" value="1">
										<div class="quantity_buttons">
											<div id="quantity_inc_button" class="quantity_inc quantity_control"><i class="fas fa-chevron-up"></i></div>
											<div id="quantity_dec_button" class="quantity_dec quantity_control"><i class="fas fa-chevron-down"></i></div>
										</div>
									</div>

								</div>

								<div class="product_price"><%out.println("<td><b>"+s5+" </b>");%></div>
								<div class="button_container">
									<button type="button" class="button cart_button">Add to Cart</button>
									<div class="product_fav"><i class="fas fa-heart"></i></div>
								</div>
								
							</form>
						</div>
					</div>
				</div>

			</div>
		</div>
	</div>
	<div class="brands">
		<div class="container">
			<div class="row">
				<div class="col">
					<div class="brands_slider_container">
						
						<!-- Brands Slider -->

						<div class="owl-carousel owl-theme brands_slider">
							
							<div class="owl-item"><div class="brands_item d-flex flex-column justify-content-center"><img src="images/brands_1.jpg" alt=""></div></div>
							<div class="owl-item"><div class="brands_item d-flex flex-column justify-content-center"><img src="images/brands_2.jpg" alt=""></div></div>
							<div class="owl-item"><div class="brands_item d-flex flex-column justify-content-center"><img src="images/brands_3.jpg" alt=""></div></div>
							<div class="owl-item"><div class="brands_item d-flex flex-column justify-content-center"><img src="images/brands_4.jpg" alt=""></div></div>
							<div class="owl-item"><div class="brands_item d-flex flex-column justify-content-center"><img src="images/brands_5.jpg" alt=""></div></div>
							<div class="owl-item"><div class="brands_item d-flex flex-column justify-content-center"><img src="images/brands_6.jpg" alt=""></div></div>
							<div class="owl-item"><div class="brands_item d-flex flex-column justify-content-center"><img src="images/brands_7.jpg" alt=""></div></div>
							<div class="owl-item"><div class="brands_item d-flex flex-column justify-content-center"><img src="images/brands_8.jpg" alt=""></div></div>

						</div>
						
						<!-- Brands Slider Navigation -->
						<div class="brands_nav brands_prev"><i class="fas fa-chevron-left"></i></div>
						<div class="brands_nav brands_next"><i class="fas fa-chevron-right"></i></div>

					</div>
				</div>
			</div>
		</div>
	</div>

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
						<div class="copyright_content"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                    Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
<   !-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
</div>
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
<%
    }
    catch(Exception e)
    {
        
    }
     %>

<script src="js/jquery-3.3.1.min.js"></script>
<script src="styles/bootstrap4/popper.js"></script>
<script src="styles/bootstrap4/bootstrap.min.js"></script>
<script src="plugins/greensock/TweenMax.min.js"></script>
<script src="plugins/greensock/TimelineMax.min.js"></script>
<script src="plugins/scrollmagic/ScrollMagic.min.js"></script>
<script src="plugins/greensock/animation.gsap.min.js"></script>
<script src="plugins/greensock/ScrollToPlugin.min.js"></script>
<script src="plugins/OwlCarousel2-2.2.1/owl.carousel.js"></script>
<script src="plugins/easing/easing.js"></script>
<script src="js/product_custom.js"></script>
</body>

</html>