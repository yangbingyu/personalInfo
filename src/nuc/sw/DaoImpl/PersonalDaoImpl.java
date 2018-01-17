package nuc.sw.DaoImpl;

import nuc.sw.Dao.PersonalDao;
import nuc.sw.DButil.DButil;
import nuc.sw.vo.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonalDaoImpl implements PersonalDao<User> {
	private Connection conn=DButil.getConn();
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	@Override
	public User FindByUserName(String username) {
		// TODO Auto-generated method stub
		String sql = "select * from user where u_username=?";
		User user=new User();
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, username);
			rs=ps.executeQuery();
			if(rs.next()){
				
				user.setUsername(rs.getString(2));
				user.setPassword(rs.getString(3));
				user.setName(rs.getString(4));
				user.setEmail(rs.getString(5));
				user.setTelphone(rs.getString(6));
				user.setTel(rs.getString(7));
				user.setAddress(rs.getString(8));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(user);
		return user;
	}

	@Override
	public int InsertInfo(User user) {
		// TODO Auto-generated method stub
		int rs=0;
		try {
			DButil conn=new DButil();
			Connection dbc=conn.getConn();
			String sql_insert = "insert into user(u_username,u_password,u_name,u_email,u_tel,u_telphone,u_address) values('"+user.getUsername()+"','"+user.getPassword()+"','"+user.getName()+"','"+user.getEmail()+"','"+user.getTel()+"','"+user.getTelphone()+"','"+user.getAddress()+"')";
			PreparedStatement pst=dbc.prepareStatement(sql_insert);
			rs=pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}

	@Override
	public int UpdateUser(User user) {
		int rs=0;
		// TODO Auto-generated method stub
		String sql_update = "update user set u_password=?,u_email=?,u_telphone=?,u_tel=?,u_address=? where u_username=? ";
        try {
			ps=conn.prepareStatement(sql_update);
			ps.setString(1, user.getPassword());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getTelphone());
			ps.setString(4, user.getTel());
			ps.setString(5, user.getAddress());
			ps.setString(6, user.getUsername());
			rs = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(rs);
		return rs;
  
	}

	@Override
	public User login(String username, String password) {
		User user = null;
		String sql = "SELECT * FROM user WHERE u_username=? AND u_password=?;";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1,username);//获取第一个？的值
			ps.setString(2,password);//获取第二个？的值
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				user = new User();//实例化
				user.setUsername(rs.getString(1));//输出信息
				user.setPassword(rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

}


