package org.rcsb.structuralSimilarity.project2;

public interface FragmentComparable<T extends FragmentComparable<T>> {
	public double compare(T t);
}
