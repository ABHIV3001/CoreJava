package Interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestMarksheet {
	public static void main(String[] args) {
		
		List i=new ArrayList();
		Marksheet m1=new Marksheet("1224842701","Abhishek",89,78,96);
		i.add(m1);
		
	   Marksheet m2=new Marksheet("1224842702","Sachin",75,56,86);
	   i.add(m2);
	   
	   Iterator I=i.iterator();
	   while(I.hasNext());{
		   
		   Marksheet m=null;
		   m=(Marksheet)I.next();
		   System.out.println(m.getRollNo());
		   System.out.println(m.getName());
	   }
	}

}
