package semester_two.week_twelve;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

/**
 * Infix notation is mathematical notation; i.e., 2 + 3 * 4.
 *
 * Postfix notation, however, dictates that the operation follows the operands; i.e., 2 3 4 * +
 *
 * Prior to this, there was prefix notation (Polish notation), which dictated that the operator goes before the
 * operands; i.e., + 2 * 3 4.  One benefit of Polish notation is that it does not require parentheses and can only be
 * interpreted one way.
 *
 * Postfix examples:
 *      4 - 3 * 4 / (2 + 7)  ->  4 3 4 * 2 7 + / -
 *      8 * 2 * 3 + 4 / 2 ^ 3 - 1  ->  8 2 * 3 * 4 2 3 ^ / + 1 -
 *      2 + 3 * 4 + 5  ->  2 3 4 * + 5 +
 *      (2 + 3) * (4 + 5)  ->  2 3 + 4 5 + *
 *      2 + 3 * (4 + 5)  ->  2 3 4 5 + * +
 *      (2 + 3) * 4 + 5  ->  2 3 + 4 * 5 +
 *
 * Our algorithm to evaluate things in postfix notation is:
 *      1) If the element is a number: push it on the stack.
 *      2) If the element is an operator: pop last two operands (R, L), perform the arithmetic, and push the result.
 *      3) Last element on the stack is the "answer."
 *
 * @author Michael Muzzarelli
 */
public class PostfixNotation {

    public static int evaluate(String s) throws InputMismatchException {
        Stack<Integer> values = new Stack<>();
        Scanner input = new Scanner(s);
        String operator = null;
        int leftOp = 0, rightOp = 0;

        while (input.hasNext()) {
            if (input.hasNextInt()) {
                values.push(input.nextInt());

            } else {
                operator = input.next();

                // guarantee two elements on stack to pop
                if (values.size() < 2) {
                    throw new InputMismatchException("Illegal postfix expression!");
                }

                rightOp = values.pop().intValue();
                leftOp = values.pop().intValue();

                switch (operator) {
                    case "+": values.push(leftOp + rightOp); break;
                    case "-": values.push(leftOp - rightOp); break;
                    case "*": values.push(leftOp * rightOp); break;
                    case "/":
                        if (rightOp == 0) {
                            throw new NumberFormatException("Cannot divide by zero!");
                        }

                        values.push(leftOp / rightOp); break;
                    case "^": values.push((int) Math.pow(leftOp, rightOp)); break;
                    default: throw new InputMismatchException("Operator unrecognized!");
                }
            }
        }

        if (values.size() != 1) {
            throw new InputMismatchException("Illegal postfix exception!");
        }

        return values.peek().intValue();
    }

    public static String infixToPostfix(String s) {
        System.out.println("Expression: " + s);

        s = s.replaceAll("\\+", " + ");
        s = s.replaceAll("-", " - ");
        s = s.replaceAll("\\*", " * ");
        s = s.replaceAll("/", " / ");
        s = s.replaceAll("%", " % ");
        s = s.replaceAll("\\^", " ^ ");
        s = s.replaceAll("\\(", " ( ");
        s = s.replaceAll("\\)", " ) ");

        System.out.println("Expression with spaces: " + s);

        /* @TODO
        If element is a number, put on postfix string
        else
          if stack is empty, or (, push.
          else if ) pop and put on postfix string until find matching (
          else if prec(peek) < prec(current), push
        else pop and put on postfix string while prec(peek) >= prec(current)


        */

        return null;
    }

    private int precedenceOf(char operator) {
        int precedence = 0;

        switch (operator) {
            case '^': precedence++;
            case '/':
            case '*':
            case '%': precedence++;
            case '+':
            case '-': precedence++;
        }

        return precedence;
    }
}