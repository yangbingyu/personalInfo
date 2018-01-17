package nuc.sw.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import nuc.sw.serviceImpl.DateServiceImpl;
import nuc.sw.vo.MyDate;

public class InsertDateAction extends ActionSupport implements ModelDriven<MyDate> {
	MyDate date=new MyDate();
	DateServiceImpl dsi=new DateServiceImpl();
	@Override
	public MyDate getModel() {
		// TODO Auto-generated method stub
		return date;
	}
	public String InsertDate(){
		int i=dsi.InsertInfo(date);
		if(i>-1){
			return "InsertOk";
		}
		else{
			return "fail";
		}
	}
	public MyDate getDate() {
		return date;
	}
	public void setDate(MyDate date) {
		this.date = date;
	}
	

}
