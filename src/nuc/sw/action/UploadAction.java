package nuc.sw.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import nuc.sw.serviceImpl.FileServiceImpl;
import nuc.sw.vo.MyFile;

import java.io.File;

public class UploadAction extends ActionSupport{
	private String username;
    private String title;
    private String filename;
    private String path;
    private File upload;
    private String uploadFileName;
    private String uploadContentType;
    //File upload=new File();
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	

	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public String Upload(){
		int rs=0;
        FileServiceImpl fileService = new FileServiceImpl();
        MyFile file=new MyFile();
        file.setTitle(title);
        file.setUploadContentType(uploadContentType);
        file.setFilename(fileService.Filename(upload, uploadFileName, path));
        file.setUsername(((String) ActionContext.getContext().getSession().get("username")));
        file.setPath(path);
        ActionContext.getContext().getSession().put("fullpath", file.getFullPath());
        System.out.println(file.getFullPath());
        ActionContext.getContext().getSession().put("list2", file);
        rs=fileService.InsertFile(file);
        if(rs>=0){
            //System.out.println(rs);
            return "uploadOk";
        }
        return "input";
    }

	
}
