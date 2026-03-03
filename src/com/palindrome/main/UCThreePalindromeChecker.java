package com.palindrome.main;

import java.util.Scanner;

/**
 * ================================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 3: Reverse String Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 *
 * At this stage, the application:
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compares original and reversed strings
 * - Displays the validation result
 *
 * This introduces transformation-based validation.
 *
 * @author Developer
 * @version 3.0
 */

public class UCThreePalindromeChecker {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Original: ");
		String original = sc.nextLine();
		String reversed = "";
		for(int i=original.length()-1; i>=0; i--) {
			reversed+=original.charAt(i);
		}
		System.out.println("Reversed: "+reversed);
		System.out.println("Is Palindrome : "+original.equals(reversed));
	}

}
