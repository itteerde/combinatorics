package de.itter.combinatorics;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

import org.junit.Test;

public class PermutationsTest {

	@Test
	public void testGetPermutation() {
		Collection<Integer> c = new Vector<Integer>();
		@SuppressWarnings("unchecked")
		Iterator<Integer> it = (Iterator<Integer>) Permutations.getPermutation(c, 0);
		assertEquals(false, it.hasNext());
	}

}
