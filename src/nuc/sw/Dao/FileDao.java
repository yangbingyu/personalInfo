package nuc.sw.Dao;

import nuc.sw.vo.MyFile;

import java.io.File;
import java.util.List;

public interface FileDao {
	public int InsertFile(MyFile file);
	public String Filename(File upload, String uploadFileName, String path);
	public List<MyFile> FindByUserName(String username);
}
