package chickenstore.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import chickenstore.model.vo.ChickenStore;



public class ChickentStroeDAO {
	private final String URL ="jdbc:oracle:thin:@localhost:1521:XE";
	private final String USER = "STORE";
	private final String PASSWORD = "STORE";
	private final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	
	
	public List<ChickenStore> printAllMenu() {
		String sql = "SELECT * FROM CHICKEN_STORE";
		ChickenStore store = null;
		List<ChickenStore> cList = null;
		
		try {
			Class.forName(DRIVER_NAME);
			Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
			Statement pstmt = conn.createStatement();
			ResultSet rset = pstmt.executeQuery(sql);
			cList = new ArrayList<ChickenStore>();
			while(rset.next()) {
				store = new ChickenStore();
				store.setChickenName(rset.getString("CHICKEN_NAME"));
				store.setChickenPrice(rset.getInt("CHICKEN_PRICE"));
				store.setChickenCountryOrigin(rset.getNString("CHICKEN_COUNTRY_ORIGIN"));
				cList.add(store);
			}
			rset.close();
			pstmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cList;
	}


	public void selectMenu(ChickenStore store) {
		String sql = "UPDATE";
		int result = 0 ;
		try {
			Class.forName(DRIVER_NAME);
			Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
			Statement stmt= conn.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
