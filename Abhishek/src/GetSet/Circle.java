package GetSet;

public class Circle extends Shape{
	public static double PI=3.14;
	private int radius;

	public Circle(int i) {
		radius=i;
		// TODO Auto-generated constructor stub
	}

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Double area() {
		System.out.println("this is child circle");
		return 3.14 * radius * radius;	
	}

	public int getRadiuds() {
		return radius;
	}

	public void setRadiuds(int radius) {
		this.radius = radius;
	}
	
	


	
}
