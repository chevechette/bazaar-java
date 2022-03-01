package karina.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class test {
	public static void insertBoris(Connection cnct) throws SQLException {
		PreparedStatement st = cnct.prepareStatement("INSERT INTO emp VALUES (?,?,?,?,?,?,?,?);");
		
		st.setInt(1, 0413);
		st.setString(2, "BORIS");
		st.setString(3, "REPORTER");
		st.setNull(4, java.sql.Types.NULL); // NULL set
		st.setDate(5, java.sql.Date.valueOf(LocalDate.now()));
		st.setInt(6, 1500);
		st.setObject(7, null); // NULL set 
		st.setNull(8, java.sql.Types.NULL); // NULL set
		
		// empno | ename  | job       | mgr  | hiredate   | sal  | comm | deptno |
		st.executeUpdate();
	}
	
	public static void updateBoris(Connection cnct) throws SQLException {
		PreparedStatement st = cnct.prepareStatement("UPDATE emp SET sal = 1700 WHERE ename like ?;");
		
		st.setString(1, "BORIS");
		st.executeUpdate();
	}
	
	public static void selectEmp(Connection cnct) throws SQLException {
		PreparedStatement st = cnct.prepareStatement("SELECT * from emp;");
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			StringBuilder sb = new StringBuilder();
			
			sb.append("Line : ").append(rs.getInt("empno")).append(" : ");
			sb.append(rs.getString("ename")).append(" - ");
			sb.append(rs.getInt("sal")).append("; ");
			System.out.println(sb);
		}
		rs.close();
	}
	
	public static void selectEmpDAO(Connection cnct) throws SQLException {
		PreparedStatement st = cnct.prepareStatement("SELECT * from emp;");
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			Employee e = new Employee(rs.getInt(1), rs.getString(2),
								rs.getString(3), rs.getInt(4), rs.getDate(5).toLocalDate(),
								rs.getInt(6), rs.getInt(7), rs.getInt(8));
			System.out.println(e);
		}
		rs.close();
	}
	
	public static void oldmain(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cnct = DriverManager.getConnection("jdbc:mysql://localhost:3306/scott", "tolkien", "PASSWORD");
			System.out.println("CONNECTION SUCCESS");
			
			selectEmpDAO(cnct);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
	}
}
