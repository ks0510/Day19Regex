/*
 * This java program check valid last name using regex.
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

public class LastName {

	/**
	 * This is main method of program
	 * @param args
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Last name");
		
		String lastName = sc.next();
		
		/*
		 * To define regex for last name and matching last name with expression
		 */
		boolean result = Pattern.matches("\\p{Upper}(\\p{Lower}+\\s?){2}",lastName);
		
		if(result) {
			System.out.println("Last name is valid");
		}
		else {
			System.out.println("Last name is invalid");
		}
	}
}
