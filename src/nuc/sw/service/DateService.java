package nuc.sw.service;

import nuc.sw.vo.MyDate;

import java.util.List;


public interface DateService {
	public List<MyDate> FindByUserName(String username);
	public int InsertInfo(MyDate date);
}
