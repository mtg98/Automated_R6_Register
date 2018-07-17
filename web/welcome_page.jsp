<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.lang.*"%>
<%@page import="java.sql.*" %>
<%@page import="javax.servlet.*" %>
<%@page import="java.util.logging.Level"%>
<%@page import="java.util.logging.Logger"%>
<%@page import="java.io.*"%>
<%@page import="javax.servlet.*"%>
<%@page import="javax.servlet.http.*"%>
<%@page import="java.sql.*"%>
<%@page import="com.opensymphony.xwork2.ActionSupport"%>
<%@page import="com.opensymphony.xwork2.ActionContext"%>
<%@page import="java.lang.System.*"%>
<%@page import="static java.lang.System.out"%>
<%@page import="org.apache.struts2.ServletActionContext"%>

<%@page import="java.security.MessageDigest"%>
<%@page import="javax.servlet.*" %>

<!DOCTYPE html>
<!DOCTYPE html>

<html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Page Title</title>
<style>
body
{		
    background-image: url("css1.jpg");
}
.container {
    background-image: url("css1.jpg");
    text-align: center;
    color: black;
    font-family: Arial, Helvetica, sans-serif;
    padding: 50px;
    
}
p{
	color: #808080;
    margin: 10px;
}
.db {d
    background-color: #4CAF50;
    color: black;
    padding: 16px;
    font-size: 25px;
    border: none;
    width:160px;
}


.dd {
    position: relative;
    display: inline-block;
}


.dc {
    display: none;
    position: absolute;
    background-color: #91d88a;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}


.dc a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
}

body {
	margin: 0;
	
	
}

.container1 {
	width: 95%;
	margin: 0 auto;
	color: #91d88a;
}

header {
  background: #195fc6;
}

header::after {
  content: '';
  display: table;
  clear: both;
}

.logo {
  float: left;
  padding: 10px 0;
}

nav {
  float: right;
}

nav ul {
  margin: 0;
  padding: 0;
  list-style: none;
}

nav li {
  display: inline-block;
  margin-left: 70px;
  padding-top: 10px;
  font-size: 35px;
  position: relative;
}

nav a {
  color: #f9f9ef;
  text-decoration: none;
  text-transform: uppercase;
  font-size: 14px;
}

nav a:hover {
  color: #8e3216;
}

nav a::before {
  content: '';
  display: block;
  height: 5px;
  background-color: #444;

  position: absolute;
  top: 0;
  width: 0%;

  transition: all ease-in-out 250ms;
}

nav a:hover::before {
  width: 100%;
}
img.container1{
	margin: 0;
	padding: 0;
}
h1{
	margin: 0 10px;
        padding: 0;
}
h1:hover{
    color: black;
}
.dc a:hover {background-color: #748d93;}
.dd:hover .dc {display: block;}
.dd:hover .db {background-color: #63cfed;}

.output1{
    font-size: 45px;
    font-weight: bold;
    color: blue;
    font-family: "Sans-serif";
    text-align: center;
}

.output2{
    font-size: 35px;
    font-weight: bold;
    color: blue;
    font-family: "Sans-serif";
    text-align: center;
}


</style>
 </head>
        <body>
            
        <img src="upgovlogo.png" alt="logo" class="logo" height="42" width="42">
<header>
    <div class="container1">
      <h1 class="logo"><b class="logo1"><font size="6px">  राजस्व परिषद, उत्तर प्रदेश </font></b></h1>

      <nav>
        <ul>
         <li><a href="login_page.jsp"><font size="4px"><b>लॉगआउट</b></a></li>
        </ul>
      </nav>
    </div>
  </header>

<div class="container">
    <div class="main-logo1 float-left" style="font-size: 2em; margin-left: 10px;">
                        
                            <div class="float-left" style="padding: 10px 0px 0px 0px;">
                                <img src="upgovlogo.png" width="150" height="150" />
                            </div>
                     <% 
                                                 
                                    Connection con = null;
                                    PreparedStatement ps1=null, ps2= null;
                                    ResultSet rs1 = null, rs2=null;
                                    String uname;
                                    String tname = null;
                                    String district_name_hindi=null;
                                    uname =session.getAttribute("uname").toString();
                                
                                 try {
            Class.forName("org.postgresql.Driver");
            //creating connection Using Postgres Change it to other
            con = DriverManager.getConnection("jdbc:postgresql://10.135.28.162:5432/up_lrc", "postgres", "postgres");
            ps1 = con.prepareStatement("select tname from up_user_master u left join up_tehsil_master t on ( u.district_code_census = t.district_code_census AND u.tehsil_code_census = t.tehsil_code_census) where u.username =?");
            ps1.setString(1, uname);
            rs1 = ps1.executeQuery();
           
            while(rs1.next()){
            tname = rs1.getString("tname");
            }
            
             ps2 = con.prepareStatement("select d.district_name_hindi from up_user_master u left join up_district_master d on ( u.district_code_census = d.district_code_census) where u.username =?");
             ps2.setString(1, uname);
             rs2 = ps2.executeQuery();
            
             while(rs2.next()){
            district_name_hindi = rs2.getString("district_name_hindi");
             }
             
             
            } catch (Exception e) {}   
                                 
                                 String output1 = tname + "तहसील में आपका स्वागत है";
                                 String output2 = district_name_hindi + "-उत्तर प्रदेश";                 
                            %>  </div>
     
                            
                            <br><br><br><br>
                            
                           <span class="output1"> <%= output1 %> </span>
              <br>
              <br>
              <span class="output2"> <%= output2 %> </span>
              <br>
              <br>
              <br>
      
    


          <div class="dd">
             <br><br> <button class="db">मेन्यू</button>
                 <div class="dc">
                     <a href="R6_Register.jsp">र-6  रजिस्टर अध्यनन करे</a>
                 </div>
          </div>
</div>
</body>
</html>