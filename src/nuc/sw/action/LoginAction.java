package nuc.sw.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import nuc.sw.DaoImpl.PersonalDaoImpl;
import nuc.sw.vo.User;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.regex.Pattern;

/**
 * Created by dell on 2017/11/19.
 */
public class LoginAction extends ActionSupport {
    private String username;
    private String password;
    private String code;

    PersonalDaoImpl pdi=new PersonalDaoImpl();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    //定义常量
    private final String PASSWORD = "\\w{5,16}";
    private final String USERNAME = "[a-zA-Z]{6,15}";

    public void validateLoginMethod() {
        if (password == null || "".equals(password.trim())) {
            this.addFieldError("password", this.getText("pass.required"));
        } else {
            if (!Pattern.matches(PASSWORD, password)) {
                this.addFieldError("password1", this.getText("passerror"));
            }
        }
        if (username == null || "".equals(username.trim())) {
            this.addFieldError("username", this.getText("user.required"));
        } else {
            if (!Pattern.matches(USERNAME, username.trim())) {
                this.addFieldError("username", this.getText("usererror"));
            }
        }
        HttpSession session = ServletActionContext.getRequest().getSession();
        String code1 = (String) session.getAttribute("randomCode");
        if (code == null || code.trim().equals("")) {
            this.addFieldError("code", this.getText("code.required"));
        } else {
            if (!code.equals(code1)) {
                this.addFieldError("code", this.getText("codeerror"));
            }
        }

    }

    public String loginMethod() {
        ActionContext.getContext().getSession().put("username", username);
        //User user = (User) ActionContext.getContext().getSession().get("user");
        User user = new User();
        user=pdi.login(username,password);
        if(user!=null) {
            return "loginOK";
        }else{
            return "input";
        }
    }
}

