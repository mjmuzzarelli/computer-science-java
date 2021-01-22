package semester_two.week_one;

import java.util.Random;

public class ComplexTest {

    public static void main(String[] args) {
        Complex c = new Complex(3, 4),
                d = new Complex(3),
                e = new Complex(),
                f = new Complex(3, 4);

        System.out.println(c.toString());
        System.out.println(d.toString());
        System.out.println(e.toString());
        System.out.println(f.toString());
        System.out.println(c.equals(f));

        // construct an array of 20 complex numbers
        Complex[] nums = new Complex[20];
        Random rand = new Random();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = new Complex(rand.nextInt(7) - 3, rand.nextInt(7) - 3);
        }

        for (Complex num : nums) {
            System.out.print(num + " ");
        }
    }
}