package com.mobility.alpaca.palindrome;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.mobility.EvilTest;

@EvilTest
public class PalindromeTest {

	private Palindrome palindrome;

	@Test
	public void palindromes() {
		assertTrue(palindrome.isPalindrome(null));
		assertTrue(palindrome.isPalindrome(""));
		assertTrue(palindrome.isPalindrome("a"));
		assertTrue(palindrome.isPalindrome("aba"));
		assertTrue(palindrome.isPalindrome("abba"));
		assertTrue(palindrome.isPalindrome("abbabba"));
		assertTrue(palindrome.isPalindrome("gézakékazég"));
		assertTrue(palindrome.isPalindrome("indulagörögaludni"));
	}

	@Test
	public void nonPalindromes() {
		assertFalse(palindrome.isPalindrome("Mama"));
		assertFalse(palindrome.isPalindrome("Beer"));
	}

}
