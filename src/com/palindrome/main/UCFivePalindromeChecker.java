package com.palindrome.main;

import java.util.Scanner;
import java.util.Stack;

public class UCFivePalindromeChecker {
	public static void main(String args[]) {
		System.out.print("Input : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		Stack<Character> stack = new Stack<>();
		int endLeft = input.length()/2;
		int startRight = (input.length()+1)/2;
		boolean flag = true;
		for(int i = 0; i<input.length(); i++) {
			if(i<endLeft) stack.push(input.charAt(i));
			else if(i>=startRight) {
				char popped = stack.pop();
				if(popped!=input.charAt(i)) {
					flag = false;
					break;
				}
			}
		}
		System.out.println("Is Palindrome? " + flag);
	}

}
