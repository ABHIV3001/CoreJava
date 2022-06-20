package GetSet;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
	
	private String name;
	private String address;
	private Date  dob;
	//public static final  AVG AGE;
	//public static int getAvg() {
		//return AVG;

	public Date getD() {
		return d;
	}
	public SimpleDateFormat getSdf() {
		return sdf;
	}
	Date d = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public 	Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
}
	

	