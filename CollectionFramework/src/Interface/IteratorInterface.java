package Interface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorInterface {

	public static void main(String[] args) {
		
		Collection c= new ArrayList();
		c.add("ABHI");
		System.out.println(c);
		
		Iterator it= c.iterator();
		while (it.hasNext()) {
			Object o= it.next();
			System.out.println(o);
			
			Iterator it1 =c.iterator();
			if(it.hasNext()) {
				it.remove();//remove next element.
			}
		c.clear();
		System.out.println(c);
			
		}
		
	}

