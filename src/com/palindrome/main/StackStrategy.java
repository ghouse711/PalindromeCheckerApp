
package com.palindrome.main;

import java.util.Stack;

/**
 * This class provides a stack based implementation of the
 * PalindromeStrategy interface.
 * 
 * It used LIFO principle to reverse characters and compare them with
 * the original sequence.
 */

public class StackStrategy implements PalindromeStrategy {
	/**
	 * Checks whether the input string is a palindrome.
	 * 
	 * @param input Input string
	 * @return true if palindrome, false otherwise
	 */
	@Override
	public boolean check(String input) {
		Stack<Character> stack = new Stack<>();
		for (char c : input.toCharArray()) {
			stack.push(c);
		}
		for (char c : input.toCharArray()) {
			if (c != stack.pop()) {
				return false;
			}
		}
		return true;
	}
}