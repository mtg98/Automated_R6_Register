package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.lang.*;
import java.sql.*;
import javax.servlet.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ActionContext;
import java.lang.System.*;
import static java.lang.System.out;
import org.apache.struts2.ServletActionContext;
import java.security.MessageDigest;
import javax.servlet.*;

public final class welcome_005fpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Page Title</title>\n");
      out.write("<style>\n");
      out.write("body\n");
      out.write("{\t\t\n");
      out.write("    background-image: url(\"css1.jpg\");\n");
      out.write("}\n");
      out.write(".container {\n");
      out.write("    background-image: url(\"css1.jpg\");\n");
      out.write("    text-align: center;\n");
      out.write("    color: black;\n");
      out.write("    font-family: Arial, Helvetica, sans-serif;\n");
      out.write("    padding: 50px;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("p{\n");
      out.write("\tcolor: #808080;\n");
      out.write("    margin: 10px;\n");
      out.write("}\n");
      out.write(".db {d\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: black;\n");
      out.write("    padding: 16px;\n");
      out.write("    font-size: 25px;\n");
      out.write("    border: none;\n");
      out.write("    width:160px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".dd {\n");
      out.write("    position: relative;\n");
      out.write("    display: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".dc {\n");
      out.write("    display: none;\n");
      out.write("    position: absolute;\n");
      out.write("    background-color: #91d88a;\n");
      out.write("    min-width: 160px;\n");
      out.write("    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("    z-index: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".dc a {\n");
      out.write("    color: black;\n");
      out.write("    padding: 12px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("\tmargin: 0;\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container1 {\n");
      out.write("\twidth: 95%;\n");
      out.write("\tmargin: 0 auto;\n");
      out.write("\tcolor: #91d88a;\n");
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
      out.write("  color: #8e3216;\n");
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
      out.write("img.container1{\n");
      out.write("\tmargin: 0;\n");
      out.write("\tpadding: 0;\n");
      out.write("}\n");
      out.write("h1{\n");
      out.write("\tmargin: 0 10px;\n");
      out.write("        padding: 0;\n");
      out.write("}\n");
      out.write("h1:hover{\n");
      out.write("    color: black;\n");
      out.write("}\n");
      out.write(".dc a:hover {background-color: #748d93;}\n");
      out.write(".dd:hover .dc {display: block;}\n");
      out.write(".dd:hover .db {background-color: #63cfed;}\n");
      out.write("\n");
      out.write(".output1{\n");
      out.write("    font-size: 45px;\n");
      out.write("    font-weight: bold;\n");
      out.write("    color: blue;\n");
      out.write("    font-family: \"Sans-serif\";\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".output2{\n");
      out.write("    font-size: 35px;\n");
      out.write("    font-weight: bold;\n");
      out.write("    color: blue;\n");
      out.write("    font-family: \"Sans-serif\";\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write(" </head>\n");
      out.write("        <body>\n");
      out.write("            \n");
      out.write("        <img src=\"upgovlogo.png\" alt=\"logo\" class=\"logo\" height=\"42\" width=\"42\">\n");
      out.write("<header>\n");
      out.write("    <div class=\"container1\">\n");
      out.write("      <h1 class=\"logo\"><b class=\"logo1\"><font size=\"6px\">  राजस्व परिषद, उत्तर प्रदेश </font></b></h1>\n");
      out.write("\n");
      out.write("      <nav>\n");
      out.write("        <ul>\n");
      out.write("         <li><a href=\"login_page.jsp\"><font size=\"4px\"><b>लॉगआउट</b></a></li>\n");
      out.write("        </ul>\n");
      out.write("      </nav>\n");
      out.write("    </div>\n");
      out.write("  </header>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"main-logo1 float-left\" style=\"font-size: 2em; margin-left: 10px;\">\n");
      out.write("                        \n");
      out.write("                            <div class=\"float-left\" style=\"padding: 10px 0px 0px 0px;\">\n");
      out.write("                                <img src=\"upgovlogo.png\" width=\"150\" height=\"150\" />\n");
      out.write("                            </div>\n");
      out.write("                     ");
 
                                                 
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
                            
      out.write("  </div>\n");
      out.write("     \n");
      out.write("                            \n");
      out.write("                            <br><br><br><br>\n");
      out.write("                            \n");
      out.write("                           <span class=\"output1\"> ");
      out.print( output1 );
      out.write(" </span>\n");
      out.write("              <br>\n");
      out.write("              <br>\n");
      out.write("              <span class=\"output2\"> ");
      out.print( output2 );
      out.write(" </span>\n");
      out.write("              <br>\n");
      out.write("              <br>\n");
      out.write("              <br>\n");
      out.write("      \n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("          <div class=\"dd\">\n");
      out.write("             <br><br> <button class=\"db\">मेन्यू</button>\n");
      out.write("                 <div class=\"dc\">\n");
      out.write("                     <a href=\"R6_Register.jsp\">र-6  रजिस्टर अध्यनन करे</a>\n");
      out.write("                 </div>\n");
      out.write("          </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
