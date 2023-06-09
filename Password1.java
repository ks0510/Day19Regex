/*
 * This java program generate regex for strong password according to rules
 */
package regex;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * 
 * @author Kaif
 *
 */
public class Password1 {

	/**
	 * This is main method of program
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your password");

		String password = sc.next();

		/*
		 * To define regex for password according to rules and matching password with
		 * expression
		 */
		boolean result = Pattern.matches("[a-z]{8,}", password);

		if (result) {
			System.out.println("Password is valid");
		} else {
			System.out.println("Password is invalid");
		}
	}
}
