package com.rays.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {

	public static void main(String[] args) throws ParseException {
	
		Person p = new Person();
	String s= "11/04/2022";
	SimpleDateFormat format= new SimpleDateFormat("dd/mm/yy");
	p.setDob(format.parse(s));
		p.setName("PAWAN");
		p.setAddress("Sheopur");
		p.set$AVG_AGE(21);
		System.out.println("Person Dob is = "+p.getDob());
		System.out.println("Person Name is = "+p.getName());
		System.out.println("Person Address is = "+p.getAddress());
		System.out.println("Person Age is = "+p.get$AVG_AGE());
	}
	

	
	
}
