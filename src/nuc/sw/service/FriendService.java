package nuc.sw.service;

import nuc.sw.vo.Friends;

import java.util.List;

public interface FriendService {
	public List<Friends> FindByUserName(String username);
	public int InsertInfo(Friends friends);
}
