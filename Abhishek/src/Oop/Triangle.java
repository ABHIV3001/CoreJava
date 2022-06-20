package Oop;

public class Triangle extends Shape {

	private int base;
	private int height;
	
	public Triangle(int i, int j) {
		base=i;
		height=j;
		
		// TODO Auto-generated constructor stub
	}

	//public Triangle(int i, int j) {
		// TODO Auto-generated constructor stub
//	}

	public double area() {
		return (base*height/2);
	}
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
}
