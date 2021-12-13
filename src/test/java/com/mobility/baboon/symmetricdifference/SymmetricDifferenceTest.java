package com.mobility.baboon.symmetricdifference;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class SymmetricDifferenceTest {

	private SymmetricDifference symmetricDifference;

	@Before
	public void setup() {
		symmetricDifference = new SymmetricDifference();
	}

	@Test
	public void empty() {
		int[] empty = {};
		String[] expected = {};
		assertArrayEquals(expected, symmetricDifference.getSymmetricDifferenceAsWords(null, null));
		assertArrayEquals(expected, symmetricDifference.getSymmetricDifferenceAsWords(empty, null));
		assertArrayEquals(expected, symmetricDifference.getSymmetricDifferenceAsWords(null, empty));
	}

	@Test
	public void removeAll() {
		int[] m = { 2, 1, 3 };
		int[] n = { 2, 3 };

		String[] result = symmetricDifference.getSymmetricDifferenceAsWords(m, n);

		assertArrayEquals(new String[] { "One" }, result);
	}

	@Test
	public void standard() {
		int[] m = { 1, 7, 5, 3, 8, 2 };
		int[] n = { 5, 2, 6, 4 };

		String[] result = symmetricDifference.getSymmetricDifferenceAsWords(m, n);

		assertArrayEquals(new String[] { "One", "Three", "Four", "Six", "Seven", "Eight" }, result);
	}

}
