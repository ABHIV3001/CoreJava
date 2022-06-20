package com.rays.oop;

import java.util.Date;

public class Person {

	private Date dob;
	private String name;
	private String address;
	public int $AVG_AGE;
	
	
	public void setDob(Date  i) {
		dob = i; 
	}
	public Date getDob() {
		return dob;
		
		}
		
		
	public void setName(String s) {
		name = s;
	}
	public String getName() {
		return  name;
	
		
	}
	
	public void setAddress(String c) {
		address=c;
	}
	public String getAddress() {
		return address;
	}
	public void set$AVG_AGE(int a) {
		$AVG_AGE=a;
		
	}
	public int get$AVG_AGE() {
		
		return $AVG_AGE;
			
		
	}
	}


