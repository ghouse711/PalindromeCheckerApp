package com.palindrome.main;

import java.util.Scanner;

/**
 * ================================================================
 * MAIN CLASS - UseCase9RecursivePalindrome
 * ================================================================
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using recursion.
 *
 * Characters are compared from the outer positions
 * moving inward using recursive calls.
 *
 * The recursion stops when:
 *  - All characters are matched, or
 *  - A mismatch is found.
 *
 * This use case demonstrates divide-and-conquer
 * logic using method recursion.
 *
 * @author Developer
 * @version 9.0
 */

public class UCNinePalindromeChecker {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		String input = sc.nextLine();
		System.out.println("Is palindrome? : " + isPalindrome(input));
	}
	public static boolean isPalindrome(String input) {
		if(input.length() <= 1) return true;
		if(input.charAt(0) != input.charAt(input.length()-1)) return false;
		return isPalindrome(input.substring(1, input.length()-1));
	}
	
	
	
}
