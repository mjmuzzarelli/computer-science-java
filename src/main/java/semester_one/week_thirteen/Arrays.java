package semester_one.week_thirteen;

import java.util.Random;

public class Arrays {

    private static final int CLASS_SIZE = 24;
    private static final int NUM_SIMULATIONS = 100;

    public static void main(String[] args) {
        // store exam ii scores of all 24 calc i students
        double[] studentScores = new double[CLASS_SIZE];

        // give students random scores
        Random rand = new Random();

        for (int i = 0; i < studentScores.length; i++) {
            studentScores[i] = rand.nextDouble() * 100;
        }

        // print the array values
        for (int i = 0; i < studentScores.length; i++) {
            System.out.println(studentScores[i]);
        }

        // find the maximum
        double max = studentScores[0];

        for (int i = 1; i < studentScores.length; i++) {
            if (studentScores[i] > max) {
                max = studentScores[i];
            }
        }

        System.out.println("Maximum = " + max);

        // find the minimum
        double min = studentScores[0];

        for (int i = 1; i < studentScores.length; i++) {
            if (studentScores[i] < min) {
                min = studentScores[i];
            }
        }

        System.out.println("Minimum = " + min);

        // print the average
        int sum = 0;

        for (int i = 0; i < studentScores.length; i++) {
            sum += studentScores[i];
        }

        System.out.println("Average = " + sum / studentScores.length);

        // simulate finding the average of 24 student scores 100 times to see
        // the average of the averages
        double simSum = 0, avgSum = 0;

        for (int i = 1; i < studentScores.length; i++) {
            for (int j = 0; j < studentScores.length; j++) {
                studentScores[i] = rand.nextDouble() * 100;
            }

            simSum = 0;

            for (int j = 0; j < studentScores.length; j++) {
                simSum += studentScores[j];
            }

            avgSum += simSum / studentScores.length;
        }

        System.out.println("Average of " + NUM_SIMULATIONS + " averages is "
                + avgSum / NUM_SIMULATIONS);
    }
}