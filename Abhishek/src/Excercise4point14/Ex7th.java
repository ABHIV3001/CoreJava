package Excercise4point14;

public class Ex7th {
public static void main(String[] args) {
	int a = 0;
	int b=1;
	for(int i=100; i<=200; i++) {
        if(i%7==0) {
        	a=i+a;
        }
//System.out.println(i);
	}
   
System.out.println("Sum of all integer greater than 100 and less than 200 that are divisible with 7 is " +a);
}
}
