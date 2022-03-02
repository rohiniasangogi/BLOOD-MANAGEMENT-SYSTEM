package controller;

import java.util.Scanner;

import data.bloodadmin;
import model.bloodModel;
import service.bloodmodelDetails;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException { //throws ClasssNotFoundException {
		bloodmodelDetails bmd = new bloodmodelDetails();
		Scanner sc = new Scanner(System.in);
		bloodadmin ba = new bloodadmin();
		System.out.println("***********************************************************************");
		System.out.println("***********************WELCOME TO BLOOD MANAGEMENT SYSTEM*****************************");
		System.out.println("Blood admin or Donor or Patient:");
		boolean temp = true;
		while(temp) {
			System.out.println("--> Blood admin \n -->Donor\n -->Home");
			int option = Integer.parseInt(sc.nextLine());
			switch(option) {
			case 1: {
				System.out.println("Blood Admin name please");
				String bloodAdmin = sc.nextLine();
				System.out.println("Blood Admin password please");
				String bloodadminPassword = sc.nextLine();
				if(bloodAdmin.equals("Rohini111")  && bloodadminPassword.equals("Rohini$111")) {
					boolean temp1  = true;
					while(temp1 ) {
						System.out.println("bloodgroups are avaliable:");
						System.out.println("A+\n B+ \n AB+\n O+ \n O- \n A- \n B- \n AB-");
						System.out.println("select any operation of ur choice:");
						System.out.println("1.Add New Donor\n2.View Donor\n3.Update Existing Donor\n4.Delete Donor Details\n5.Exit selected choice");
						boolean flag1 = true;
						int bloodadminoption = 0;
						while(flag1) {
							try {
								bloodadminoption = Integer.parseInt(sc.nextLine());
								flag1 = false;
							} catch(Exception e) {
								System.out.println("Input given type is wrong, mention in number type");
								flag1 = true;
							}
						}
						switch(bloodadminoption) {
						///////ADD///////
							case 1:{
								System.out.println("How many blood donor details need to ADD");
								int donorCount = Integer.parseInt(sc.nextLine());
								int donorId;
								String donorName;
								String donorEmail;
								String donorbloodGroup;
								String donorPhoneno;
								String donorAdd;
								for(int i=0; i<donorCount; i++) {
									donorId = Integer.parseInt(sc.nextLine());
									donorName = sc.nextLine();
									donorEmail = sc.nextLine();
									donorbloodGroup = sc.nextLine();
									donorPhoneno = sc.nextLine();
									donorAdd = sc.nextLine();
									bloodModel bm = new bloodModel(donorId,donorName,donorEmail,donorbloodGroup,donorPhoneno,donorAdd);
									bmd.addDonorToList(bm);
									
								}
								break;
							}
							//////VIEW/////////
							case 2:{
								ba.viewDonorTableRecords();
								break;
							}
							////////UPDATE///////
							case 3:{
								System.out.println("Enter the donorId");
								int donorId = Integer.parseInt(sc.nextLine());
								 boolean flag2= true;
	        					 System.out.println("\n select any one of them to update");
	        					 try {
	        						 while(flag2) {
	        							 System.out.println("\\n1.DonorId\\n2.DonorName\\n3.DonorEmail\\n4.DOnorBloodGroup\\n5.DonorPhoneno\\n6.DonorAdd\\n7.Exit" );
	        							 int updateOption = Integer.parseInt(sc.nextLine());
								switch (updateOption) {
								case 1:{
									System.out.println("Enter the Donor Name and the Id as "+donorId);
									String newDonorName = sc.nextLine();
									ba.updateDonorRecords(updateOption,donorId,newDonorName);
									break;
								}
								case 2:{
									System.out.println("Enter the Donor's Email and the Id as "+donorId);
									String newDonorEmail = sc.nextLine();
									ba.updateDonorRecords(updateOption,donorId,newDonorEmail);
									break;
								}
								case 3:{
									System.out.println("Enter the Donor's BloodGroup and the Id as "+donorId);
									String newDonorBloodGroup = sc.nextLine();
									ba.updateDonorRecords(updateOption,donorId,newDonorBloodGroup);
									break;
								}
								case 4:{
									System.out.println("Enter the Donor's Phoneno and the Id as "+donorId);
									String newPhoneno = sc.nextLine();
									ba.updateDonorRecords(updateOption,donorId,newPhoneno);
									break;
								}
								case 5:{
									System.out.println("Enter the Donor's Add and the Id as "+donorId);
									String newAdd = sc.nextLine();
									ba.updateDonorRecords(updateOption,donorId,newAdd);
									break;
								}
								}
	        						 }
	        					 }
								catch(NumberFormatException e){
	        						 System.out.println("\nEnter the correct number");
	        						 flag2 = true;
	        					 }
								break;
								}
	        					 
							
							/////DELETE///////
							 case 4:{
	        					 System.out.println("\n Enter the donorId to be delete the record");
	        					 int DeletedonorId = 0;
	        					 boolean flag3 = true;
	        					 while(flag3) {
	        						 try {
	        							 DeletedonorId = Integer.parseInt(sc.nextLine());
	        							 flag3 =false;
	        						 }catch(NumberFormatException e) {
	        							 System.out.println("Enter the correctNumber");
	        							 flag3= true;
	        						 }
	        						 
	        					 }
	        					 ba.DeletebloodModel(DeletedonorId);
	        					 break;
	        				 }
							
							
							/////EXIT/////
							case 5:{
								temp1 = false;
								break;
							}
						}
					}
				} 
				else {
					System.out.println("Incorrect BloodAdmin/Password");
				}
				break;
				
			}
			}
		}
	}
}


