package Excercise9point7Q1;

public class Rectangle extends Shape{
 
	private double Length;
	private double Width;
	
	public double area() {
		// TODO Auto-generated method stub
		return Length*Width;
		
	}

	public double getLength() {
		return Length;
	}

	public void setLength(double length) {
		Length = length;
	}

	public double getWidth() {
		return Width;
	}

	public void setWidth(double width) {
		Width = width;
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
