package Interface;

import java.util.ArrayList;

public class Collection {
	
	public static void main(String[] args) {
		
//		ArrayList a= new ArrayList();
//		for(int i=0; i<=1; i++) {
//		a.add("Nishank"+i);
//		
//		//System.out.println(a.size());
		
//System.out.println(a);
		ArrayList al=new ArrayList();
		al.add("1-one");
		al.add("Rohit");
		al.add("MUDAI");
		
ArrayList  al1=new  ArrayList();
al1.add(1);
al1.add(2);
al1.add(3);

al.addAll(al);
al1.addAll(al1);// addall 1 baar + kar k print karata h 
System.out.println(al);
System.out.println(al1);

		}
	
		
	}


