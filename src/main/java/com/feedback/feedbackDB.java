package com.feedback;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class feedbackDB {
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static boolean insertfeedback( String email, String message) {
		
		boolean isSuccess = false;
		
		try {
			con = DBcon.getConnection();
			stmt = con.createStatement();
			String sql = "insert into feedback values(0,'"+email+"', '"+message+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;

	}
	
public static boolean updatefeedback(String id, String email, String message) {
		
		try {
			con = DBcon.getConnection();
			stmt = con.createStatement();
			String sql = "update feedback set email = '"+email+"', message = '"+message+"'" + "where id='"+id+"'";
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
	
	public static List<feedback> getfeedbackDetails(String Id){
		int convertedID = Integer.parseInt(Id);
		
		ArrayList<feedback> feed = new ArrayList<>();
		
		try {
			con = DBcon.getConnection();
			stmt = con.createStatement();
			String sql = "select * from feedback where id = '"+convertedID+"' ";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				int id = rs.getInt(1);
				String email = rs.getString(2);
				String message = rs.getString(3);
				
				
				feedback fb = new feedback(id,email,message);
				
				feed.add(fb);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return feed;
	}	
	
	public static boolean deletefeedback(String id) {
	    	
		int convId = Integer.parseInt(id);
	    	
	    try {
	    		
	    	con = DBcon.getConnection();
	    	stmt = con.createStatement();
	    	String sql = "delete from feedback where id='"+convId+"'";
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
	
	public static List<feedback> validate(String email, String message){
		
		ArrayList<feedback> feed = new ArrayList<>();
		
	
		
		try {			
			con = DBcon.getConnection();
			stmt = con.createStatement();
			
			String sql = "select * from feedback where email = '"+email+"'and message = '"+message+"' ";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				
				int id = rs.getInt(1);
				String femail = rs.getString(2);
				String fmessage = rs.getString(3);
				
				feedback fb = new feedback(id,femail,fmessage);
				feed.add(fb);

			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return feed;
		
	}

	
}