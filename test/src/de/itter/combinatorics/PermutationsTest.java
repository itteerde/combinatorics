package de.itter.combinatorics;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

import org.junit.Before;
import org.junit.Test;

public class PermutationsTest {

	Collection<Integer> c = null;
	
	@Before
	public void setup(){
		c = new Vector<Integer>();
		for(int n=0;n<100;n++){
			c.add(n);
		}
	}
	
	@Test
	public void testGetPermutation() {
		@SuppressWarnings("unchecked")
		Iterator<Integer> it = (Iterator<Integer>) Permutations.getPermutation(c, 0);
		assertEquals(new Integer(0), it.next());
		assertEquals(new Integer(100), new Integer(c.size()));
	}

}
