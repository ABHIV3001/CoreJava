package GetSet;

import java.util.Date;

public class Personpractice {

private String name= null;
private String address= null;
private Date dateofBirth= null;

public String getName() {
	return name;
}
public void setName(String n){
    name = n;
}
    public String getAddress () {
    	return address;
    }
	public void setAddress(String a) {
		address=a;
	}
	public Date getDateofBirth() {
		return dateofBirth;
	}
	
	public void setDateofBirth(Date d) {
		dateofBirth=d;
	}
	
}
