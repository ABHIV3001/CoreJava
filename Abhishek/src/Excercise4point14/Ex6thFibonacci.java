package Excercise4point14;

public class Ex6thFibonacci {
	public static void main(String[] v) {
		int a=0;
		int b=1;
		int c;
		
		for(int i=0; i<=5; i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
		
	}

}
