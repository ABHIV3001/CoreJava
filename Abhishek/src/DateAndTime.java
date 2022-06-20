import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public  class DateAndTime {
public static void main (String [] args) throws ParseException{

Date d=new Date();
System.out.println("Date:"+d);
System.out.println("Time:" +d.getTime());//by java.util date 

SimpleDateFormat format= new SimpleDateFormat("dd/MM/yyyy");
String str =format.format(d);
System.out.println(str);//by simple date format

String str1 = "26/05/2022";
Date d1=  format.parse(str1);
 System.out.println(d1);
 

 

}
}