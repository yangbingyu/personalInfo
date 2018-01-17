package nuc.sw.service;

import nuc.sw.vo.User;

public interface UserService {
	public User FindByUserName(String username);
	public int InsertInfo(User user);
	public int UpdateUser(User user);
}
