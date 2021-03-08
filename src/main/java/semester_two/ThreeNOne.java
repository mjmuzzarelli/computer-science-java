package semester_two;

import java.util.Scanner;

public class ThreeNOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;
        String n = "";

        while (shouldContinue) {
            n = scanner.next();

            try {
                int num = Integer.parseInt(n);

                if (num > 0) {
                    System.out.println("success");
                    shouldContinue = false;
                } else if (num <= 0) {
                    System.out.println("try again");
                }
            } catch (NumberFormatException e) {
                System.out.println("try again x2");
            }
        }
    }
}