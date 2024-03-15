package org.howard.edu.lsp.midterm.question2;

public class RangeTester {
    public static void main(String[] args) {
        // Test IntegerRange
        IntegerRange range1 = new IntegerRange(2, 19);
        IntegerRange range2 = new IntegerRange(3, 21);
        IntegerRange range3 = new IntegerRange(14, 25);

        System.out.println("Range 1 size: " + range1.size());
        System.out.println("Range 2 size: " + range2.size());
        System.out.println("Range 3 size: " + range3.size());

        System.out.println("Range 1 contains 1: " + range1.contains(1));
        System.out.println("Range 2 contains 4: " + range2.contains(4));
        System.out.println("Range 3 contains 14: " + range3.contains(14));

        System.out.println("Range 1 overlaps with Range 2: " + range1.overlaps(range2));
        System.out.println("Range 1 overlaps with Range 3: " + range1.overlaps(range3));

        // Test equals method
        IntegerRange range4 = new IntegerRange(2, 19);
        System.out.println("Range 1 equals Range 4: " + range1.equals(range4));
    }
}