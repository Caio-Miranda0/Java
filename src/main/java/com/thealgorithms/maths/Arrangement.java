package com.thealgorithms.maths;

/** A utility class for computing the number of arrangements of a number.
 * 
 * @author Caio-Miranda0
 * @version 1.0
 */

public final class Arrangement {

	private Arrangement() {
	}
	
	/**
	 * Computes the number of arrangements of a number.
	 * 
	 * @param n The total number of items for which the arrangement will be calculated.
	 * @param p Represents the number of n items that will be selected.
	 * 
	 * @return The number of ways to arrange p items from a set of n items when order matters.
	 */
	
	public static long calculateArrangement(long n, long p) {
		long solution;

		if (p > n) {
			throw new IllegalArgumentException("The value of p must be less or equal than n.");
		} else if (n == 0 || p == 0) {
			throw new IllegalArgumentException("The values of arguments must be different zero.");
		} else {
			solution = 1;

			for (int i = 1; i <= p; i++, n--) {
				solution *= n;
			}

			return solution;
		}
	}

}
