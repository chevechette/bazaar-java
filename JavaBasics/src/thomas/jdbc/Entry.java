package thomas.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import thomas.jdbc.dao.CarDao;
import thomas.jdbc.model.Car;
import thomas.jdbc.utils.ConnectionManager;

public class Entry {

	public static void main(String[] args) {
		
		CarDao cdao = new CarDao();
		System.out.println( cdao.getAll());
		System.out.println( cdao.getAll());
		System.out.println( cdao.getAll());
		cdao.add(new Car("VOITURe", "COULEUR"));
		System.out.println( cdao.getAll());
		
		ConnectionManager.getInstance().close();
	}
	
	// SINGLETON ConnectionManager.
	// Remplacer dans les DAO la gestion des connexions par le singleton.

}
