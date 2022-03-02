package service;

import java.util.ArrayList;

import data.bloodadmin;
import model.bloodModel;

public class bloodmodelDetails implements xyzmodelDetails{
	bloodadmin bloodadmin = new bloodadmin();
	ArrayList<bloodModel> donorList = new ArrayList<bloodModel>();
	public void addEmployeeToList(bloodModel bm) throws ClassNotFoundException {
		donorList.add(bm);
		bloodadmin.storeDonorRecordsInDb(donorList);
	}
	public void addDonorToList(bloodModel bm) {
		// TODO Auto-generated method stub
		
	}

}