package semester_one.week_ten;

/**
 * Fraction class allows programmers to use fractions, like 1/3.
 */
public class Fraction {

    private int numerator, denominator;

    // constructors
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this.numerator = 1;
        this.denominator = 9;
    }

    // accessors (getters)

    // mutators (setters)

    // functionality
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}