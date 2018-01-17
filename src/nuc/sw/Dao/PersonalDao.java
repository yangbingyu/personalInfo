package nuc.sw.Dao;

import nuc.sw.vo.User;

public interface PersonalDao<T> {
	public T FindByUserName(String username);
	public int InsertInfo(User user);
	public int UpdateUser(User user);
	public T login(String username,String password);
}
