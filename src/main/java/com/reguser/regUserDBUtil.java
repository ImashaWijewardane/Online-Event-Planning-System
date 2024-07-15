package com.reguser;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class regUserDBUtil {

	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static List<Customer> validate(String username, String password){
		
		ArrayList<Customer> cus = new ArrayList<>();
		
		
		try {
			
			con = DBconnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "select * from customer where uname = '"+username+"' and password = '"+password+"'";
			rs = stmt.executeQuery(sql);
			 
			 if(rs.next()) {
				 
				 int id = rs.getInt(1);
				 String name = rs.getString(2);
				 String email = rs.getString(3);
				 int number = rs.getInt(4);
				 String address = rs.getString(5);
				 String dob = rs.getString(6);
				 String uname = rs.getString(7);
				 String pas= rs.getString(8);
				 
				 Customer c = new Customer(id, name, email, number, address, dob, uname, pas);
				 cus.add(c);
				 
			 }
			
		}
		catch(Exception e){
			
			e.printStackTrace();
			
		}
		return cus;
	}
	public static boolean insertcustomer(String name, String pname, String email, String pnum, String address, String dob, String uname, String password) {
		
		boolean isSuccess = false;
		
			try {
					
				con = DBconnect.getConnection();
				stmt = con.createStatement();
				
				 String sql = "INSERT INTO customer (name, email, number, address, dob, uname, password) " +
	                     "VALUES ('" + name + "', '" + email + "', '" + pnum + "', '" + address + "', '" + dob + "', '" + uname + "', '" + password + "')";
			        int rs = stmt.executeUpdate(sql);

				 
				 if(rs> 0) {
					 
					 isSuccess = true;
					 
				 }
				 else {
					 
					 isSuccess = false;
				 }
					
				
			}
			
			catch(Exception e){
				
				e.printStackTrace();
				
			}
		
		return isSuccess;
	}
	 public static boolean updatecustomer(String id, String name, String email, String pnum, String address, String dob, String uname, String password) {
	    	
	    	boolean isSuccess = false;
	    	
			try {
	    		
	    		con = DBconnect.getConnection();
				stmt = con.createStatement();
				
	    		String sql = "update customer set name='"+name+"',email='"+email+"',number='"+pnum+"', address='"+address+"', dob='"+dob+"', uname='"+uname+"',password='"+password+"'"
	    				+ "where id='"+id+"'";
	    		
	    		int rs = stmt.executeUpdate(sql);
	    		
	    		if(rs> 0) {
					 
					 isSuccess = true;
					 
				 }
				 else {
					 
					 isSuccess = false;
				 }
					
				
			}
			
			catch(Exception e){
				
				e.printStackTrace();
			
			}
		
		return isSuccess;
}
	 
	 public static List<Customer> getcustomerDetails(String id) {
		 
		    int convertedID = Integer.parseInt(id);
		    
		    ArrayList<Customer> cus = new ArrayList<>();

		    try (Connection con = DBconnect.getConnection();
		         Statement stmt = con.createStatement();
		         ResultSet rs = stmt.executeQuery("SELECT * FROM customer WHERE id = " + convertedID)) {

		        while (rs.next()) {
		            int Id = rs.getInt(1);
		            String name = rs.getString(2);
		            String email = rs.getString(3);
		            int number = rs.getInt(4);
		            String address = rs.getString(5);
		            String dob = rs.getString(6);
		            String uname = rs.getString(7);
		            String password = rs.getString(8);

		            Customer c = new Customer(Id, name, email, number, address, dob, uname, password);
		            cus.add(c);
		        }
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		    return cus;
		}
	 public static boolean deletecustomer(String id) {
	    	
	    	int convId = Integer.parseInt(id);
	    	
	    	boolean isSuccess = false;
	    	
			try {
	    		
	    		con = DBconnect.getConnection();
				stmt = con.createStatement();
	    		
	    		String sql = "delete from customer where id='"+convId+"'";
	    		int rs = stmt.executeUpdate(sql);
	    		
	    		if (rs > 0) {
	    			isSuccess = true;
	    		}
	    		else {
	    			isSuccess = false;
	    		}
	    		
	    	}
	    	catch (Exception e) {
	    		e.printStackTrace();
	    	}
	    	
	    	return isSuccess;
	    }
	
}