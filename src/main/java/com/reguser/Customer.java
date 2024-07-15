package com.reguser;

public class Customer {

	
	private int id;
	private String name;
	private String email;
	private int number;
	private String address;
	private String dob;
	private String uname;
	private String password;
	
	public Customer(int id, String name, String email, int number, String address, String dob, String uname,
			String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.number = number;
		this.address = address;
		this.dob = dob;
		this.uname = uname;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}



	public int getNumber() {
		return number;
	}


	public String getAddress() {
		return address;
	}



	public String getDob() {
		return dob;
	}



	public String getUname() {
		return uname;
	}

	

	public String getPassword() {
		return password;
	}

	
	
	
	
}
