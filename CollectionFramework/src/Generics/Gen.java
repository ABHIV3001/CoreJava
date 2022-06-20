package Generics;

import java.util.ArrayList;
import java.util.Iterator;

public class Gen {
public static void main(String[] args) {
	
	ArrayList<String> a= new  ArrayList<String>();
	a.add("One");
	a.add("2");
	a.add("Three");
	
	String str=a.get(0);
	System.out.println(str);
	
	Iterator<String> it= a.iterator();
	
	while (it.hasNext()) {
		String string = (String) it.next();
		
	}
	
	
}
}
