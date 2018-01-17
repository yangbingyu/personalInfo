package nuc.sw.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import nuc.sw.serviceImpl.UserServiceImpl;
import nuc.sw.vo.User;

/**
 * Created by dell on 2017/11/19.
 */
public class RegisteAction extends ActionSupport implements ModelDriven<User> {
    private User user=new User();
    UserServiceImpl usi=new UserServiceImpl();

    @Override
    public User getModel() {
        return user;
    }
    public String registeMethod() {
        
        int i = usi.InsertInfo(user);
        if (i>-1) {
            return "registeOK";
        }
        return "error";
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
