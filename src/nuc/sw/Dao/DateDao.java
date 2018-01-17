package nuc.sw.Dao;

import nuc.sw.vo.MyDate;

import java.util.List;

public interface DateDao<T> {
	public List<T> FindByUserName(String username);
	public int InsertDate(MyDate date);
}
