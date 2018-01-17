package nuc.sw.action;

import com.opensymphony.xwork2.ActionContext;
import nuc.sw.serviceImpl.FriendServiceImpl;
import nuc.sw.vo.Friends;

import java.util.ArrayList;
import java.util.List;

public class FriendsInfoAction {
	Friends friend=new Friends();
	List<Friends> friends=new ArrayList<Friends>();
	FriendServiceImpl fsi=new FriendServiceImpl();
	//HttpServletRequest request;
	public String FriendsInfo(){
		String username=(String)ActionContext.getContext().getSession().get("username");
		friends=fsi.FindByUserName(username);
		//System.out.println(friends);
		ActionContext.getContext().getSession().put("list", friends);
		return "OK";
			
	}
}
