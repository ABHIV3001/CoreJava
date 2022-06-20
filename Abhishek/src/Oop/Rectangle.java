package Oop;

public class Rectangle extends Shape {

	private int length;
	private int width;
	
	public Rectangle(int i, int j) {
		length=i;
		width=j;
		// TODO Auto-generated constructor stub
	}


	public Rectangle() {
		// TODO Auto-generated constructor stub
	}


	public double area () {
		return (length*width);
	}
	
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
}
