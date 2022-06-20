package practice;
import java.text.SimpleDateFormat;
import java.util.Date;

public class date2 {

	public static void main(String[] args) {
	      Date  D= new Date();
		//System.out.println(D);}
SimpleDateFormat format= new SimpleDateFormat("dd/mm/yy");
String abh= format.format(D);
System.out.println(abh);
String D= "14/01/22";
Date d1= abh.parse(D);
 System.out.println(d1);
	}
}