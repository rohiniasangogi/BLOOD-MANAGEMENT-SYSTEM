package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import model.bloodModel;

public class MainsqlConnnection {

	public static bloodModel getConnection() throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		try {
			bloodModel blood = (bloodModel) DriverManager.getConnection("jdbc:mysql://localhost:3306/Blood_management_system","root","Rootpassword");
			if(blood!=null) {
				return blood;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}