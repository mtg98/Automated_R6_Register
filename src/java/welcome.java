/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrinalini
 */
import java.sql.*;
import com.opensymphony.xwork2.ActionSupport;

public class welcome extends ActionSupport {

    String R6_Register;

    public String execute() throws Exception {
        if ("र6-रजिस्टर अद्यतन करें".equals(R6_Register)) {
            return "SUCCESS";
        }
        return "SUCCESS";
    }

    public String getR6_Register() {
        return R6_Register;
    }

    public void setR6_Register(String R6_Register) {
        this.R6_Register = R6_Register;
    }

}
