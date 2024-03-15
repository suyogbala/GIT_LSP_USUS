package org.howard.edu.lsp.midterm.question2;

public interface Range {
    /**
     * Returns true if value is between the lower and upper bounds (inclusive).
     *
     * @param value the value to check
     * @return true if value is within the range, false otherwise
     */
    boolean contains(int value);

    /**
     * Returns true if the receiver contains at least one value in common with another range.
     *
     * @param other the other range to check for overlap
     * @return true if the ranges overlap, false otherwise
     */
    boolean overlaps(Range other);

    /**
     * Returns the number of integers in the range.
     *
     * @return the size of the range
     */
    int size();
    
    /**
     * Gets the lower bound of the range.
     *
     * @return the lower bound
     */
    int getLowerBound();
    
    /**
     * Gets the upper bound of the range.
     *
     * @return the upper bound
     */
    int getUpperBound();
}