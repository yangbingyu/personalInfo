package nuc.sw.serviceImpl;

import nuc.sw.DaoImpl.DateDaoImpl;
import nuc.sw.service.DateService;
import nuc.sw.vo.MyDate;

import java.util.ArrayList;
import java.util.List;

public class DateServiceImpl implements DateService {
	private DateDaoImpl ddi=new DateDaoImpl();
	@Override
	public List<MyDate> FindByUserName(String username) {
		// TODO Auto-generated method stub
		List<MyDate> dates=new ArrayList<MyDate>();
		dates=ddi.FindByUserName(username);
		return dates;
	}

	@Override
	public int InsertInfo(MyDate date) {
		// TODO Auto-generated method stub
		int i=ddi.InsertDate(date);
		return i;
	}

}
