package nuc.sw.serviceImpl;

import nuc.sw.DaoImpl.FriendsDaoImpl;
import nuc.sw.service.FriendService;
import nuc.sw.vo.Friends;

import java.util.ArrayList;
import java.util.List;

public class FriendServiceImpl implements FriendService {
	private FriendsDaoImpl fsi=new FriendsDaoImpl();
	@Override
	public List<Friends> FindByUserName(String username) {
		// TODO Auto-generated method stub
		List<Friends> friends=new ArrayList<Friends>();
		friends=fsi.FindByUserName(username);
		return friends;
	}

	@Override
	public int InsertInfo(Friends friend) {
		// TODO Auto-generated method stub
		int i=fsi.InsertFriends(friend);
		return i;
	}

}
