package model;

public class donorModel {
	private int id;
	private String donorName;
	private String donorEmail;
	private int phoneNumber;
	private String password;
	public donorModel(int donorId, String donorName, String donorEmail, int phonenumber, String password) {
		super();
		this.id = id;
		this.donorName = donorName;
		this.donorEmail = donorEmail;
		this.phoneNumber = phoneNumber;
		this.password = password;
	}
	public donorModel() {
		super();
	}
	public int getid() {
		return id;
	}
	public void setId(int Id) {
		this.id = id;
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
	public int getphoneNumber() {
		return phoneNumber;
	}
	public void setphoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String password ) {
		this.password = password;
	}
}