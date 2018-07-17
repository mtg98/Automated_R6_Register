/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author mrinalini
 */
/*public class Logout extends ActionSupport {

    public String execute() throws Exception {
      //  HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
      //  HttpServletResponse response = ServletActionContext.getResponse();
      //  HttpSession session = request.getSession();

        try {
            if (session != null) {
                session.invalidate();
            }
            return "SUCCESS";
        } catch (Exception e) {
            return "ERROR";
        }

    }

}
 */