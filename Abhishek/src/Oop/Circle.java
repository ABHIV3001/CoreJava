package Oop;

public class Circle extends Shape {
	//private static final double pi=3.14;
	private int radius;

	public Circle(int i) {
		radius=i;
		// TODO Auto-generated constructor stub
	}



	public double area () {
		return 3.14*radius*radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}
