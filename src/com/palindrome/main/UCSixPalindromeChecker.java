package com.palindrome.main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * ================================================================
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 6: Queue + Stack Fairness Check
 *
 * Description:
 * This class demonstrates palindrome validation using
 * two different data structures:
 *
 *  - Queue (FIFO - First In First Out)
 *  - Stack (LIFO - Last In First Out)
 *
 * Characters are inserted into both structures and then
 * compared by removing from the front of the queue and
 * the top of the stack.
 *
 * If all characters match, the input string is confirmed
 * as a palindrome.
 *
 * This use case helps understand how FIFO and LIFO
 * behaviors can be combined for symmetric comparison.
 *
 * @author Developer
 * @version 6.0
 */

public class UCSixPalindromeChecker {
	
	public static void main(String args[]) {
		System.out.print("Input : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.print("Is Palindrome? : " + isPalindrome(input));
	}

	public static boolean isPalindrome(String input) {
		Stack<Character> stack = new Stack<>();
		Queue<Character> queue = new LinkedList<>();
		for(char c: input.toCharArray()) {
			stack.push(c);
			queue.offer(c);
		}
		
		for(int i=0; i<input.length(); i++) {
			if(stack.pop() != queue.poll()) return false;
		}
		return true;
	}

}
