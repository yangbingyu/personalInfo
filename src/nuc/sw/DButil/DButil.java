package nuc.sw.DButil;

import java.sql.*;

/**
 * Created by dell on 2017/11/21.
 */
public class DButil {
    private static final String DBDRIVER="org.gjt.mm.mysql.Driver";
    private static final String DBURL="jdbc:mysql://localhost:3306/info";
    private static final String DBUSER="root";
    private static final String DBPASS="shixinkong.123";
    private static Connection conn = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;
    public static Connection getConn(){
        try {
            Class.forName(DBDRIVER);
            conn= DriverManager.getConnection(DBURL, DBUSER, DBPASS);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return conn;
    }
    public void close(){
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(stmt!=null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}


