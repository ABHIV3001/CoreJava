package GetSet;

public class TestClass3 {
	public static void main(String[] args) {
		
	
		/*
		 * Shape c= new Circle(); c.setColor("Red"); c.setBorderWidth(5); ((Circle)
		 * c).setRadiuds(3);
		 * 
		 * System.out.println("Circle area is " + c.area());
		 * System.out.println("Circle color is "+c.getColor());
		 * System.out.println("Circle BorderWidth is " + c.getBorderWidth());
		 * System.out.println("Circle radius is " +((Circle) c).getRadiuds());
		 * 
		 * System.out.println(); Rectangle r=new Rectangle(); r.setLength(10);
		 * r.setWidth(5);
		 * 
		 * System.out.println("Rectangle length is "+ r.getLength());
		 * System.out.println("Rectangle Width is "+r.getWidth());
		 * System.out.println("Rectangle area is " + r.area());
		 * 
		 * System.out.println();// for shift the line Triangle t= new Triangle();
		 * 
		 * 
		 * System.out.println("Triangle area is " + t.area());
		 * System.out.println("Triangle Base is " + t.getBase());
		 * System.out.println("Triangle Hight is " + t.getHight());
		 */ 
Shape [] s1 =new Shape[3];
s1[0]=new Circle(10);
s1[1]=new Rectangle(512,23);
s1[2]=new Triangle(12,13);
for (Shape shape : s1) {
	System.out.println(shape.area());
}
	

	
	}	
}
