<%@page import="java.io.InputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.File"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <html>

</html> 
<%
Connection conn=null;
PreparedStatement pstmt = null;
ResultSet rs=null;
String url= "jdbc:mysql://localhost:3306/shopping";
FileInputStream fis=null;
String bname=request.getParameter("bname");
String myloc=request.getParameter("myimg");
try
{
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    conn=DriverManager.getConnection(url,"root", "");
    File image= new File(myloc);
    pstmt = conn.prepareStatement("insert into books (bookname, photo) values (?, ?)");
    pstmt.setString(1, bname);
    pstmt.setString(2, myloc);
    int count = pstmt.executeUpdate();
    out.println("insert successfully");
    rs.close();
    pstmt.close();
    conn.close();
}
catch(Exception e)
{
    out.println(e);
}


%>
          
<!-- // try
{
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","");
	Statement st=conn.createStatement();
	
		int i=st.executeUpdate("insert into logintab(email,password,repassword)values('"+email+"','"+pass1+"','"+repass+"')");
		out.println("<html><body><b><h1> Book Added successfully </h1></b></body></html>");
	
}
catch(Exception e)
{
out.println(e);
}
            String sql = "INSERT INTO books (bookname, photo) values (?, ?)"; 

 
 
 <script> --> 
<!--// $(document).ready(function(){  
//      $('#insert').click(function(){  
//           var image_name = $('#image').val();  
//           if(image_name == '')  
//           {  
//                alert("Please Select Image");  
//                return false;  
//           }  
//           else  
//           {  
//          
//            var extension = $('#image').val().split('.').pop().toLowerCase();  
//                if(jQuery.inArray(extension, ['gif','png','jpg','jpeg']) == -1)  
//                {  
//                     alert('Invalid Image File');  
//                     $('#image').val('');  
//                     return false;  
//                }  
//           }  
//      });  
// });  
// </script>  -->