package model;

import java.sql.PreparedStatement;
import java.sql.Statement;

import com.mysql.cj.xdevapi.AddStatement;

public class bloodModel {
	private int donorId;
	private String donorName;
	private String donorEmail;
	private String donorbloodGroup;
	private String donorPhoneno;
	private String donorAdd;
	public bloodModel (int donorId, String donorName, String donorEmail, String donorbloodGroup, String donorPhoneno, String donorAdd) {
		super();
		this.donorId = donorId;
		this.donorName = donorName;
		this.donorEmail = donorEmail;
		this.donorbloodGroup = donorbloodGroup;
		this.donorPhoneno = donorPhoneno;
		this.donorAdd = donorAdd;
	}
	public bloodModel() {
		super();
	}
	public int getdonorId() {
		return donorId;
	}
	public void setdonorId(int donorId) {
		this.donorId = donorId;
	}
	public String getdonorName() {
		return donorName;
	}
	public void setdonorName(String donorName) {
		this.donorName = donorName;
	}
	public String getdonorEmail() {
		return donorEmail;
	}
	public void setdonorEmail(String donorEmail) {
		this.donorEmail = donorEmail;
	}
	public String getdonorbloodGroup() {
		return donorbloodGroup;
	}
	public void setdonorbloodGroup(String donorbloodGroup) {
		this.donorbloodGroup = donorbloodGroup;
	}
	public String getdonorPhoneno() {
		return donorPhoneno;
	}
	public void setdonorPhoneno( String donorPhoneno) {
		this.donorPhoneno = donorPhoneno;
	}
	public String getdonorAdd() {
		return donorAdd;
	}
	public void setdonorAmt(String donorAdd) {
		this.donorAdd = donorAdd;
	}
	public PreparedStatement prepareStatement(String sql) {
		// TODO Auto-generated method stub
		return null;
	}
	public Statement createStatement() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
