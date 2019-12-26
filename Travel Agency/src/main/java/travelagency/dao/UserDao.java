package travelagency.dao;

import java.util.List;

import travelagency.models.TourData;
import travelagency.models.UserData;

public interface UserDao {
	UserData getUserById(int id);
	List<TourData> getToursForUser(int userId);
}
