package nuc.sw.serviceImpl;

import nuc.sw.DaoImpl.PersonalDaoImpl;
import nuc.sw.service.UserService;
import nuc.sw.vo.User;

public class UserServiceImpl implements UserService {
	private PersonalDaoImpl pdi=new PersonalDaoImpl();
	
	@Override
	public User FindByUserName(String username) {
		// TODO Auto-generated method stub
		User user=pdi.FindByUserName(username);
		//System.out.println(user);
		//System.out.println("111");
		return user;
	}

	@Override
	public int InsertInfo(User user) {
		// TODO Auto-generated method stub
		return pdi.InsertInfo(user);
	}

	@Override
	public int UpdateUser(User user) {
		// TODO Auto-generated method stub
		return pdi.UpdateUser(user);
	}

}
