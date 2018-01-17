package nuc.sw.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import nuc.sw.serviceImpl.UserServiceImpl;
import nuc.sw.vo.User;

public class FindByUsernameAction extends ActionSupport implements ModelDriven<User>{
	User user=new User();
	UserServiceImpl usi=new UserServiceImpl();
	//HttpServletRequest request;
	public String find(){
		String username=(String)ActionContext.getContext().getSession().get("username");
		user=usi.FindByUserName(username);
		//System.out.println(user);
		ActionContext.getContext().getSession().put("password", user.getPassword());
		ActionContext.getContext().getSession().put("name", user.getName());
		ActionContext.getContext().getSession().put("email", user.getEmail());
		ActionContext.getContext().getSession().put("telphone", user.getTelphone());
		ActionContext.getContext().getSession().put("tel", user.getTel());
		ActionContext.getContext().getSession().put("address", user.getAddress());
		return "OK";
			
	}
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
