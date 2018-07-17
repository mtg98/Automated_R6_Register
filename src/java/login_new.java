
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Srijan
 */
import com.opensymphony.xwork2.ActionContext;
import java.sql.*;
import java.io.*;
import com.opensymphony.xwork2.ActionSupport;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

public class login_new extends ActionSupport {

    Connection con = null;
    String uname;
    String passw;
    String username;
    String password;
    String next;
    String R6_Register;
    String pass_hash;
    PreparedStatement ps = null;
    ResultSet rs = null;

//    @OverrideR6_Regsiter
    public String execute() throws Exception {
        
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
        HttpServletResponse response = ServletActionContext.getResponse();
        HttpSession session = request.getSession();
        
        if ("लॉगिन".equals(next) ) {

        try {
            Class.forName("org.postgresql.Driver");
            //creating connection Using Postgres Change it to other
            con = DriverManager.getConnection("jdbc:postgresql://10.135.28.162:5432/up_lrc", "postgres", "postgres");
            ps = con.prepareStatement("SELECT username,password FROM up_user_master WHERE username=?");
            ps.setString(1, uname);
            rs = ps.executeQuery();
            while (rs.next()) {
                username = rs.getString("username");
                password = rs.getString("password");}
                pass_hash=(getMD5Hex(passw));
                if (uname.equals(username) && pass_hash.equals(password)) {
                    session.setAttribute("uname", uname);
                    con.close();
                    return "SUCCESS";
                    
                } else {

                    con.close();
                    return "ERROR";
                }
            } catch (Exception e) {
            }
            con.close();
            return "ERROR";
        } else {
            return "ERROR";
        }
    }
    public static String getMD5Hex(final String inputString) throws NoSuchAlgorithmException {

        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(inputString.getBytes());

        byte[] digest = md.digest();

        return convertByteToHex(digest);
    }

    private static String convertByteToHex(byte[] byteData) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < byteData.length; i++) {
            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }

        return sb.toString();
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

   

}


