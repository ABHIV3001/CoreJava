package Excercise9point7Q1;

public class Triangle extends Shape {	
	
	private double base;
	private double hight;
	
	public double area() {
		// TODO Auto-generated method stub
		return base*hight*1/2;
	}

	public double getbase() {
		return base;
	}

	public void setbase(double base) {
		this.base = base;
	}

	public double gethight() {
		return hight;
	}

	public void sethight(double hight) {
		this.hight = hight;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getarea() {
		// TODO Auto-generated method stub
		return 0;
	}

	
		
	}
	


