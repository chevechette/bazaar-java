package thomas.jdbc.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	
	private static ConnectionManager instance;
	private Connection conn;
	
	private ConnectionManager() {}
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.err.println("Erreur driver: " + e.getMessage());
		}
	}
	
	public static ConnectionManager getInstance() {
		if(instance == null) {
			instance = new ConnectionManager();
		}
		return instance;
	}
	
	public Connection getConnection() {
		if(conn == null) {
			try {
				conn=DriverManager.getConnection("jdbc:mysql://localhost:9001/car", "root", "root" );
			} catch (SQLException e) {
				System.err.println("Erreur de connexion: " + e.getMessage());
			}
		}
		return conn;
	}
	
	public void close() {
		try {
			conn.close();
		} catch (SQLException e) {
			System.err.println("Erreur de connexion: " + e.getMessage());
		}
		conn = null;
	}
	
}
