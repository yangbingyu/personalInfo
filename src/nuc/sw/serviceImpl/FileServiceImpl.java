package nuc.sw.serviceImpl;

import nuc.sw.DaoImpl.FileDaoImpl;
import nuc.sw.service.FileService;
import nuc.sw.vo.MyFile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileServiceImpl implements FileService {
	FileDaoImpl fdi=new FileDaoImpl();
	
	@Override
	public int InsertFile(MyFile file) {
		// TODO Auto-generated method stub
		int i=fdi.InsertFile(file);
		return i;
	}

	@Override
	public String Filename(File upload, String uploadFileName, String path) {
		// TODO Auto-generated method stub
		String x=fdi.Filename(upload, uploadFileName, path);
		return x;
	}

	@Override
	public List<MyFile> FindByUserName(String username) {
		// TODO Auto-generated method stub
		List<MyFile> files=new ArrayList<MyFile>();
		files=fdi.FindByUserName(username);
		return files;
	}

}
