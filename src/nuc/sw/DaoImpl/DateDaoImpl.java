package nuc.sw.DaoImpl;

import nuc.sw.Dao.DateDao;
import nuc.sw.DButil.DButil;
import nuc.sw.vo.MyDate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DateDaoImpl implements DateDao<MyDate> {
	private Connection conn=DButil.getConn();
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	@Override
	public List<MyDate> FindByUserName(String username) {
		// TODO Auto-generated method stub
		List<MyDate> dates=new ArrayList<MyDate>();
		String sql = "select * from date where username=?";
		
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, username);
			rs=ps.executeQuery();
			MyDate date=new MyDate();
			while(rs.next()){
				date.setUsername(rs.getString(2));
				date.setDate(rs.getString(3));
				date.setThing(rs.getString(4));
				dates.add(date);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(user);
		return dates;
	}

	@Override
	public int InsertDate(MyDate date) {
		// TODO Auto-generated method stub
		int rs=0;
		try {
			DButil conn=new DButil();
			Connection dbc=conn.getConn();
			String sql_insert = "insert into date(username,date,thing) values('"+date.getUsername()+"','"+date.getDate()+"','"+date.getThing()+"')";
			PreparedStatement pst=dbc.prepareStatement(sql_insert);
			rs=pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;   
	}
	

}
