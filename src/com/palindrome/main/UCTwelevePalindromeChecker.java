package com.palindrome.main;

/**
 * Main Class - Use Case 12 
 * 
 * Use Case 12: Strategy Pattern for Palindrome Algorithms (Advanced)
 * 
 * Description:
 * This class demonstrates how palindrome validation algorithms can be selected
 * during runtime using Strategy Design Pattern.
 * 
 * At this stage, the application:
 * 	- Defines a palindromeStrategy interface
 * 	- implements a concrete stack based strategy
 * 	- injects strategy at runtime.
 * 	- executes the selected algorithm
 * 
 * @author Developer
 * @version 12.0
 */

public class UCTwelevePalindromeChecker {
	/**
	 * Application entry point for UC11
	 * 
	 * @param args Command-line arguments.
	 */
	public static void main(String[] args) {
		String input = "level";
		StackStrategy stackStrategy = new StackStrategy();
		boolean isPalindrome = stackStrategy.check(input);
		
		System.out.println("Input: " + input);
		System.out.println("Is Palindrome ? " + isPalindrome);
	}
}
