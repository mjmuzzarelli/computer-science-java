package semester_two.week_twelve;

public class PostfixNotationDemonstration {

    public static void main(String[] args) {
        String expA = "13 4 5 * + 8 2 / -",
                expB = "4 5 - 3 * 2 3 ^ + 11 +",
                expC = "2 3 * 2 ^ 10 24 5 6 1 + * - * +",
                expD = "-2 3 - -4 * -1 + 1 +";
        // Answers: 29, 16, -74

        System.out.println(PostfixNotation.evaluate(expA));
        System.out.println(PostfixNotation.evaluate(expB));
        System.out.println(PostfixNotation.evaluate(expC));
        System.out.println(PostfixNotation.evaluate(expD));
        System.out.println(PostfixNotation.evaluate("2 -3 ^"));
        //System.out.println(PostfixNotation.evaluate("3 0 /"));
        System.out.println(PostfixNotation.evaluate("0 0 + 0 - 0 *"));
        System.out.println(PostfixNotation.evaluate("4 0 ^"));
        //System.out.println(PostfixNotation.evaluate("2 3 4 *"));
        //System.out.println(PostfixNotation.evaluate("2 + 3"));
        //System.out.println(PostfixNotation.evaluate("2 -3"));
        System.out.println(PostfixNotation.evaluate("5 3 %"));

        //
        //@TODO: Add Modulus operator to evaluate()
    }
}