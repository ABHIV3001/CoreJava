package Excercise4point14;

public class Question7th {
	public static void main(String[] args) {
	
		int sum=0, count=0;
	
	for(int i=101; i<200; i++) {
	if(i%7==0) {
		sum= sum+i;
		count++;
		System.out.println("the sum of the number btw 100 to200 which are divisible by 7 is:"+sum);
		System.out.println("total numbers between 100 to 200 which are divisible by 7 is :"+count);
	}
		
	}

}
}