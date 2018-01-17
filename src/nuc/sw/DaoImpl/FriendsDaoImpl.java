package nuc.sw.DaoImpl;

import nuc.sw.Dao.FriendDao;
import nuc.sw.DButil.DButil;
import nuc.sw.vo.Friends;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FriendsDaoImpl implements FriendDao {
	private Connection conn=DButil.getConn();
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	@Override
	public List<Friends> FindByUserName(String username) {
		// TODO Auto-generated method stub
		List<Friends> friends=new ArrayList<Friends>();
		String sql = "select * from friends where username=?";
		
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, username);
			rs=ps.executeQuery();
			Friends friend=new Friends();
			while(rs.next()){
				friend.setUsername(rs.getString(2));
				friend.setName(rs.getString(3));
				friend.setPhone(rs.getString(4));
				friend.setEmail(rs.getString(5));
				friends.add(friend);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(user);
		return friends;
	}

	@Override
	public int InsertFriends(Friends friends) {
		// TODO Auto-generated method stub
		int rs=0;
		try {
			DButil conn=new DButil();
			Connection dbc=conn.getConn();
			String sql_insert = "insert into friends(username,fr_name,fr_phone,fr_email) values('"+friends.getUsername()+"','"+friends.getName()+"','"+friends.getPhone()+"','"+friends.getEmail()+"')";
			PreparedStatement pst=dbc.prepareStatement(sql_insert);
			rs=pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;   
	}

}
