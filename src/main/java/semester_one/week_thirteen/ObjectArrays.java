package semester_one.week_thirteen;

import semester_one.week_ten.Fraction;

import java.util.Random;

public class ObjectArrays {

    public static void main(String[] args) {
        Random random = new Random();

        Fraction[] ratio = new Fraction[30];

        for (int i = 0; i < ratio.length; i++) {
            ratio[i] = new Fraction(random.nextInt(100), random.nextInt(100));
        }

        for (Fraction f : ratio) {
            System.out.println(f + " ");
        }
    }
}