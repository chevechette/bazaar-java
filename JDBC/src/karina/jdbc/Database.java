package karina.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	private static Database		instance = null;
	private Connection			cnct;
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.err.println("Driver err : " + e.getMessage());
		}
	}
	
	static public Database getInstance() {
		if (Database.instance == null)
			Database.instance = new Database();
		return Database.instance;
	}
	
	private Database() {
		try {
			this.cnct = DriverManager.getConnection("jdbc:mysql://localhost:3306/sandbox", "tolkien", "PASSWORD");
			System.out.println("CONNECTION SUCCESS");

		} catch (SQLException e) {
			System.err.println("SQL err : " + e.getMessage());
		}
	}
	
	public static void setInstance(Database instance) {
		Database.instance = instance;
	}

	public Connection getCnct() {
		return cnct;
	}

	public void setCnct(Connection cnct) {
		this.cnct = cnct;
	}
	
	
	
	
	
}
