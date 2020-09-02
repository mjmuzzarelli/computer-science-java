package semester_one.week_three;

/**
 * There are a number of operators available including arithmetic,
 * relational, unary, and logical, among others.
 *
 * Arithmetic operators:
 *      + addition
 *      - subtraction
 *      * multiplication
 *      / division, which falls into two categories:
 *          - real division: when either operand is real (double or float)
 *          - integer division: when both operators are integers, standard,
 *            bound within integers because of how bits are formed
 *      % modulus, which keeps within a restricted set of domain values
 *          - 10 % 8, consider all of the values of 8 that are in 10 and what
 *                    is left over
 *            10 % 8 = 2
 *          - 80 % 6 = 2
 *
 * Relational operators:
 *      > greater than
 *      < less than
 *      >= greater than or equal to
 *      <= less than or equal to
 *      == equal to
 *      != not equal to
 *
 * Unary operators:
 *      ++ post- or pre-increment operator, x++ or ++x
 *      -- post- or pre-decrement operator, x-- or --x
 *      - negative, retrieve the negative value of (-B)
 *      + positive, retrieve the positive value of (+B)
 *
 * Logical operators:
 *      && and
 *      || or
 *      ! not
 *      ^ exclusive or, only one is true
 */
public class Operators {

    public static void main(String[] args) {
        int x = 5, y = 2, z = 12;

        System.out.println("Arithmetic operators:");
        System.out.println(x + y);
        System.out.println(x - z);
        System.out.println(x * z);
        System.out.println(z / x);
        System.out.println(z / y);

        System.out.println("Real division of x and y:");
        System.out.println((double) z / (double) x); // typecasting
        System.out.println((double) z / x); // mixed mode expression
        System.out.println(z / (double) x);
        System.out.println((double) (z / x));

        System.out.println("Modulus operators:");
        System.out.println(z % x);
        System.out.println(x % z);
        System.out.println(x % y);
        System.out.println((5 * z) % (y + 1));

        System.out.println("Relational operators:");
        System.out.println(z < x);
        System.out.println(x <= x);
        System.out.println(y >= 0);
        System.out.println(z + 10 > 6*x);
        System.out.println(y != x);
        System.out.println(3*y == x+1);
    }
}