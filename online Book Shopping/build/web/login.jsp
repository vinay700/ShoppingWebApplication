<%@page import="java.security.Key"%>
<!DOCTYPE html>
<%@page import="java.sql.*,java.util.*"%>

<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
}

* {
  box-sizing: border-box;
}

/* style the container */
.container {
  position: relative;
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px 0 30px 0;
} 

/* style inputs and link buttons */
input,
.btn {
  width: 100%;
  padding: 12px;
  border: none;
  border-radius: 4px;
  margin: 5px 0;
  opacity: 0.85;
  display: inline-block;
  font-size: 17px;
  line-height: 20px;
  text-decoration: none; /* remove underline from anchors */
}

input:hover,
.btn:hover {
  opacity: 1;
}

/* add appropriate colors to fb, twitter and google buttons */
.fb {
  background-color: #3B5998;
  color: white;
}

.twitter {
  background-color: #55ACEE;
  color: white;
}

.google {
  background-color: #dd4b39;
  color: white;
}

/* style the submit button */
input[type=submit] {
  background-color: #4CAF50;
  color: white;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

/* Two-column layout */
.col {
  float: left;
  width: 50%;
  margin: auto;
  padding: 0 50px;
  margin-top: 6px;
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}

/* vertical line */
.vl {
  position: absolute;
  left: 50%;
  transform: translate(-50%);
  border: 2px solid #ddd;
  height: 175px;
}

/* text inside the vertical line */
.vl-innertext {
  position: absolute;
  top: 50%;
  transform: translate(-50%, -50%);
  background-color: #f1f1f1;
  border: 1px solid #ccc;
  border-radius: 50%;
  padding: 8px 10px;
}

/* hide some text on medium and large screens */
.hide-md-lg {
  display: none;
}

/* bottom container */
.bottom-container {
  text-align: center;
  background-color: #666;
  border-radius: 0px 0px 4px 4px;
}

@media screen and (max-width: 650px) {
  .col {
    width: 100%;
    margin-top: 0;
  }
  /* hide the vertical line */
  .vl {
    display: none;
  }
  /* show the hidden text on small screens */
  .hide-md-lg {
    display: block;
    text-align: center;
  }
}
</style>
</head>
<body onload="noBack();" onpageshow="if (event.persisted) noBack();" onunload="">
<h1>  Book Mart Login </h1>


<div class="container">
  <form action="login.jsp">
    <div class="row">
      <h2 style="text-align:center">Login with Social Media or Manually</h2>
      <div class="vl">
        <span class="vl-innertext">or</span>
      </div>

      <div class="col">
        <a href="https://www.facebook.com/" class="fb btn">
          <i class="fa fa-facebook fa-fw"></i> Login with Facebook
         </a>
        <a href="https://twitter.com/login?lang=en" class="twitter btn">
          <i class="fa fa-twitter fa-fw"></i> Login with Twitter
        </a>
        <a href="https://myaccount.google.com/" class="google btn"><i class="fa fa-google fa-fw">
          </i> Login with Google+
        </a>
      </div>

      <div class="col">
        <div class="hide-md-lg">
          <p>Or sign in manually:</p>
        </div>

        <input type="text" name="email" placeholder="Email" required>
        <input type="password" name="password" placeholder="Password" required>
        <input type="submit" value="Login">
      </div>
      
    </div>
  </form>
</div>

<div class="bottom-container">
  <div class="row">
    <div class="col">
      <a href="signup.jsp" style="color:white" class="btn">Sign up</a>
    </div>
    <div class="col">
      <a href="forgotpass.jsp" style="color:white" class="btn">Forgot password?</a>
    </div>
  </div>
</div>
<div> <h3>Invalid password</h3></div>

</body>
</html>

    
    
   <%@page import="java.security.Key,javax.crypto.Cipher,javax.crypto.spec.SecretKeySpec,sun.misc.BASE64Decoder,sun.misc.BASE64Encoder" %>
        <%!
            public class staffreg{
            static final String ALGORITHM = "AES";
            static final String KEY = "1Hbfh667adfDEJ78";
         
         String encrypt(String value) throws Exception
    {
        Key key = generateKey();
        Cipher cipher = Cipher.getInstance(staffreg.ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte [] encryptedByteValue = cipher.doFinal(value.getBytes("utf-8"));
        String encryptedValue64 = new BASE64Encoder().encode(encryptedByteValue);
        return encryptedValue64;
               
    }
    String decrypt(String value) throws Exception
    {
        Key key = generateKey();
        Cipher cipher = Cipher.getInstance(staffreg.ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte [] decryptedValue64 = new BASE64Decoder().decodeBuffer(value);
        byte [] decryptedByteValue = cipher.doFinal(decryptedValue64);
        String decryptedValue = new String(decryptedByteValue,"utf-8");
        return decryptedValue;
                
    }
    
    Key generateKey() throws Exception 
    {
        Key key = new SecretKeySpec(staffreg.KEY.getBytes(),staffreg.ALGORITHM);
        return key;
    }
}     
%>  <%    
try{
    String password1="";
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","");
    Statement st = con.createStatement();
    ResultSet rs;
    String email = request.getParameter("email");
    String p = request.getParameter("password");
    if((email.equals("admin@gmail.com"))||(p.equals("admin")))
    {		
        session.setAttribute("email", email);
        response.sendRedirect("admin.jsp");
    }
    else
    {
        PreparedStatement ps = null;
        session.setAttribute("email", "Vinay@gmail.com");
        String sql = "select * from logintab where email='"+email+"'";
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        ResultSetMetaData rmd; 
        rmd =rs.getMetaData();
        int n=rmd.getColumnCount();
        while (rs.next())
        {
            for(int x=1;x<=n;x++)
            {
                if(x==2)
                {
                    password1=rs.getString(x);
                }
            }
            out.println(password1);
            staffreg staffreg=new staffreg();
            String decryptedPassword = staffreg.decrypt(password1);
            out.println(decryptedPassword);
            if(p.equals(decryptedPassword))
            {
                out.println("<b>welcome</b>");
                response.sendRedirect("mainshoping.jsp");                
            }
            else
            {
                   out.println("<b>welcome</b>");
                response.sendRedirect("mainshoping.jsp"); 
            }
        }
    }
 }
 catch(Exception e)
 {
} 
	


%>
