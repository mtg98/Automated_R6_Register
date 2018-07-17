<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.servlet.http.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
                body{                
                    background:linear-gradient(rgba(0, 0, 0, 0.01), rgba(0, 0, 0, 0.01));
	           background-size: cover;
            }         
                .borderless tbody tr td, .borderless tbody tr th, .borderless thead tr th {
            border: none;
        }

        

         .auto-style6 {
            width: 22px;
            height: 1px;
        }

        .auto-style7 {
            width: 142px;
            height: 1px;
        }

        .auto-style8 {
            width: 50px;
            height: 1px;
        }

        .auto-style9 {
            width: 101px;
            height: 1px;
        }

        .auto-style10 {
            width: 100px;
            height: 1px;
        }
        input{
        	max-width: 200px;
		float: right;
        }
	
        label {
           width:380px;
           clear:left;
           text-align:left;
           padding-right: 10px;
	   
         }
          .form{
	    
	    border-style: solid;
            border-width: 2px;
	    max-width: 1250px;
	    top: 50%;
       	    left: 50%;
 	    margin: 0 auto;
	    height: 60em;
	}    
	
       
     .right{
              
              width: 500px;
             
              float: right;
              margin: 30px;
              text-color: orange;
	      padding: 30px;
              
              display: inline-block; *display: inline; zoom: 1; vertical-align: top; font-size: 20px;
     }
     .left{
              width: 500px;
              float: left;
              margin: 30px;
              text-color: orange;
              padding: 30px;
              display: inline-block; *display: inline; zoom: 1; vertical-align: top; font-size: 20px;
     }
     input[type="button"], input[type="reset"], input[type="submit"] {
        font-size:15px;
        font-weight:normal;
        padding:6px 24px;
        text-decoration:none;
}
.btn {
	 background: #4CAF50;
  	 display: inline-block;
  	 border-radius: 4px;
	 border-color: #4CAF50;
 	 box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2), 0 6px 20px 0 rgba(0,0,0,0.19);
 	 font-family: Arial, sans-serif;
  	 line-height: 2.5em;
  	 padding: 0 1em;
	 font-size: 20px;
 	 text-decoration: none;
}
     .btn:hover {
         background: #01c60b; /* Green */
         color: white;
	 box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2), 0 6px 20px 0 rgba(0,0,0,0.19);
}
body {
	margin: 0;
	background: white;
	font-family: 'Work Sans', sans-serif;
	font-weight: 800;
}

