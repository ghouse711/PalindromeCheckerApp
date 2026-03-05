package com.palindrome.main;

import java.util.Scanner;

public class UCElevenPalindromeChecker {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input : ");
		String input = sc.nextLine();
		String normalizedInput = PalindromeService.normalize(input);
		System.out.println("Normalized Input : " + normalizedInput);
		System.out.println("Is Palindrome? : " + PalindromeService.isPalindrome(normalizedInput));
		
	}
}

class PalindromeService{
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
	
	public static String normalize(String input) {
		input = input.trim();
		input = input.toLowerCase();
		input = input.replace(" " , "");
		return input;
	}
}
