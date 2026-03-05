package com.palindrome.main;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * ================================================================
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 7: Deque Based Optimized Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Deque
 * (Double Ended Queue).
 *
 * Characters are inserted into the deque and then
 * compared by removing elements from both ends:
 *
 *  - removeFirst()
 *  - removeLast()
 *
 * This avoids reversing the string and provides an
 * efficient front-to-back comparison approach.
 *
 * This use case demonstrates optimal bidirectional
 * traversal using Deque.
 *
 * @author Developer
 * @version 7.0
 */

public class UCSevenPalindromeChecker {
	
	public static void main(String args[]) {
		System.out.print("Input : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.print("Is palindrome? : " + isPalindrome(input));
	}

	public static boolean isPalindrome(String input) {
		Deque<Character> deque = new ArrayDeque<>();
		for(char c: input.toCharArray()) {
			deque.offerFirst(c);
		}
		while(!deque.isEmpty()) {
				if(deque.size()!=1) {
					if(deque.pollFirst()!=deque.pollLast()) return false; 
				}
				else deque.poll();
		}
		return true;
	}
}
