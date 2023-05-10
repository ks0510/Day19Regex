/*
 * This java program check valid phone number using regex.
 */
package regex;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author Kaif
 *
 */

public class MobileNumber {

	/**
	 * This is main method of program
	 * @param args
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter mobile number");
		
		String phoneNumber = sc.nextLine().trim();
		
		/*
		 * To define regex for mobile number  and matching mobile number with expression
		 */
		 Pattern pattern = Pattern.compile("[1-9]{1}[0-9]{1} [6-9]{1}[0-9]{9}");
		 
		 Matcher matcher = pattern.matcher(phoneNumber);
		 
		 boolean result = matcher.matches();
		
		if(result) {
			System.out.println("Phone Number is valid");
		}
		else {
			System.out.println("Phone Number is invalid");
		}
	}

}
