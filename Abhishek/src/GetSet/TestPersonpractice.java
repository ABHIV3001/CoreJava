package GetSet;

public class TestPersonpractice {
public static void main(String[] args) {
	
	Person p=null; //declare an object
	p= new Person();//Instantiate
	
	//set values
	p.setName("Yogita");g
	p.setAddress("SHEOPUR");
	//p.setDob(30/01/2002);
	
	//Get values
	System.out.println("Name:" +p.getName());
	System.out.println("Address:"+p.getAddress());
}
}
