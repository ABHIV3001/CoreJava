package Password;

import java.util.Random;

public class RandomPassword {

	public static void main(String[] args) {
		System.out.println(generatePassword(4));
	}

	private static char[]generatePassword(int length) {
		//String CapitalCaseLetters= "ABCDEFGHIJKLMNOPQRSTUVWXZ";
		//String  LowerCaseLetters= "abcdefghijklmnopqrstuvwxyz";
		//String specialCharacters ="!@#%$&*";
		String numbers ="1234567890";
		
		
		String Password=  numbers;b//CapitalCaseLetters +  LowerCaseLetters + specialCharacters + numbers; 
		Random random= new Random();
		char[] password =new char[length];
		
		//password[0]= CapitalCaseLetters.charAt(random.nextInt(CapitalCaseLetters.length()));
		//password[1]= LowerCaseLetters.charAt(random.nextInt(LowerCaseLetters.length()));
		//password[2]= specialCharacters.charAt(random.nextInt(LowerCaseLetters.length()));
//password[3]= numbers.charAt(random.nextInt(numbers.length()));		
		for(int i=0; i<length; i++) {
			password[i]=Password.charAt(random.nextInt(Password.length()));		
					}
		return password;
	}
}