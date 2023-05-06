/*
 * This java program check valid email using regex
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

public class Email {

	/**
	 * This is main method of program
	 * @param args
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter email id");
		
		String emailId = sc.next();
		
		/*
		 * To define regex according to use case and matching email id with expression
		 */
		boolean result = Pattern.matches("[a][b][c][.][a-z]{1,10}[@][b][l][.][c][o][.][a-z]{1,10}",emailId);
		
		if(result) {
			System.out.println("email id is valid");
		}
		else {
			System.out.println("email id  is invalid");
		}
	}
}


