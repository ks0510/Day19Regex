/*
 * This java program check valid first name using regex.
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

public class FirstName {
	
	/**
	 * This is main method of program
	 * @param args
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first name");
		
		String firstName = sc.next();
		
		/*
		 * To define regex for first name and matching first name with expression
		 */
		boolean result = Pattern.matches("\\p{Upper}(\\p{Lower}+\\s?){2}",firstName);
		
		if(result) {
			System.out.println("First name is valid");
		}
		else {
			System.out.println("First name is invalid");
		}
	}
}
