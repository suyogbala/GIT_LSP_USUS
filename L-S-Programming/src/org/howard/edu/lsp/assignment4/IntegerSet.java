package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.List;

/**
 * Class IntegerSet represents a set of integers stored in an arrayList
 * It provides various operations such as adding elements,
 * removing elements, finding the largest and smallest elements,
 * performing set operations like union, intersection, and difference,
 * and more.
 */

public class IntegerSet {
  private List<Integer> nums;

  /**
   * Constructs an empty IntegerSet.
   */
  public IntegerSet() {
    this.nums = new ArrayList<Integer>();
  }

  /**
   * Clears the list completely
   */
  public void clear() {
    nums.clear();
  }

  /**
   * Returns the number of elements in the set.
   *
   * @return the number of elements in the set
   */
  public int length() {
    return nums.size();
  }

  /**
   * Checks if the set contains a specific element.
   *
   * @param element the element to check
   * @return true if the set contains the element, otherwise false
   */
  public boolean contains(int element) {
    return nums.contains(element);
  }

  /**
   * Checks if the set is empty.
   *
   * @return true if the set is empty, otherwise false
   */
  public boolean isEmpty() {
    return nums.isEmpty();
  }

  /**
   * Returns the largest element in the set.
   *
   * @return the largest element in the set
   * @throws IntegerSetException if the set is empty
   */
  public int largest() throws ExceptionalCaseInt {
    if (isEmpty()) {
      throw new ExceptionalCaseInt("IntegerSet is empty");
    }
    int max = nums.get(0);
    for (int i : nums) {
      if (i > max) {
        max = i;
      }
    }
    return max;
  }

  /**
   * Returns the smallest element in the set.
   *
   * @return the smallest element in the set
   * @throws IntegerSetException if the set is empty
   */
  public int smallest() throws ExceptionalCaseInt {
    if (isEmpty()) {
      throw new ExceptionalCaseInt("IntegerSet is empty");
    }
    int min = nums.get(0);
    for (int i : nums) {
      if (i < min) {
        min = i;
      }
    }
    return min;
  }

  /**
   * Adds an element to the set if it's not already present.
   *
   * @param element the element to add
   */
  public void add(int element) {
    if (!contains(element)) {
      nums.add(element);
    }
  }

  /**
   * Removes an element from the set.
   *
   * @param element the element to remove
   */
  public void remove(int element) {
    nums.remove(Integer.valueOf(element));
  }

  /**
   * Checks if this set is equal to another set.
   * Two sets are equal if they contain all of the same values in ANY order.
   *
   * @param obj the object to compare with
   * @return true if the sets are equal, otherwise false
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null || getClass() != obj.getClass())
      return false;
    IntegerSet that = (IntegerSet) obj;
    return this.nums.containsAll(that.nums) && that.nums.containsAll(this.nums);
  }

  /**
   * Finds the union of this set with another set.
   *
   * @param otherSet the other set
   * @return unionSet, the union of both Sets
   */
  public IntegerSet union(IntegerSet otherSet) {
    IntegerSet unionSet = new IntegerSet();
    unionSet.nums.addAll(this.nums);
    for (int element : otherSet.nums) {
      if (!this.contains(element)) {
        unionSet.add(element);
      }
    }
    return unionSet;
  }

  /**
   * Finds the intersection of this set with another set.
   *
   * @param otherSet the other set
   * @return the intersectSet, the intersection of both sets
   */
  public IntegerSet intersect(IntegerSet otherSet) {
    IntegerSet intersectSet = new IntegerSet();
    for (int element : this.nums) {
      if (otherSet.contains(element)) {
        intersectSet.add(element);
      }
    }
    return intersectSet;
  }

  /**
   * Finds the difference of this set with another set.
   *
   * @param otherSet the other set
   * @return diffSet, the difference of two Sets
   */
  public IntegerSet diff(IntegerSet otherSet) {
    IntegerSet diffSet = new IntegerSet();
    for (int element : this.nums) {
      if (!otherSet.contains(element)) {
        diffSet.add(element);
      }
    }
    return diffSet;
  }

  /**
   * Returns a string representation of the set.
   *
   * @return a string representation of the set
   */
  @Override
  public String toString() {
    return nums.toString();
  }

  /**
   * Exception thrown when an operation is performed on an empty set.
   */
  public static class ExceptionalCaseInt extends Exception {
	    /**
	     * Constructs a new IntegerSetException with the specified detail message.
	     *
	     * @param message the detail message
	     */
    public ExceptionalCaseInt(String message) {
      super(message);
    }
  }
}