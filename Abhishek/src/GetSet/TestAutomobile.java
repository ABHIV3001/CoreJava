package GetSet;

public class TestAutomobile {
public static void main(String[] args) {
	

	Automobile a=null;//declare an object
	a=new Automobile();
	
	//set values
	a.setColor("Blue");
	a.setSpeed(150);
	a.setMfg("2018");
	
	System.out.println("My car color is "  + a.getColor());
}	
}
