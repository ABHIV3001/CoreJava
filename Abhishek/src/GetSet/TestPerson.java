package GetSet;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Person p = new Person();
		p.setName("Abhishek");
		p.setAddress("Sheopur");
		Date dob;
		p.setDob(sdf.parse("30/01/2000"));
		
		System.out.println(p.getName());
		System.out.println(p.getDob());
		System.out.println(p.getAddress());
	}
}