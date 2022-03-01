package karina.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AreaDao implements Dao<Integer, Area> {

	@Override
	public List<Area> getAll() {
		ArrayList<Area>		all;
		Connection			cnct;
		PreparedStatement	st;
		ResultSet			rs;
		
		all = new ArrayList<Area>();
		cnct = Database.getInstance().getCnct();
		try {
			st = cnct.prepareStatement("SELECT id, name, createdOn FROM area;");
			rs = st.executeQuery();
			while (rs.next()) {
				all.add(new Area(rs.getInt(1), rs.getString(2), rs.getDate(3).toLocalDate()));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return all;
	}

	@Override
	public void add(Area obj) {
		Connection			cnct;
		PreparedStatement	st;
		
		cnct = Database.getInstance().getCnct();
		try {
			st = cnct.prepareStatement("INSERT INTO area VALUES (?, ?, ?);");
			st.setInt(1, obj.getId());
			st.setString(2, obj.getName());
			st.setDate(3, java.sql.Date.valueOf(obj.getCreatedOn()));
			st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(Integer key) {
		Connection			cnct;
		PreparedStatement	st;
		
		cnct = Database.getInstance().getCnct();
		try {
			st = cnct.prepareStatement("DELETE FROM area WHERE id = ?;");
			st.setInt(1, key);
			st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(Area obj) {

		Connection			cnct;
		PreparedStatement	st;
		
		cnct = Database.getInstance().getCnct();
		try {
			st = cnct.prepareStatement("UPDATE area SET name=?, createdOn=? WHERE id = ?;");
			st.setString(1, obj.getName());
			st.setDate(2, java.sql.Date.valueOf(obj.getCreatedOn()));
			st.setInt(3, obj.getId());
			st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub		
	}

	@Override
	public Area findByPK(Integer key) {
		Connection			cnct;
		PreparedStatement	st;
		ResultSet			rs;
		
		cnct = Database.getInstance().getCnct();
		try {
			st = cnct.prepareStatement("SELECT id, name, createdOn FROM area WHERE id=?;");
			st.setInt(1, key);
			rs = st.executeQuery();
			while (rs.next()) {
				return new Area(rs.getInt(1), rs.getString(2), rs.getDate(3).toLocalDate());
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}
	
}
