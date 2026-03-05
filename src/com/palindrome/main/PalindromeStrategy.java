
package com.palindrome.main;

/**
 * This interface defines a contract for all palindrome checking algorithms
 * 
 * Any new algorithm must implement this interface and provide its own
 * concrete implementation
 */

public interface PalindromeStrategy {
	public boolean check(String input);
}