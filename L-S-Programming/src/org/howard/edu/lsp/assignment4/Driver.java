package org.howard.edu.lsp.assignment4;

/**
 * A class to test the functionality of the IntegerSet class.
 */
public class Driver {
    // Creating IntegerSet objects
  IntegerSet set1 = new IntegerSet();
  IntegerSet set2 = new IntegerSet();
  IntegerSet set4 = new IntegerSet();
  
/**
 * 
 * @param args, main function, entry point in the program
 */
  public static void main(String[] args) {
	  Driver testObject = new Driver();
	  testObject.testingFunc();

  }
  
  /**
   * private Testing Function to test all APIs in IntegerSet Class
   */
  private void testingFunc() {
	    // Adding elements to set1 and simultaneous testing clear
	    set1.add(1);
	    System.out.println(set1.toString()); 
	    set1.clear();
	    System.out.println(set1.toString()); 
	    set1.add(12);
	    set1.add(13);
	    set1.add(22);
	    System.out.println(set1.toString());    

	    // Adding elements to set2
	    set2.add(4);
	    set2.add(6);
	    set2.add(7);

	    // Testing methods
	    System.out.println("Set 1: " + set1.toString());
	    System.out.println("Set 2: " + set2.toString());

	    System.out.println("The length is set 1: " + set1.length());
	    System.out.println("Is set 1 empty? " + set1.isEmpty());

	    System.out.println("Does set 1 have 13? " + set1.contains(13));
	    System.out.println("Does set 1 have 4? " + set1.contains(4));
	    
	    try {
	      System.out.println("The largest element in set 4: " + set4.largest());
	    } catch (IntegerSet.ExceptionalCaseInt e){
	      System.out.println(e.getMessage());
	    }

	    try {
	      System.out.println("The largest element in set 1: " + set1.largest());
	      System.out.println("The smallest element in set 1: " + set1.smallest());
	    } catch (IntegerSet.ExceptionalCaseInt e) {
	      System.out.println(e.getMessage());
	    }

	    System.out.println("The difference of set 1 and set 2: " + set1.diff(set2));
	    System.out.println("The difference of set 2 and set 1: " + set2.diff(set1));
	    System.out.println("The intersection of set 1 and set 2: " + set1.intersect(set2));
	    System.out.println("The union of set 1 and set 2: " + set1.union(set2));

	    // Removing elements from set1
	    set1.remove(12);
	    System.out.println("Set 1 after removing element 12: " + set1);

	    // Testing equals method
	    IntegerSet set3 = new IntegerSet();
	    set3.add(2);
	    set3.add(3);
	    System.out.println("Is set 1 equal to set 3? " + set1.equals(set3));
	    System.out.println("Is set 1 equal to set 2? " + set1.equals(set2));
  }
}