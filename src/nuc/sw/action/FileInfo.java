package nuc.sw.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import nuc.sw.serviceImpl.FileServiceImpl;
import nuc.sw.vo.MyFile;

import java.util.ArrayList;
import java.util.List;

public class FileInfo extends ActionSupport implements ModelDriven<MyFile> {
	MyFile file=new MyFile();
	List<MyFile> files=new ArrayList<MyFile>();
	FileServiceImpl fsi=new FileServiceImpl();
	@Override
	public MyFile getModel() {
		// TODO Auto-generated method stub
		return file;
	}
	public MyFile getFile() {
		return file;
	}
	public void setFile(MyFile file) {
		this.file = file;
	}
	public String FileInfo(){
		String username=(String)ActionContext.getContext().getSession().get("username");
		files=fsi.FindByUserName(username);
		//System.out.println(friends);
		ActionContext.getContext().put("list2", files);
		return "OK";
			
	}

}
