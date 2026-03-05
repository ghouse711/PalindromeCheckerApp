package com.palindrome.main;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * ================================================================
 * MAIN CLASS - UseCase8PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 8: Linked List Based Palindrome Checker
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using a LinkedList.
 *
 * Characters are added to the list and then compared
 * by removing elements from both ends:
 *
 *  - removeFirst()
 *  - removeLast()
 *
 * This demonstrates how LinkedList supports
 * double-ended operations for symmetric validation.
 *
 * @author Developer
 * @version 8.0
 */

public class UCEightPalindromeChecker {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input : ");
		String input = sc.nextLine();
		System.out.println("Is Palindrome? : " + isPalindrome(input));
	}
	
	public static boolean isPalindrome(String input) {
		LinkedList<Character> linkedlist = new LinkedList<>();
		for(char c: input.toCharArray()) {
			linkedlist.add(c);
		}
		while(!linkedlist.isEmpty()) {
			if(linkedlist.size()==1) return true;
			if(linkedlist.pollFirst() != linkedlist.pollLast()) return false;
		}
		return true;
	}

}
