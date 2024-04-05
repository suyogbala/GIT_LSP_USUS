package org.howard.edu.lsp.assignment5;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

@DisplayName("IntegerSet Class Test")
public class IntegerSetTest {
  
  private IntegerSet setA;
  private IntegerSet setB;
  
  @Before
  public void setUp() {
    setA = new IntegerSet();
    setB = new IntegerSet();
    
    // Adding elements to setA
    setA.add(1);
    setA.add(2);
    setA.add(3);
    
    // Adding elements to setB
    setB.add(2);
    setB.add(3);
    setB.add(4);
  }
  
  @Test
  @DisplayName("Clear Test")
  public void testClear() {
    setA.clear();
    assertEquals(0, setA.length());
    assertTrue(setA.isEmpty());
  }
  
  @Test
  @DisplayName("Length Test")
  public void testLength() {
    assertEquals(3, setA.length());
    assertEquals(3, setB.length());
  }
  
  @Test
  @DisplayName("Equals Test")
  public void testEquals() {
    assertFalse(setA.equals(setB));
    IntegerSet setC = new IntegerSet();
    setC.add(1);
    setC.add(2);
    setC.add(3);
    assertTrue(setA.equals(setC));
  }
  
  @Test
  @DisplayName("Contains Test")
  public void testContains() {
    assertTrue(setA.contains(2));
    assertFalse(setA.contains(5));
  }
  
  @Test
  @DisplayName("Largest Test")
  public void testLargest() throws IntegerSetException {
    assertEquals(3, setA.largest());
    assertEquals(4, setB.largest());
  }
  @Test(expected = IntegerSetException.class)
  @DisplayName("Largest Test Exception")
  public void testLargestEmptySet() throws IntegerSetException {
      IntegerSet set = new IntegerSet();
      set.largest(); // Should throw IntegerSetException
  }
  
  @Test
  @DisplayName("Smallest Test")
  public void testSmallest() throws IntegerSetException {
    assertEquals(1, setA.smallest());
    assertEquals(2, setB.smallest());
  }
  @Test(expected = IntegerSetException.class)
  @DisplayName("Smallest Test Exception")
  public void testSmallestEmptySet() throws IntegerSetException {
	    IntegerSet set = new IntegerSet();
	    set.smallest(); // Should throw IntegerSetException
	}
  
  @Test
  @DisplayName("Add Test")
  public void testAdd() {
    setA.add(4);
    assertTrue(setA.contains(4));
  }
  
  @Test
  @DisplayName("Remove Test")
  public void testRemove() {
    setA.remove(2);
    assertFalse(setA.contains(2));
  }
  
  @Test
  @DisplayName("Union Test")
  public void testUnion() {
    IntegerSet union = setA.union(setB);
    assertEquals(4, union.length());
    assertTrue(union.contains(1));
    assertTrue(union.contains(2));
    assertTrue(union.contains(3));
    assertTrue(union.contains(4));
  }
  
  @Test
  @DisplayName("Intersect Test")
  public void testIntersect() {
    IntegerSet intersect = setA.intersect(setB);
    assertEquals(2, intersect.length());
    assertTrue(intersect.contains(2));
    assertTrue(intersect.contains(3));
  }
  
  @Test
  @DisplayName("Diff Test")
  public void testDiff() {
    IntegerSet diff = setA.diff(setB);
    assertEquals(1, diff.length());
    assertTrue(diff.contains(1));
    assertFalse(diff.contains(2));
    assertFalse(diff.contains(3));
    assertFalse(diff.contains(4));
  }
  
  @Test
  @DisplayName("Testing")
  public void testComplement() {
    IntegerSet complement = setA.complement(setB);
    assertEquals(1, complement.length());
    assertFalse(complement.contains(1));
    assertFalse(complement.contains(2));
    assertFalse(complement.contains(3));
    assertTrue(complement.contains(4));
  }
  
  @Test
  @DisplayName("Empty Test")
  public void testIsEmpty() {
    assertFalse(setA.isEmpty());
    assertTrue(new IntegerSet().isEmpty());
  }
  
  @Test
  @DisplayName("ToString Test")
  public void testToString() {
    assertEquals("[1, 2, 3]", setA.toString());
  }
}

