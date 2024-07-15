package com.pay;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PaymentDB {

	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static List<Pay> validate(String cardnumber, String cvv){
		
		ArrayList<Pay> cardDetails = new ArrayList<>();
		
		//validate
		
		try {			
			
			con =   DBPay.getConnection();
			stmt =  con.createStatement();
			String sql = "select * from pay where cardnumber = '"+cardnumber+"' and cvv = '"+cvv+"' ";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String cardNo = rs.getString(3);
				String month = rs.getString(4);
				String year = rs.getString(5);
				String pcvv = rs.getString(6);
				
				Pay pm = new Pay(id, name, cardNo, month, year, pcvv);
				cardDetails.add(pm);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return cardDetails;
		
	}
	
	public static boolean insertcard(String name, String cardnumber, String month, String year, String cvv) {
		boolean isSuccess = false;
		
		try {
			con = DBPay.getConnection();
			stmt = con.createStatement();
			String sql = "insert into pay (name, cardnumber, month, year, cvv) " +
		             "values ('"+name+"', '"+cardnumber+"', '"+month+"', '"+year+"', '"+cvv+"')";

			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				
				isSuccess = true;
			} 
			else {
				
				isSuccess = false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
		
	}
	
	public static boolean updatecard(String id, String name, String cardnumber, String month, String year, String cvv) {
		
		try {
			con = DBPay.getConnection();
			stmt = con.createStatement();
			String sql = "update pay set name = '"+name+"', cardnumber = '"+cardnumber+"', month = '"+month+"', year = '"+year+"', cvv = '"+cvv+"' where id = '"+id+"'  ";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return isSuccess;
	}
	
	public static List<Pay> getCardDetails(String Id){
		int convertedID = Integer.parseInt(Id);
		
		ArrayList<Pay> cardDetails = new ArrayList<>();
		
		try {
			con = DBPay.getConnection();
			stmt = con.createStatement();
			String sql = "select * from pay where id = '"+convertedID+"' ";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String cardnumber = rs.getString(3);
				String month = rs.getString(4);
				String year = rs.getString(5);
				String cvv = rs.getString(6);
				
				Pay pm = new Pay(id, name, cardnumber, month, year, cvv);
				cardDetails.add(pm);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return cardDetails;
	}	
	
	public static boolean deleteCard(String id) {
	    	
		int convId = Integer.parseInt(id);
	    	
	    try {
	    		
	    	con = DBPay.getConnection();
	    	stmt = con.createStatement();
	    	String sql = "delete from pay where id='"+convId+"'";
	   		int rs =  stmt.executeUpdate(sql);
	    		
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






