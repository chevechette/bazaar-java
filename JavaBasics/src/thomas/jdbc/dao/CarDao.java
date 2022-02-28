package thomas.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import thomas.jdbc.model.Car;
import thomas.jdbc.utils.ConnectionManager;

public class CarDao {
	
	public List<Car> getAll(){
		List<Car> cars = new ArrayList<>();
		ResultSet rs = null;
		Connection conn = ConnectionManager.getInstance().getConnection();
		try {
			Statement st = conn.createStatement();
			rs = st.executeQuery("SELECT * FROM car");
			
			while(rs.next()) {
				cars.add(new Car(rs.getInt(1), rs.getString(2), rs.getString(3)));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return cars;
		
	}
	public void add(Car c){
		Connection conn = ConnectionManager.getInstance().getConnection();
		try {
			PreparedStatement st = conn.prepareStatement("INSERT INTO CAR (model, color) VALUES(?, ?)");
			st.setString(1, c.getModel());
			st.setString(2, c.getColor());
			
			st.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
