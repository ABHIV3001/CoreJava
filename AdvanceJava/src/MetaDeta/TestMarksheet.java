package MetaDeta;

import java.util.Iterator;
import java.util.List;

public class TestMarksheet {
public static void main(String[] args) throws Exception {
		
//public static void main(String[] args) throws Exception {
		
		// testAdd ();
		 // testUpdate();
	     // testDelete();
		testGet();
	     
	}


	private static void testGet() throws Exception {
		// TODO Auto-generated method stub
		
		MarksheetBean mrk = new MarksheetBean();
		mrk.setRollno("104");
		mrk.setRollno("105");
		mmm
		MarksheetModel mrkm = new MarksheetModel();
		
		List<MarksheetBean> li = mrkm.get(mrk);
		
		Iterator<MarksheetBean> it = li.iterator();
		
		while (it.hasNext()) {
			MarksheetBean mb = it.next();
			System.out.println(mb.getRollno());
			System.out.println(mb.getName());
			System.out.println(mb.getPhysics());
			System.out.println(mb.getChemistry());
			System.out.println(mb.getMaths());
			
			
			
		}
		
	}















	private static void testDelete1() throws Exception {
		// TODO Auto-generated method stub
		
		MarksheetBean mrk = new MarksheetBean();
		MarksheetModel mrkm = new MarksheetModel();
		
		mrk.setRollno("107");
		
		mrkm.delete(mrk);
		System.out.println("DATA Deleted ");
		
	}




	private static void testAdd1 () throws Exception {
		// TODO Auto-generated method stub
		
		MarksheetBean mrk = new MarksheetBean();
		
		MarksheetModel mrkm = new MarksheetModel();
		
		mrk.setRollno("108");
		mrk.setName("Pratik");
		mrk.setChemistry(58);
		mrk.setPhysics(64);
		mrk.setMaths(42);
		
		mrkm.add(mrk);
		
		System.out.println(" One more Add Done ");
		
	}


private static void testUpdate1()throws Exception {
	// TODO Auto-generated method stub
	
	
		
		MarksheetBean mrk = new MarksheetBean();
		
		MarksheetModel mrkm = new MarksheetModel();
		
	mrk.setRollno("107");
	mrk.setName("Ladoo");
	mrk.setChemistry(40);
	mrk.setPhysics(25);
	mrk.setMaths(20);
	
		
		mrkm.update(mrk);
		
	System.out.println("Updated");
}


	
	
	















	private static void testDelete() throws Exception {
		// TODO Auto-generated method stub
		
		MarksheetBean mrk = new MarksheetBean();
		MarksheetModel mrkm = new MarksheetModel();
		
		mrk.setRollno("107");
		
		mrkm.delete(mrk);
		System.out.println("DATA Deleted ");
		
	}




	private static void testAdd () throws Exception {
		// TODO Auto-generated method stub
		
		MarksheetBean mrk = new MarksheetBean();
		
		MarksheetModel mrkm = new MarksheetModel();
		
		mrk.setRollno("108");
		mrk.setName("Pratik");
		mrk.setChemistry(58);
		mrk.setPhysics(64);
		mrk.setMaths(42);
		
		mrkm.add(mrk);
		
		System.out.println(" One more Add Done ");
		
	}


private static void testUpdate()throws Exception {
	// TODO Auto-generated method stub
	
	
		
		MarksheetBean mrk = new MarksheetBean();
		
		MarksheetModel mrkm = new MarksheetModel();
		
	mrk.setRollno("107");
	mrk.setName("Ladoo");
	mrk.setChemistry(40);
	mrk.setPhysics(25);
	mrk.setMaths(20);
	
		
		mrkm.update(mrk);
		
	System.out.println("Updated");
}


	
	
	
}


