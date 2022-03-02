package data;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;


import model.bloodModel;
import utility.MainsqlConnnection;

public class bloodadmin<bloodModel1> extends GetConnection {
	bloodModel dbcon = null;
	@Override
	public 	bloodModel getDbConnection() throws ClassNotFoundException {
		bloodModel dbcon = MainsqlConnnection.getConnection();
		return dbcon;
	}
	////ADD////
	public void storeDonorRecordsInDb(ArrayList<bloodModel> donorList) throws ClassNotFoundException {
		dbcon = getDbConnection();
		String sql = "add into Donor(id,name,email,bloodgroup,phoneno,add) values (?,?,?,?,?,?)";
		try {
			PreparedStatement ps = dbcon.prepareStatement(sql);
			for(bloodModel bm:donorList) {
				ps.setInt(1, bm.getdonorId());
				ps.setString(2, bm.getdonorName());
				ps.setString(3, bm.getdonorEmail());
				ps.setString(4, bm.getdonorbloodGroup());
				ps.setString(5,bm.getdonorPhoneno());
				ps.setString(6, bm.getdonorAdd());
				int result = ps.executeUpdate();
				if(result  == 1) {
					System.out.println("Donor record added sussesfully");
				}
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	////VIEW////
	public void viewDonorTableRecords() throws ClassNotFoundException {
		dbcon = getDbConnection();
		String sql = "Select *from Donor";
		try {
			Statement stmt = dbcon.createStatement();
			ResultSet rs = ((java.sql.Statement) stmt).executeQuery(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	////UPDATE////
	public void UpdateAdminModel(int updateOption, int donorId, String newDonorName) throws ClassNotFoundException {
		dbcon = getDbConnection();
		String sql = null;
		if(updateOption == 1) {
			sql = "update donor set donorname = ? where id = ?";
		}
		else if(updateOption == 2) {
			sql = "update donor set donoremail = ? where id = ?";
		}
		else if(updateOption == 3) {
			sql = "update donor set donorbloodGroup= ? where id = ?";
		}
		else if(updateOption == 4) {
			sql = "update donor set donorPhoneno= ? where id = ?";
		}
		else if(updateOption == 5) {
			sql = "update donor set donorAdd = ? where id = ?";
		}
		
		try {
			PreparedStatement ps = dbcon.prepareStatement(sql);
			ps.setString(1, newDonorName);
			ps.setInt(2, donorId);
			int result = ps.executeUpdate();
			if(result==1) {
      		  System.out.println("Record Upadted");
      	  }
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
///////////Delete/////////

	public void DeletebloodModel(int deletedonorId) throws ClassNotFoundException {
		dbcon = getDbConnection();
	String DELETE = "DELETE FROM blood WHERE donorId = "+ deletedonorId;
	
		try {
			Statement stmt =dbcon.createStatement();
			int RowAffected = stmt.executeUpdate(DELETE);
			System.out.println("Rows Affected :"+RowAffected);
			System.out.println("Record deleted Sucessfully");

		}catch(SQLException e) {
			System.out.println("\n Failed to delete the Record");
          e.printStackTrace();
		}
	}
	public void updateDonorRecords(int updateOption, int donorId, String newAdd) {
		// TODO Auto-generated method stub
		
	}
	

}
	
	
	
	
//	public void updateDonorRecords(int donorId, String newDonorBloodGroup) throws ClassNotFoundException {
//		dbcon = getDbConnection();
//		String sql = "update donor set exprerience = ? where id = ?";
//		
//		try {
//			PreparedStatement ps = dbcon.prepareStatement(sql);
//			ps.setString(1, newDonorBloodGroup);
//			ps.setInt(2, donorId);
//			ps.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	
//	public void updateDonorRecords(int donorId, double newDonorAmt) throws ClassNotFoundException {
//		dbcon = getDbConnection();
//		String sql = "update donor set exprerience = ? where id = ?";
//		
//		try {
//			PreparedStatement ps = dbcon.prepareStatement(sql);
//			ps.setDouble(1, newDonorAmt);
//			ps.setInt(2, donorId);
//			ps.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//	public void updateDonorRecords(int updateOption, int donorId, int newPhoneno)  throws ClassNotFoundException {
//		dbcon = getDbConnection();
//		String sql = "update donor set exprerience = ? where id = ?";
//		
//		try {
//			PreparedStatement ps = dbcon.prepareStatement(sql);
//			ps.setInt(1, newPhoneno);
//			ps.setInt(2, donorId);
//			ps.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
	


