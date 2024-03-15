package org.howard.edu.lsp.midterm.question2;

public class IntegerRange implements Range {
    private final int lowerBound;
    private final int upperBound;

    public IntegerRange(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    @Override
    public boolean contains(int value) {
        return value >= getLowerBound() && value <= getUpperBound();
    }

    @Override
    public boolean overlaps(Range other) {
        return this.contains(other.getLowerBound()) || this.contains(other.getUpperBound())
                || other.contains(this.getLowerBound()) || other.contains(this.getUpperBound());
    }

    @Override
    public int size() {
        return Math.abs(upperBound - lowerBound) + 1;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        IntegerRange other = (IntegerRange) obj;
        return lowerBound == other.lowerBound && upperBound == other.upperBound;
    }

    @Override
    public int getLowerBound() {
        return lowerBound;
    }

    @Override
    public int getUpperBound() {
        return upperBound;
    }
}