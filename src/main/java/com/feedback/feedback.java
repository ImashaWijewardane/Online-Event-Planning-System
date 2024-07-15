package com.feedback;

public class feedback {

	private int id;
    private String email;
    private String message;
    
	public feedback(int id, String email, String message) {
		super();
		this.id = id;
		this.email = email;
		this.message = message;
	}
	public int getId() {
		return id;
	}
	
	public String getEmail() {
		return email;
	}

	public String getMessage() {
		return message;
	}

    
 
    
}
