package de.itter.combinatorics;

import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

public abstract class Permutations {

	public static Iterator<?> getPermutation(Collection<?> c, int i){
		return c.iterator();
	}
	
	public static Iterator<Iterator<?>> getPermutations(Collection<?> c){
		return null;
	}
}
