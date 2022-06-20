package Excercise9point7Q1;

public  class Circle extends Shape {

	private double radius;
	public final double PI=3.14;
	
	public double area() {
		return PI*radius*radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getPI() {
		return PI;
	}

	@Override
	public double getarea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	


}
