<%-- 
    Document   : login_page
    Created on : 27 Jun, 2018, 11:48:10 AM
    Author     : mrinalini
.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
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

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Login page</title>

        <style>
            body{  
                background-image: url("css1.jpg");
                background:linear-gradient(rgba(0, 0, 0, 0.05), rgba(0, 0, 0, 0.05)), url("css1.jpg");
                background-size: cover;
            }         
            h2{
                background-color: #FEFFED;
                padding: 30px 35px;
                margin: -10px -50px;
                text-align:center;
                border-radius:  10px 10px;
            }

            hr{
                margin: 10px -50px;
                border: 0;
                border-top: 1px solid #ccc;
                margin-bottom: 40px;
                color: #80ff00;
            }

            div.container{
                width: 450px;
                height: 610px;
                margin:35px auto;
                font-family: 'Roboto', sans-serif;
            }

            div.main{
                width: 500px;
                padding: 10px 50px 25px;
                border: 3px solid gray;
                border-radius: 10px;
                font-family: raleway;
                float:left;
                margin-top:50px;
                background-color: white;
                margin: auto;
                margin-top: 100px;
                height: 500px;

            }

            input[type=text],input[type=password]{
                width: 100%;
                height: 40px;
                padding: 5px;
                margin-bottom: 25px;
                margin-top: 5px;
                border: 2px solid #ccc;
                color: #4f4f4f;
                font-size: 16px;
                border-radius: 5px;
            }

            label{
                color: #464646;
                text-shadow: 0 1px 0 #fff;
                font-size: 24px;
                font-weight: bold;
            }

            center{
                font-size:32px;
            }

            .note{
                color:black;
            }

            .valid{
                color:green;
            }

            .back{
                text-decoration: none;
                border: 1px solid rgb(0, 143, 255);
                background-color: rgb(0, 214, 255);
                padding: 3px 20px;
                border-radius: 2px;
                color: black;
            }

            input[type=button]{
                font-size: 16px;
                background: #b2ccab;
                border: 1px solid #e5a900;
                color: #4E4D4B;
                font-weight: bold;
                cursor: pointer;
                width: 100%;
                border-radius: 5px;
                padding: 10px 0;
                outline:none;
            }
            .capbox {
                background-color: #d0e2ed;
                border: #a6d0ea 0px solid;
                border-width: 0px 12px 0px 0px;
                display: inline-block;
                *display: inline; zoom: 1; /* FOR IE7-8 */
                padding: 8px 40px 8px 8px;
            }

            .capbox-inner {
                font: bold 11px arial, sans-serif;
                color: #000000;
                background-color:#2ba5c6;
                margin: 5px auto 0px auto;
                padding: 3px;
                -moz-border-radius: 4px;
                -webkit-border-radius: 4px;
                border-radius: 4px;
            }

            #CaptchaDiv {
                font: bold 17px verdana, arial, sans-serif;
                font-style: italic;
                color: #000000;
                background-color: #f9f7a4;
                padding: 4px;
                -moz-border-radius: 4px;
                -webkit-border-radius: 4px;
                border-radius: 4px;
            }

            #CaptchaInput { margin: 1px 0px 1px 0px; width: 135px; }


            input[type=button]:hover{
                background: #9ab294;
            }
            .btn {
			 background: #80c9f7;
  			 display: inline-block;
  			 border-radius: 4px;
             border-color: #4CAF50;
 			 box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2), 0 6px 20px 0 rgba(0,0,0,0.19);
 			 font-family: Arial, sans-serif;
  			 line-height: 1.5em;
  			 padding: 0 1em;
			 font-size: 20px;
 			 text-decoration: none;
            }
    		.btn:hover {
     	    background: #53b2ed; /* Green */
      	    color: white;
		    box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2), 0 6px 20px 0 rgba(0,0,0,0.19);
            }
            body {
	margin: 0;
	background: white;
	font-family: 'Work Sans', sans-serif;
	font-weight: 800;
}

.container1 {
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
  padding: 0px 0;
}


img.container1{
	margin: 0;
	padding: 0;
}
h1{
	margin: 10px 20px;
        padding-left: 10px;
	
}

            
            


        </style>

    </head>
    <body>

    <img src="upgovlogo3.png" alt="logo" class="logo" height="60" width="60">
     <header>
     <div class="container1">
      <h1 class="logo"><b class="logo1"><font size="6px">  राजस्व परिषद, उत्तर प्रदेश </font></b></h1>

      
     </div>
     </header>

        <div class="container">
            <div class="main">
                <h2>तहसील प्रबन्धनकर्ता लॉगिन</h2>
                <form id="form_id" method="post"  action="login_new" name="myform" onsubmit="return checkform(this)">
                    <label>प्रयोगकर्ता :</label>
                    <input type="text" name="uname" id="username"/>
                    <label>पासवर्ड :</label>
                    <input type="password" name="passw" id="password"/>
                    <br>
                    <div class="capbox">

                        <div id="CaptchaDiv"></div>

                        <div class="capbox-inner">
                            Type the above number:<br>

                            <input type="hidden" id="txtCaptcha">
                            <input type="text" name="CaptchaInput" id="CaptchaInput" size="15" autocomplete="off"><br>

                        </div>
                    </div>
                    <br><br>
                    <input type="submit" value="लॉगिन" name="next" id="agla"/>
                </form>

            </div>
        </div>
        <script type="text/javascript">
            function checkform(theform) {
                var why = "";
                if (theform.CaptchaInput.value === "") {
                    why += "- Please Enter CAPTCHA Code.\n";
                }
                if (theform.CaptchaInput.value !== "") {
                    if (ValidCaptcha(theform.CaptchaInput.value) === false) {
                        why += "- The CAPTCHA Code Does Not Match.\n";
                    }
                }
                if (validate() == false)
                    why += "Username and password cant be null.\n";
                if (why !== "") {
                    alert(why);
                    return false;
                }
            }
            var a = Math.ceil(Math.random() * 9) + '';
            var b = Math.ceil(Math.random() * 9) + '';
            var c = Math.ceil(Math.random() * 9) + '';
            var d = Math.ceil(Math.random() * 9) + '';
            var e = Math.ceil(Math.random() * 9) + '';
            var code = a + b + c + d + e;
            document.getElementById("txtCaptcha").value = code;
            document.getElementById("CaptchaDiv").innerHTML = code;
            function ValidCaptcha() {
                var str1 = removeSpaces(document.getElementById('txtCaptcha').value);
                var str2 = removeSpaces(document.getElementById('CaptchaInput').value);
                if (str1 === str2) {
                    return true;
                } else {
                    alert("Wrong captcha");
                    return false;
                }
            }
            function removeSpaces(string) {
                return string.split(' ').join('');
            }

            function validate() {
                var user1 = document.getElementById("username").value;
                var pass1 = document.getElementById("password").value;
                if (user1 === "" || pass1 === "") {
                    return false;
                }

            }
        </script>
    </body> 
</html>