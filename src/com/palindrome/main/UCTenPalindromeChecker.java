package com.palindrome.main;

import java.util.Scanner;

/**
 * ================================================================
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 10: Normalized Palindrome Validation
 *
 * Description:
 * This class validates a palindrome after preprocessing
 * the input string.
 *
 * Normalization includes:
 *  - Removing spaces and symbols
 *  - Converting to lowercase
 *
 * This ensures the palindrome check is logical rather
 * than character-format dependent.
 *
 * Example:
 * "A man a plan a canal Panama"
 *
 * @author Developer
 * @version 10.0
 */



public class UCTenPalindromeChecker {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input : ");
		String input = sc.nextLine();
		String normalizedInput = normalize(input);
		System.out.println("Normalized Input : " + normalizedInput);
		System.out.println("Is Palindrome? : " + isPalindrome(normalizedInput));
		
		
	}
	
	public static String normalize(String input) {
		input = input.trim();
		input = input.toLowerCase();
		input = input.replace(" " , "");
		return input;
	}
	
	public static boolean isPalindrome(String normalizedInput) {
		int i=0;
		int j=normalizedInput.length()-1;
		while(i<=j) {
			if(normalizedInput.charAt(i) != normalizedInput.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}
}
