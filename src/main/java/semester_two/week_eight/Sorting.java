package semester_two.week_eight;

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
 * @author Michael Muzzarelli
 */
public class Sorting {
}