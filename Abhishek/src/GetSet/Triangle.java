package GetSet;

public class Triangle extends Shape{

	int base;
	int hight;
	
	public Triangle(int i, int j) {
		base=i;
		hight=j;
		// TODO Auto-generated constructor stub
	}

	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	public Double area() {
		return (double) (base * hight /2);	
	}

	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	
}
