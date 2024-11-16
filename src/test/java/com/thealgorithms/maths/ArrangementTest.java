package com.thealgorithms.maths;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/** Test class for Arrangement
 * 
 * @author Caio-Miranda0
 * @version 1.0
 */

class ArrangementTest {

	@Test
	public void testCalculateArrangementValidInputs() {
		
		long result = Arrangement.calculateArrangement(6, 2);
		assertEquals(30, result, "The arrangement of 6 items taken 2 at a time should be 60.");
		
	}
	
	@Test
	public void testCalculateArrangementPermutationSimpleCase() {
		
		long result = Arrangement.calculateArrangement(5, 5);
		assertEquals(120, result, "The arrangement of 5 items taken 5 at a time should be 120");
	}
	
	@Test
	public void testCalculateArrangement_pGreatherThan_n() {
		
		Exception e = assertThrows(IllegalArgumentException.class, () -> {
			Arrangement.calculateArrangement(4, 5);
		});
		
		assertEquals("The value of p must be less or equal than n.", e.getMessage());
		
	}
	
	@Test
	public void testCalculateArrangement_nOr_pIsZero() {
		
		Exception e = assertThrows(IllegalArgumentException.class, () -> {
			Arrangement.calculateArrangement(0, 0);
		});
		
		assertEquals("The values of arguments must be different zero.", e.getMessage());
	}
}
