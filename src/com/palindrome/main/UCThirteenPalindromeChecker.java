package com.palindrome.main;

/**
 * Main Class - Use Case 13 
 * 
 * Use Case 13: Performance Comparision
 * 
 * Description:
 * This class measures and compares execution performance of palindrome validation
 * algorithms.
 * 
 * At this stage, the application:
 * 	- uses a palindrome strategy implementation
 * 	- captures execution start and end time
 * 	- calculates total execution duration.
 * 	- displays benchmarking results
 * 
 * This use case focuses purely on performance measurement
 * and algorithm comparison.
 * 
 * The goal is to introduce benchmarking concepts
 * 
 * @author Developer
 * @version 13.0
 */

public class UCThirteenPalindromeChecker {
	/**
	 * Application entry point for UC13
	 * 
	 * @param args Command-line arguments.
	 */
	public static void main(String[] args) {
		String input = "level";
		StackStrategy stackStrategy = new StackStrategy();
		long startTime = System.nanoTime();
		boolean isPalindrome = stackStrategy.check(input);
		long endTime = System.nanoTime();
		
		System.out.println("Input: " + input);
		System.out.println("Is Palindrome ? " + isPalindrome);
		System.out.println("Execution time: " + (endTime-startTime));
	}
}
