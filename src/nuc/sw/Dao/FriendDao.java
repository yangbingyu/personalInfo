package nuc.sw.Dao;

import nuc.sw.vo.Friends;

import java.util.List;

public interface FriendDao<T> {
	public List<T> FindByUserName(String username);
	public int InsertFriends(Friends friend);
}
