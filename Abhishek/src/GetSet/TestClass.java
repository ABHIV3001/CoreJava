package GetSet;

public class TestClass {
	public static void main(String[] args) {
		Shape s= new Shape();
	    s.setColor("Blue");
		s.setBorderWidth(6);
		
		String a=s.getColor();
		int b= s.getBorderWidth();
		System.out.println(a);
		System.out.println(b);
	}

}