.container {
	width: 95%;
	margin: 0 auto;
	color: #f9f9ef;
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
  color: #000;
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
img{
	margin: 0;
	padding: 0;
}
h1{
	margin: 0 10px;
        padding: 0;
	
}
select{
        font-size:15px;
        font-weight:normal;
        padding:4px 24px;
        text-decoration:none;
        margin-left: 100px;
}

    
 </style>
 
 <script>
     
     function validate_form()
                {
                var regex=/^[0-9]+$/;
              
                var cse=document.R6reg.case_no.value;
                var khasra=document.R6reg.khasra_no.value;
                var khata=document.R6reg.khata_number.value;
                var hissa=document.R6reg.hissa_area.value;
                var seq=document.R6reg.seq_no.value;
                
                var dname=document.R6reg.deleted_name.value;
                var ifname=document.R6reg.insert_fname.value;
                var area=document.R6reg.area.value;
                var land_rev=document.R6reg.land_rev_pay.value;
                var iname=document.R6reg.insert_name.value;
                
                var amoount=document.R6reg.amount.value;
                var cby=document.R6reg.created_by.value;
                var dserial=document.R6reg.device_serial_no.value;
                var tt=document.R6reg.transfer_type.value;
            if(cse==""|| khasra==""|| khata==""|| hissa==""|| seq==""
                    || dname==""|| ifname==""|| area==""|| land_rev==""
                    || iname==""|| cby==""|| dserial=="")
                    {
                    alert('Fill in the required fields');
                    return false;
                    }
                 else if (regex.test(area)==false)
                {
                    alert('area can only be a number');
                    return false;
                } else if(transfer_type=="0"||transfer_type==null)
                {
                    alert('please select an option for transfer type');
                    return false;
                } else return true;
            
            }
            </script>
 </head>
    <body>
        <img src="upgovlogo.png" alt="logo" class="logo" height="52" width="52">
<header>
    <div class="container">
      <h1 class="logo"><b class="logo1"><font size="5px">  राजस्व परिषद, उत्तर प्रदेश </font></b></h1>

      <nav>
        <ul>
         <li><a href="welcome_page.jsp"><font size="4px"><b>मुख पृष्ठ</b></a></li>
        </ul>
      </nav>
    
</div>
</header>
        <p style="text-indent: 16em;"><font face="arial" size="7"><center><font color="white"></font><b>आकार पत्र र6-रजिस्टर </b></font></center>
    <form name="R6reg" action="insert_data" onsubmit="return validate_form()" >
            <p> <center> <h2> नामान्तरण  पंजी ( दाखिल - ख़ारिज ) का रजिस्टर </h2> </center> </p>
        
              <table border="0" width="1000" cellspacing="1" cellpadding="1">
                <thead>
            <tr>
                <th></th>
                <th></th>
            </tr>
        </thead>
        
         <div class="form">  
            <div class= "left"> 
        
            <label for="vname">गाँव का नाम </label>
            <select name="vname" id="vname">
             <%
                                    Connection con = null;
                                    PreparedStatement ps = null;
                                    ResultSet rs = null;
                                    String username = session.getAttribute("uname").toString();
                                    try {
                                        Class.forName("org.postgresql.Driver");
                                        //creating connection Using Postgres Change it to other
                                        con = DriverManager.getConnection("jdbc:postgresql://10.135.28.162:5432/up_lrc", "postgres", "postgres");
                                        ps = con.prepareStatement("select vname from up_village_master where tehsil_code_census =(select tehsil_code_census from up_user_master where username =?)");
                                        System.out.println(username);
                                        ps.setString(1, username);
                                        rs = ps.executeQuery();

                                %><option value="0">----select----</option>
                                <%while (rs.next()) {%>
                                <option value="<%= rs.getString("vname")%>" ><%= rs.getString("vname")%></option>
                                <% } %>
                            </select>
                            <%  } catch (Exception e) {
                                    out.println("Try again");
                                }
                            %>
           
                            <br><br>                
                            
            <label for="case_no"> मुकदमा संख्या </label>
            <input type="text" id = "case_no" name="case_no" value="" size="20" /><br><br>

            <label for="khasra_no"> खसरा संख्या </label>
            <input type="text" id="khasra_no" name="khasra_no" value="" size="20" /><br><br>
          
            <label for="khata_number"> खाता संख्या </label>
            <input type="text" id="khata_number" name="khata_number" value="" size="20" /> <br><br>
            
            <label for="hissa_area">हिस्से का क्षेत्रफल </label>
            <input type="text" id="hissa_area"  name="hissa_area" value="" size="20" /><br><br>
            
            <label for="seq_no"> सीक्वेंस नंबर </label>
            <input type="text" id="seq_no" name="seq_no" value="" size="20" /><br><br>
            
            <label for="deleted_name"> भूतपूर्व मिल्क/कों का नाम </label>
            <input type="text" id="deleted_name" name="deleted_name" value="" size="20" /><br><br>

            <label for="deleted_address"> भूतपूर्व मालिक का पता </label>
            <input type="text" id="deleted_address" name="deleted_address" value="" size="20" /><br><br>

            <label for="insert_fname"> नए मालिक के पिता का नाम </label>
            <input type="text" id="insert_fname" name="insert_fname" value="" size=20" />
            <br><br>
            <label for="challan_no"> चालान संख्या</label>
            <input type="text" id="challan_no" name="challan_no" value="" size="20" /><br><br>

            <label for="created_on"> बनाने की तिथि </label>
            <input type="date" id="created_on" name="created_on" value="" size="20" /><br><br>

            <label for="modified_by"> संशोधित करने वाले का नाम </label>
            <input type="text" id="modified_by" name="modified_by" value="" size="20" /><br><br>
            <label for="transfer_type"> स्थानांतरण प्रकार</b>
            <select name="transfer_type" id="transfer_type">
                <option value="0">----select----</option>
                <option value="मृत्यु"> मृत्यु </option>
                <option value="बिक्री">बिक्री</option>
                <option value="अन्य">अन्य</option>
                  </select><br>

            <p> <label for="remark"> टिप्पनी </label>
            <input type="text" id="remark" name="remark" value="" size="100" /><br><br>

            

           
            </div>
                
            <div class= "right">
                
            <label for="order_date"> आदेश दिनांक </label>
            <input type="date" id="order_date" name="order_date" value="" size="20" /><br><br>

            <label for="area"> क्षेत्रफल </label>
            <input type="text" id="area" name="area" value="" size="20" /><br><br>

            <label for="land_rev_pay"> भू -राजस्व लगान  </label>
            <input type="text" id="land_rev_pay" name="land_rev_pay" value="" size="20" /><br><br>

            <label for="deleted_fname">भूतपूर्व मालिक के पिता का नाम </label>
            <input type="text" id="deleted_fname" name="deleted_fname" value="" size="20" /><br><br>

            <label for="insert_name"> नए मालिक का नाम </label>
            <input type="text" id="insert_name" name="insert_name" value="" size="20" />
<br><br>
            <label for="insert_address"> नए मालिक का पता </label>
            <input type="text" id="insert_address" name="insert_address" value="" size="20" /><br><br>

            <label for="amount">रकम </label>
            <input type="text" id="amount" name="amount" value="" size="20" />
<br><br>
            <label for="decision_date"> फैसले की तिथि</label>
            <input type="date" id="decision_date" name="decision_date" value="" size="20" /><br><br>

            <label for="remark"> बनाने वाले का नाम </label>
            <input type="text" id="created_by" name="created_by" value="" size="20" /><br><br>

            <label for="modified_no"> संशोधित करने की तिथि  </label>
            <input type="date" id="modified_on" name="modified_on" value="" size="20" /><br><br>
           

            <label for="device_serial_no"> डिवाइस सीरियल नंबर </label>
            <input type="text" id="device_serial_no" name="device_serial_no" value="" size="20" /><br><br>
            </div>
        
           
            <br>
            <br>
            
            <input type="submit" value="आगे बढ़े" name="hello" class="btn"/>
          </div>
                        
        </form>
    </body>
</html>