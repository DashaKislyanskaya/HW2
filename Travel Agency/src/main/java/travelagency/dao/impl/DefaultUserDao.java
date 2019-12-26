package travelagency.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import travelagency.dao.UserDao;
import travelagency.dbutils.DbHelper;
import travelagency.models.TourData;
import travelagency.models.UserData;

public class DefaultUserDao implements UserDao {
	public static final String SELECT_USER = "SELECT * FROM user WHERE id_user=?";
	private static final String GET_TOURS_FOR_USER = "SELECT t.id_tour, t.name_tour, t.price_tour FROM tour t \r\n" + 
			"JOIN orders o ON t.id_tour = o.id_tour\r\n" + 
			"WHERE o.id_user = ?;";

	private static DefaultUserDao instance;
	private DbHelper dbHelper;

	private DefaultUserDao() {
		dbHelper = DbHelper.getInstance();
	}

	public synchronized static UserDao getInstance() {
		if (instance == null) {
			instance = new DefaultUserDao();
		}
		return instance;
	}

	@Override
	public UserData getUserById(int id) {
		try {
			UserData userData = null;
			try (Connection conn = dbHelper.getConnection();
					PreparedStatement statement = conn.prepareStatement(SELECT_USER)) {
				statement.setInt(1, id);
				try (ResultSet rs = statement.executeQuery()) {
					if (rs.next()) {
						userData = new UserData();
						userData.setId(rs.getInt("id_user"));
						userData.setFio(rs.getString("fio"));
					}
				}
			}

			return userData;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public List<TourData> getToursForUser(int userId) {
		List<TourData> tours = new ArrayList<TourData>();
		try (Connection conn = dbHelper.getConnection();
				PreparedStatement ps = conn.prepareStatement(GET_TOURS_FOR_USER)) {
			
			ps.setInt(1, userId);
			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				TourData tourData = new TourData();
				tourData.setIdTour(rs.getInt("id_tour"));
				tourData.setNameTour(rs.getString("name_tour"));
				tourData.setPriceTour(rs.getInt("price_tour"));
				tours.add(tourData);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return tours;
	}
}