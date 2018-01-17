package nuc.sw.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import nuc.sw.serviceImpl.UserServiceImpl;
import nuc.sw.vo.User;

public class UpdateAction extends ActionSupport implements ModelDriven<User>{
	User user=new User();
	UserServiceImpl usi=new UserServiceImpl();
	public String update(){
		int i=usi.UpdateUser(user);
		//System.out.println(i);
		if(i>0){
			return "updateOk";
		}else{
			return "input";
		}
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
