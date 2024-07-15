package com.pay;

public class Pay {

	
	private int id;
	private String name;
	private String cardnumber;
	private String month;
	private String year;
	private String cvv;
	
	public Pay(int id, String name, String cardnumber, String month, String year, String cvv) {
		super();
		this.id = id;
		this.name = name;
		this.cardnumber = cardnumber;
		this.month = month;
		this.year = year;
		this.cvv = cvv;
	}

	public int getId() {
		return id;
	}

	

	public String getName() {
		return name;
	}

	

	public String getCardnumber() {
		return cardnumber;
	}


	public String getMonth() {
		return month;
	}


	public String getYear() {
		return year;
	}


	public String getCvv() {
		return cvv;
	}
}
