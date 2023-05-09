/*
 * This java program which check all email samples are valid or not
 */
package regex;

import java.util.regex.Pattern;

/**
 * 
 * @author Kaif
 *
 */

public class EmailSample {
	
	/*
	 * To define method which check email is valid or not
	 */
	public static void checkEmail(String email) {
		
		/*
		 * Setting regex pattern given in UC
		 */
		boolean result = Pattern.matches("[a][b][c][a-zA-Z0-9.@+_-]{1,}",email);
		if(result) {
			System.out.println(email+": this email is valid");
		}
		else {
			System.out.println(email+": this  is not valid");
		}
	}
	
	/*
	 * This is main method of class
	 */
	public static void main(String[] args) {
		
		/*
		 * Taking input from sample pdf
		 */
		checkEmail("abc@yahoo.com");
		checkEmail("abc-100@yahoo.com");
		checkEmail("abc.100@yahoo.com");
		checkEmail("abc111@abc.com");
		checkEmail("abc-100@abc.net");
		checkEmail("abc.100@abc.com.au");
		checkEmail("abc@1.com");
		checkEmail("abc@gmail.com.com");
		checkEmail("abc+100@gmail.com");
		

	}

}
