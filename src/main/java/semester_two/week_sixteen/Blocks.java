package semester_two.week_sixteen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Blocks {

    private static int count;
    private static int a, b;
    private static int[] position;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));

        count = Integer.parseInt(scanner.nextLine());

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if (line.equalsIgnoreCase("quit")) {
                System.exit(0);
            }

            String[] components = line.split(" ");

            String firstOperation = components[0];
            a = Integer.parseInt(components[1]);
            String secondOperation = components[2];
            b = Integer.parseInt(components[3]);

            if (a == b) {
                throw new IllegalArgumentException("Illegal command!");
            }

            if (firstOperation.equalsIgnoreCase("move")) {
                if (secondOperation.equalsIgnoreCase("onto")) {
                    //moveOnto

                } else if (secondOperation.equalsIgnoreCase("over")) {
                    //moveOver
                }

            } else if (firstOperation.equalsIgnoreCase("pile")) {
                if (secondOperation.equalsIgnoreCase("onto")) {
                    //pileOnto

                } else if (secondOperation.equalsIgnoreCase("over")) {
                    //pileOver
                }
            }
        }
    }
}