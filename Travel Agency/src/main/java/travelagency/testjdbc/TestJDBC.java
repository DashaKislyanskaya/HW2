package travelagency.testjdbc;


import java.sql.SQLException;
import java.util.List;

import travelagency.dao.UserDao;
import travelagency.dao.impl.DefaultUserDao;
import travelagency.models.TourData;
import travelagency.models.UserData;

public class TestJDBC {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
	UserDao userDao = DefaultUserDao.getInstance();
	UserData user = userDao.getUserById(1);
	System.out.println(user);
	
	
	List<TourData> toursForUser = userDao.getToursForUser(1);
	System.out.println(toursForUser);
	}
}