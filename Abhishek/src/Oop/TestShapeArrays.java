package Oop;

public class TestShapeArrays {
public static void main(String[] args) {
	
	Shape []s=new Shape[3];
 s[0]	=new Rectangle(8,9);
s[1]	=new Triangle(8,9);
 s[2]	=new Circle(9);
 
  double totalarea =0;
 
for (Shape shape : s) {
	//System.out.println(shape.area());}
	totalarea += shape.area();
}
//System.out.print(s[0].area()+s[1].area()+s[2].area()); //+s[1].area()+s[2].area());

System.out.println(totalarea);

}
}