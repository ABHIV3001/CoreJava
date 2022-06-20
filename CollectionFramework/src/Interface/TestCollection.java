package Interface;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {

private static String ele;

public static void main(String[] args) {

	//Add elements into collection
Collection c= new ArrayList();

//add elements into collection
c.add("1 Bura mat dekho");
c.add("2 Bura mat karo");
c.add("3 Bura mat suno ");
c.add("4 ABHISHEK");

System.out.println(c.size());
//print all object
for (Object ele: c) {
	System.out.println(ele);
}
//convert collection into array
Object[] oArray=c.toArray();
//print all elements of array
for(Object ele : oArray) {
	String s= (String) ele;


System.out.println(ele);
}
}
}