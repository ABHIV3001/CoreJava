package Excercise9point7Q1;

public class TestShape  {
	public static void main(String[] args) {
		
	Circle c=new Circle();
	c.setRadius(5);
System.out.println("Circle area is " +"   "+c.area());
		
	Triangle t=new Triangle();
	t.setbase(4);
    t.sethight(2);
    System.out.println("Triangle area is "+ " "  +t.area());
   
    Rectangle r=new Rectangle();
    r.setLength(10);
    r.setWidth(2);
    System.out.println("Retangle area is " +" "+r.area());
    
    Shape[] shapelist=new Shape[3];
    shapelist[0]=c;
    shapelist[1]=t;
    shapelist[2]=r;
    
    //System.out.println(shapelist);
//    int totalarea=0;
//    for(int i=0; i<shapelist.length; i++) {
//    	totalarea+=shapelist[i].getarea();
//    }
//    System.out.println(totalarea);
//   
	}
}
