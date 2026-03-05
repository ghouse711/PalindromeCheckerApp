package com.palindrome.main;

import java.util.Scanner;

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
