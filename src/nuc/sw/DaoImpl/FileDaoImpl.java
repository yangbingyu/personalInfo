package nuc.sw.DaoImpl;

import nuc.sw.Dao.FileDao;
import nuc.sw.DButil.DButil;
import nuc.sw.vo.MyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FileDaoImpl implements FileDao {
	private Connection conn=DButil.getConn();
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	@Override
	public int InsertFile(MyFile file) {
		// TODO Auto-generated method stub
		int rs=0;
        try {
            String sql = "INSERT INTO files(username,f_title,f_filename,f_path,f_type) VALUES(?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, file.getUsername());
            ps.setString(2, file.getTitle());
            ps.setString(3, file.getFilename());
            ps.setString(4, file.getPath());
            ps.setString(5, file.getUploadContentType());
            rs=ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;

	}
	@Override
	public String Filename(File upload, String uploadFileName, String path) {
		// TODO Auto-generated method stub
		String newFileName = UUID.randomUUID().toString() + "_" + uploadFileName;
        try {
            FileInputStream fis = new FileInputStream(upload);
            FileOutputStream fos = new FileOutputStream(path + newFileName);
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
   // }
    return newFileName;

	}
	@Override
	public List<MyFile> FindByUserName(String username) {
		// TODO Auto-generated method stub
		List<MyFile> files=new ArrayList<MyFile>();
		String sql = "select * from files where username=?";
		
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, username);
			rs=ps.executeQuery();
			MyFile file=new MyFile();
			while(rs.next()){
				file.setId(rs.getInt(1));
				file.setUsername(rs.getString(2));
				file.setTitle(rs.getString(3));
				file.setFilename(rs.getString(4));
				file.setPath(rs.getString(5));
				file.setUploadContentType(rs.getString(6));
				files.add(file);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(user);
		return files;
	}

}
