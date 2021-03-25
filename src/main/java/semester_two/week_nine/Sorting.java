package semester_two.week_nine;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * The first sorting algorithm we will cover is the Bubble sort.  Take a series of numbers: 8 2 7 9 4 1 6 5 3;
 * Bubble sort will make a comparison between the first two elements and swaps them if necessary. Then it will
 * compare the next two values, then the next two, then the next to, and so on:
 *
 * 8 2 7 9 4 1 6 5 3
 * 2 8 7 9 4 1 6 5 3
 * 2 7 8 9 4 1 6 5 3
 * 2 7 8 4 9 1 6 5 3
 * 2 7 8 4 1 9 6 5 3
 * 2 7 8 4 1 6 9 5 3
 * 2 7 8 4 1 6 5 9 3
 * 2 7 8 4 1 6 5 3 9
 *
 * Then it will do it all over again, if we made any swaps:
 *
 * 2 7 8 4 1 6 5 3 9
 * 2 7 4 8 1 6 5 3 9
 * 2 7 4 1 8 6 5 3 9
 * 2 7 4 1 6 8 5 3 9
 * 2 7 4 1 6 5 8 3 9
 * 2 7 4 1 6 5 3 8 9
 *
 * Then again:
 *
 * 2 4 7 1 6 5 3 8 9
 * 2 4 1 7 6 5 3 8 9
 * 2 4 1 6 7 5 3 8 9
 * 2 4 1 6 5 7 3 8 9
 * 2 4 1 6 5 3 7 8 9
 *
 * Then again:
 *
 * 2 4 1 6 5 3 7 8 9
 * 2 1 4 6 5 3 7 8 9
 * 2 1 4 6 5 3 7 8 9
 * 2 1 4 5 6 3 7 8 9
 * 2 1 4 5 3 6 7 8 9
 *
 * Then again:
 *
 * 2 1 4 5 3 6 7 8 9
 * 1 2 4 5 3 6 7 8 9
 * 1 2 4 5 3 6 7 8 9
 * 1 2 4 3 5 6 7 8 9
 *
 * Then again:
 *
 * 1 2 4 3 5 6 7 8 9
 * 1 2 3 4 5 6 7 8 9
 *
 * Success! The algorithmic analysis of this sort is that the first parse will make (size - 1) comparisons,
 * decrementing with each pass through the algorithm. This is probably the worst sorting algorithm because of how
 * many comparisons it makes.
 *
 * The second sorting algorithm we will cover is the selection sort. It takes a series of numbers, compares a
 * particular value with each element in the series, memorizes the index of the lowest value, and makes one swap per
 * pass. The upside is a potential lower number of swaps but the downside is that we cannot exit early.
 *
 * @author Michael Muzzarelli
 */
public class Sorting {

    private static final int SIZE = 2000;

    public static void main(String[] args) {
        int[] values = new int[SIZE];
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File("src/main/resources/search/dataA.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Error opening the input file!");
            System.exit(0);
        }

        for (int i = 0; i < SIZE; i++) {
            values[i] = scanner.nextInt();
        }

        // print unsorted array
         System.out.println(Arrays.toString(values));

        // time the appropriate sort
        long start = System.nanoTime();
        insertionSort(values);
        long end = System.nanoTime();

        // print the sorted array and the time elapsed
        System.out.println(Arrays.toString(values));
        System.out.println("Time elapsed: " + (end - start / Math.pow(10, 9)));

        // verify the list is in sorted order
        if(isSorted(values))
            System.out.println("Sorted!");
        else
            System.out.println("Not in sorted order...");
    }

    private static boolean isSorted(int[] a) {
        for(int i=0; i<a.length-1; i++)
            if(a[i] > a[i+1])
                return false;
        return true;
    }

    public static void selectionSort(int[] a) {
        int minIndex = -1, temp = 0;

        for (int i = 0; i < a.length-1; i++) {
            minIndex = i; //assume first element is smallest
            for (int j = i + 1; j < a.length; j++)
                if (a[j] < a[minIndex])
                    minIndex = j;
            if(minIndex != i) {
                temp = a[minIndex];
                a[minIndex]= a[i];
                a[i] = temp;
            }
        }
    }

    public static void bubbleSort(int[] a) {
        boolean madeSwap = true;
        int passNumber = 0, temp = 0;

        while (madeSwap && passNumber < a.length-1) {
            madeSwap = false;

            for (int index = 0; index < a.length-passNumber-1; index++)
                if(a[index] > a[index+1]) {
                    temp = a[index];
                    a[index] = a[index+1];
                    a[index+1] = temp;
                    madeSwap = true;
                }

            passNumber++;
        }
    }

    public static void insertionSort(int[] a) {
        int temp = 0, index = -1;
        boolean indexFound = false;

        for(int i=1; i<a.length; i++) {
            index = i-1;
            temp = a[i];
            indexFound = false;

            while(!indexFound && index >= 0) {
                if(a[index] <= temp) {
                    indexFound = true;
                } else {
                    a[index + 1] = a[index];
                    index--;
                }
            }
            // if(index + 1 != i)
            a[index + 1] = temp;
        }
    }
}