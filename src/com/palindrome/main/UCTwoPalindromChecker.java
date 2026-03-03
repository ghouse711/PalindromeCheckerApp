package com.palindrome.main;

import java.util.Scanner;

/**
 * ================================================================
 * MAIN CLASS - UseCase2PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 2: Hardcoded Palindrome Validation
 *
 * Description:
 * This class demonstrates basic palindrome validation
 * using a hardcoded string value.
 *
 * At this stage, the application:
 *  - Stores a predefined string
 *  - Compares characters from both ends
 *  - Determines whether the string is a palindrome
 *  - Displays the result on the console
 *
 * This use case introduces fundamental comparison logic
 * before using advanced data structures.
 *
 * @author Developer
 * @version 2.0
 */


public class UCTwoPalindromChecker {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input text: ");
		String s = sc.nextLine();
		System.out.println("Is it a Palindrome? : " + isPalindrome(s));
	}
	
	public static boolean isPalindrome(String s) {
		int n = s.length()-1;
		for(int i=0; i<s.length()/2; i++) {
			if(s.charAt(i)!=s.charAt(n-i)) return false;
		}
		return true;
		
	}
}
