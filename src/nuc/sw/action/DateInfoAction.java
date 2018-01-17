package nuc.sw.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import nuc.sw.serviceImpl.DateServiceImpl;
import nuc.sw.vo.MyDate;

import java.util.ArrayList;
import java.util.List;

public class DateInfoAction extends ActionSupport implements ModelDriven<MyDate> {
	MyDate date=new MyDate();
	List<MyDate> dates=new ArrayList<MyDate>();
	DateServiceImpl dsi=new DateServiceImpl();
	//HttpServletRequest request;
	public String DateInfo(){
		String username=(String)ActionContext.getContext().getSession().get("username");
		dates=dsi.FindByUserName(username);
		//System.out.println(friends);
		ActionContext.getContext().put("list1", dates);
		return "OK";
			
	}
	@Override
	public MyDate getModel() {
		// TODO Auto-generated method stub
		return date;
	}
	public MyDate getDate() {
		return date;
	}
	public void setDate(MyDate date) {
		this.date = date;
	}
	
}
