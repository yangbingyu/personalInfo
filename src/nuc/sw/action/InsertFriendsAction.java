package nuc.sw.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import nuc.sw.serviceImpl.FriendServiceImpl;
import nuc.sw.vo.Friends;

public class InsertFriendsAction extends ActionSupport implements ModelDriven<Friends> {
	Friends friend=new Friends();
	FriendServiceImpl fsi=new FriendServiceImpl();
	@Override
	public Friends getModel() {
		// TODO Auto-generated method stub
		return friend;
	}
	public Friends getFriend() {
		return friend;
	}
	public void setFriend(Friends friend) {
		this.friend = friend;
	}
	public String InsertFriend(){
		int i=fsi.InsertInfo(friend);
		if(i>-1){
			return "InsertOk";
		}
		else{
			return "fail";
		}
	}
	
}
