package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.servlet.http.*;

public final class R6_005fRegister_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<style type=\"text/css\">\n");
      out.write("                body{                \n");
      out.write("                    background:linear-gradient(rgba(0, 0, 0, 0.01), rgba(0, 0, 0, 0.01));\n");
      out.write("\t           background-size: cover;\n");
      out.write("            }         \n");
      out.write("                .borderless tbody tr td, .borderless tbody tr th, .borderless thead tr th {\n");
      out.write("            border: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("         .auto-style6 {\n");
      out.write("            width: 22px;\n");
      out.write("            height: 1px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .auto-style7 {\n");
      out.write("            width: 142px;\n");
      out.write("            height: 1px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .auto-style8 {\n");
      out.write("            width: 50px;\n");
      out.write("            height: 1px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .auto-style9 {\n");
      out.write("            width: 101px;\n");
      out.write("            height: 1px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .auto-style10 {\n");
      out.write("            width: 100px;\n");
      out.write("            height: 1px;\n");
      out.write("        }\n");
      out.write("        input{\n");
      out.write("        \tmax-width: 200px;\n");
      out.write("\t\tfloat: right;\n");
      out.write("        }\n");
      out.write("\t\n");
      out.write("        label {\n");
      out.write("           width:380px;\n");
      out.write("           clear:left;\n");
      out.write("           text-align:left;\n");
      out.write("           padding-right: 10px;\n");
      out.write("\t   \n");
      out.write("         }\n");
      out.write("          .form{\n");
      out.write("\t    \n");
      out.write("\t    border-style: solid;\n");
      out.write("            border-width: 2px;\n");
      out.write("\t    max-width: 1250px;\n");
      out.write("\t    top: 50%;\n");
      out.write("       \t    left: 50%;\n");
      out.write(" \t    margin: 0 auto;\n");
      out.write("\t    height: 60em;\n");
      out.write("\t}    \n");
      out.write("\t\n");
      out.write("       \n");
      out.write("     .right{\n");
      out.write("              \n");
      out.write("              width: 500px;\n");
      out.write("             \n");
      out.write("              float: right;\n");
      out.write("              margin: 30px;\n");
      out.write("              text-color: orange;\n");
      out.write("\t      padding: 30px;\n");
      out.write("              \n");
      out.write("              display: inline-block; *display: inline; zoom: 1; vertical-align: top; font-size: 20px;\n");
      out.write("     }\n");
      out.write("     .left{\n");
      out.write("              width: 500px;\n");
      out.write("              float: left;\n");
      out.write("              margin: 30px;\n");
      out.write("              text-color: orange;\n");
      out.write("              padding: 30px;\n");
      out.write("              display: inline-block; *display: inline; zoom: 1; vertical-align: top; font-size: 20px;\n");
      out.write("     }\n");
      out.write("     input[type=\"button\"], input[type=\"reset\"], input[type=\"submit\"] {\n");
      out.write("        font-size:15px;\n");
      out.write("        font-weight:normal;\n");
      out.write("        padding:6px 24px;\n");
      out.write("        text-decoration:none;\n");
      out.write("}\n");
      out.write(".btn {\n");
      out.write("\t background: #4CAF50;\n");
      out.write("  \t display: inline-block;\n");
      out.write("  \t border-radius: 4px;\n");
      out.write("\t border-color: #4CAF50;\n");
      out.write(" \t box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2), 0 6px 20px 0 rgba(0,0,0,0.19);\n");
      out.write(" \t font-family: Arial, sans-serif;\n");
      out.write("  \t line-height: 2.5em;\n");
      out.write("  \t padding: 0 1em;\n");
      out.write("\t font-size: 20px;\n");
      out.write(" \t text-decoration: none;\n");
      out.write("}\n");
      out.write("     .btn:hover {\n");
      out.write("         background: #01c60b; /* Green */\n");
      out.write("         color: white;\n");
      out.write("\t box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2), 0 6px 20px 0 rgba(0,0,0,0.19);\n");
      out.write("}\n");
      out.write("body {\n");
      out.write("\tmargin: 0;\n");
      out.write("\tbackground: white;\n");
      out.write("\tfont-family: 'Work Sans', sans-serif;\n");
      out.write("\tfont-weight: 800;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("\twidth: 95%;\n");
      out.write("\tmargin: 0 auto;\n");
      out.write("\tcolor: #f9f9ef;\n");
      out.write("}\n");
      out.write("\n");
      out.write("header {\n");
      out.write("  background: #195fc6;\n");
      out.write("}\n");
      out.write("\n");
      out.write("header::after {\n");
      out.write("  content: '';\n");
      out.write("  display: table;\n");
      out.write("  clear: both;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".logo {\n");
      out.write("  float: left;\n");
      out.write("  padding: 10px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("nav {\n");
      out.write("  float: right;\n");
      out.write("}\n");
      out.write("\n");
      out.write("nav ul {\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  list-style: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("nav li {\n");
      out.write("  display: inline-block;\n");
      out.write("  margin-left: 70px;\n");
      out.write("  padding-top: 10px;\n");
      out.write("  font-size: 35px;\n");
      out.write("  position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write("nav a {\n");
      out.write("  color: #f9f9ef;\n");
      out.write("  text-decoration: none;\n");
      out.write("  text-transform: uppercase;\n");
      out.write("  font-size: 14px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("nav a:hover {\n");
      out.write("  color: #000;\n");
      out.write("}\n");
      out.write("\n");
      out.write("nav a::before {\n");
      out.write("  content: '';\n");
      out.write("  display: block;\n");
      out.write("  height: 5px;\n");
      out.write("  background-color: #444;\n");
      out.write("\n");
      out.write("  position: absolute;\n");
      out.write("  top: 0;\n");
      out.write("  width: 0%;\n");
      out.write("\n");
      out.write("  transition: all ease-in-out 250ms;\n");
      out.write("}\n");
      out.write("\n");
      out.write("nav a:hover::before {\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("img{\n");
      out.write("\tmargin: 0;\n");
      out.write("\tpadding: 0;\n");
      out.write("}\n");
      out.write("h1{\n");
      out.write("\tmargin: 0 10px;\n");
      out.write("        padding: 0;\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("select{\n");
      out.write("        font-size:15px;\n");
      out.write("        font-weight:normal;\n");
      out.write("        padding:4px 24px;\n");
      out.write("        text-decoration:none;\n");
      out.write("        margin-left: 100px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("    \n");
      out.write(" </style>\n");
      out.write(" \n");
      out.write(" <script>\n");
      out.write("     \n");
      out.write("     function validate_form()\n");
      out.write("                {\n");
      out.write("                var regex=/^[0-9]+$/;\n");
      out.write("              \n");
      out.write("                var cse=document.R6reg.case_no.value;\n");
      out.write("                var khasra=document.R6reg.khasra_no.value;\n");
      out.write("                var khata=document.R6reg.khata_number.value;\n");
      out.write("                var hissa=document.R6reg.hissa_area.value;\n");
      out.write("                var seq=document.R6reg.seq_no.value;\n");
      out.write("                \n");
      out.write("                var dname=document.R6reg.deleted_name.value;\n");
      out.write("                var ifname=document.R6reg.insert_fname.value;\n");
      out.write("                var area=document.R6reg.area.value;\n");
      out.write("                var land_rev=document.R6reg.land_rev_pay.value;\n");
      out.write("                var iname=document.R6reg.insert_name.value;\n");
      out.write("                \n");
      out.write("                var amoount=document.R6reg.amount.value;\n");
      out.write("                var cby=document.R6reg.created_by.value;\n");
      out.write("                var dserial=document.R6reg.device_serial_no.value;\n");
      out.write("                var tt=document.R6reg.transfer_type.value;\n");
      out.write("            if(cse==\"\"|| khasra==\"\"|| khata==\"\"|| hissa==\"\"|| seq==\"\"\n");
      out.write("                    || dname==\"\"|| ifname==\"\"|| area==\"\"|| land_rev==\"\"\n");
      out.write("                    || iname==\"\"|| cby==\"\"|| dserial==\"\")\n");
      out.write("                    {\n");
      out.write("                    alert('Fill in the required fields');\n");
      out.write("                    return false;\n");
      out.write("                    }\n");
      out.write("                 else if (regex.test(area)==false)\n");
      out.write("                {\n");
      out.write("                    alert('area can only be a number');\n");
      out.write("                    return false;\n");
      out.write("                } else if(transfer_type==\"0\"||transfer_type==null)\n");
      out.write("                {\n");
      out.write("                    alert('please select an option for transfer type');\n");
      out.write("                    return false;\n");
      out.write("                } else return true;\n");
      out.write("            \n");
      out.write("            }\n");
      out.write("            </script>\n");
      out.write(" </head>\n");
      out.write("    <body>\n");
      out.write("        <img src=\"upgovlogo.png\" alt=\"logo\" class=\"logo\" height=\"52\" width=\"52\">\n");
      out.write("<header>\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <h1 class=\"logo\"><b class=\"logo1\"><font size=\"5px\">  राजस्व परिषद, उत्तर प्रदेश </font></b></h1>\n");
      out.write("\n");
      out.write("      <nav>\n");
      out.write("        <ul>\n");
      out.write("         <li><a href=\"welcome_page.jsp\"><font size=\"4px\"><b>मुख पृष्ठ</b></a></li>\n");
      out.write("        </ul>\n");
      out.write("      </nav>\n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("</header>\n");
      out.write("        <p style=\"text-indent: 16em;\"><font face=\"arial\" size=\"7\"><center><font color=\"white\"></font><b>आकार पत्र र6-रजिस्टर </b></font></center>\n");
      out.write("    <form name=\"R6reg\" action=\"insert_data\" onsubmit=\"return validate_form()\" >\n");
      out.write("            <p> <center> <h2> नामान्तरण  पंजी ( दाखिल - ख़ारिज ) का रजिस्टर </h2> </center> </p>\n");
      out.write("        \n");
      out.write("              <table border=\"0\" width=\"1000\" cellspacing=\"1\" cellpadding=\"1\">\n");
      out.write("                <thead>\n");
      out.write("            <tr>\n");
      out.write("                <th></th>\n");
      out.write("                <th></th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        \n");
      out.write("         <div class=\"form\">  \n");
      out.write("            <div class= \"left\"> \n");
      out.write("        \n");
      out.write("            <label for=\"vname\">गाँव का नाम </label>\n");
      out.write("            <select name=\"vname\" id=\"vname\">\n");
      out.write("             ");

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

                                
      out.write("<option value=\"0\">----select----</option>\n");
      out.write("                                ");
while (rs.next()) {
      out.write("\n");
      out.write("                                <option value=\"");
      out.print( rs.getString("vname"));
      out.write("\" >");
      out.print( rs.getString("vname"));
      out.write("</option>\n");
      out.write("                                ");
 } 
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                            ");
  } catch (Exception e) {
                                    out.println("Try again");
                                }
                            
      out.write("\n");
      out.write("           \n");
      out.write("                            <br><br>                \n");
      out.write("                            \n");
      out.write("            <label for=\"case_no\"> मुकदमा संख्या </label>\n");
      out.write("            <input type=\"text\" id = \"case_no\" name=\"case_no\" value=\"\" size=\"20\" /><br><br>\n");
      out.write("\n");
      out.write("            <label for=\"khasra_no\"> खसरा संख्या </label>\n");
      out.write("            <input type=\"text\" id=\"khasra_no\" name=\"khasra_no\" value=\"\" size=\"20\" /><br><br>\n");
      out.write("          \n");
      out.write("            <label for=\"khata_number\"> खाता संख्या </label>\n");
      out.write("            <input type=\"text\" id=\"khata_number\" name=\"khata_number\" value=\"\" size=\"20\" /> <br><br>\n");
      out.write("            \n");
      out.write("            <label for=\"hissa_area\">हिस्से का क्षेत्रफल </label>\n");
      out.write("            <input type=\"text\" id=\"hissa_area\"  name=\"hissa_area\" value=\"\" size=\"20\" /><br><br>\n");
      out.write("            \n");
      out.write("            <label for=\"seq_no\"> सीक्वेंस नंबर </label>\n");
      out.write("            <input type=\"text\" id=\"seq_no\" name=\"seq_no\" value=\"\" size=\"20\" /><br><br>\n");
      out.write("            \n");
      out.write("            <label for=\"deleted_name\"> भूतपूर्व मिल्क/कों का नाम </label>\n");
      out.write("            <input type=\"text\" id=\"deleted_name\" name=\"deleted_name\" value=\"\" size=\"20\" /><br><br>\n");
      out.write("\n");
      out.write("            <label for=\"deleted_address\"> भूतपूर्व मालिक का पता </label>\n");
      out.write("            <input type=\"text\" id=\"deleted_address\" name=\"deleted_address\" value=\"\" size=\"20\" /><br><br>\n");
      out.write("\n");
      out.write("            <label for=\"insert_fname\"> नए मालिक के पिता का नाम </label>\n");
      out.write("            <input type=\"text\" id=\"insert_fname\" name=\"insert_fname\" value=\"\" size=20\" />\n");
      out.write("            <br><br>\n");
      out.write("            <label for=\"challan_no\"> चालान संख्या</label>\n");
      out.write("            <input type=\"text\" id=\"challan_no\" name=\"challan_no\" value=\"\" size=\"20\" /><br><br>\n");
      out.write("\n");
      out.write("            <label for=\"created_on\"> बनाने की तिथि </label>\n");
      out.write("            <input type=\"date\" id=\"created_on\" name=\"created_on\" value=\"\" size=\"20\" /><br><br>\n");
      out.write("\n");
      out.write("            <label for=\"modified_by\"> संशोधित करने वाले का नाम </label>\n");
      out.write("            <input type=\"text\" id=\"modified_by\" name=\"modified_by\" value=\"\" size=\"20\" /><br><br>\n");
      out.write("            <label for=\"transfer_type\"> स्थानांतरण प्रकार</b>\n");
      out.write("            <select name=\"transfer_type\" id=\"transfer_type\">\n");
      out.write("                <option value=\"0\">----select----</option>\n");
      out.write("                <option value=\"मृत्यु\"> मृत्यु </option>\n");
      out.write("                <option value=\"बिक्री\">बिक्री</option>\n");
      out.write("                <option value=\"अन्य\">अन्य</option>\n");
      out.write("                  </select><br>\n");
      out.write("\n");
      out.write("            <p> <label for=\"remark\"> टिप्पनी </label>\n");
      out.write("            <input type=\"text\" id=\"remark\" name=\"remark\" value=\"\" size=\"100\" /><br><br>\n");
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("           \n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("            <div class= \"right\">\n");
      out.write("                \n");
      out.write("            <label for=\"order_date\"> आदेश दिनांक </label>\n");
      out.write("            <input type=\"date\" id=\"order_date\" name=\"order_date\" value=\"\" size=\"20\" /><br><br>\n");
      out.write("\n");
      out.write("            <label for=\"area\"> क्षेत्रफल </label>\n");
      out.write("            <input type=\"text\" id=\"area\" name=\"area\" value=\"\" size=\"20\" /><br><br>\n");
      out.write("\n");
      out.write("            <label for=\"land_rev_pay\"> भू -राजस्व लगान  </label>\n");
      out.write("            <input type=\"text\" id=\"land_rev_pay\" name=\"land_rev_pay\" value=\"\" size=\"20\" /><br><br>\n");
      out.write("\n");
      out.write("            <label for=\"deleted_fname\">भूतपूर्व मालिक के पिता का नाम </label>\n");
      out.write("            <input type=\"text\" id=\"deleted_fname\" name=\"deleted_fname\" value=\"\" size=\"20\" /><br><br>\n");
      out.write("\n");
      out.write("            <label for=\"insert_name\"> नए मालिक का नाम </label>\n");
      out.write("            <input type=\"text\" id=\"insert_name\" name=\"insert_name\" value=\"\" size=\"20\" />\n");
      out.write("<br><br>\n");
      out.write("            <label for=\"insert_address\"> नए मालिक का पता </label>\n");
      out.write("            <input type=\"text\" id=\"insert_address\" name=\"insert_address\" value=\"\" size=\"20\" /><br><br>\n");
      out.write("\n");
      out.write("            <label for=\"amount\">रकम </label>\n");
      out.write("            <input type=\"text\" id=\"amount\" name=\"amount\" value=\"\" size=\"20\" />\n");
      out.write("<br><br>\n");
      out.write("            <label for=\"decision_date\"> फैसले की तिथि</label>\n");
      out.write("            <input type=\"date\" id=\"decision_date\" name=\"decision_date\" value=\"\" size=\"20\" /><br><br>\n");
      out.write("\n");
      out.write("            <label for=\"remark\"> बनाने वाले का नाम </label>\n");
      out.write("            <input type=\"text\" id=\"created_by\" name=\"created_by\" value=\"\" size=\"20\" /><br><br>\n");
      out.write("\n");
      out.write("            <label for=\"modified_no\"> संशोधित करने की तिथि  </label>\n");
      out.write("            <input type=\"date\" id=\"modified_on\" name=\"modified_on\" value=\"\" size=\"20\" /><br><br>\n");
      out.write("           \n");
      out.write("\n");
      out.write("            <label for=\"device_serial_no\"> डिवाइस सीरियल नंबर </label>\n");
      out.write("            <input type=\"text\" id=\"device_serial_no\" name=\"device_serial_no\" value=\"\" size=\"20\" /><br><br>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("           \n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <input type=\"submit\" value=\"आगे बढ़े\" name=\"hello\" class=\"btn\"/>\n");
      out.write("          </div>\n");
      out.write("                        \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
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
