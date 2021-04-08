package semester_two.week_eleven;

import java.util.Random;

public class LinkedListDemonstration {

    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        System.out.println("Size of list: " + myList.length());
        myList.print();

        // Add an element to the list
        myList.add(8);
        System.out.println("Size of list: " + myList.length());
        myList.print();

        // Add to the head of the list
        myList.add(6);
        System.out.println("Size of list: " + myList.length());
        myList.print();

        // Again, add to the head of the list
        myList.add(3);
        System.out.println("Size of list: " + myList.length());
        myList.print();

        // Add to the end of the list
        myList.add(15);
        System.out.println("Size of list: " + myList.length());
        myList.print();

        // Again, add at the end of the list
        myList.add(21);
        System.out.println("Size of list: " + myList.length());
        myList.print();

        // Add in the middle
        myList.add(10);
        System.out.println("Size of list: " + myList.length());
        myList.print();

        // Add a random set of 20 items to the list.
        Random rand = new Random();
        for(int i=0; i<20; i++)
            myList.add(rand.nextInt(25) + 1);
        System.out.println("Size of list: " + myList.length());
        myList.print();

        System.out.println(myList.get(0));
        System.out.println(myList.get(12));
        //System.out.println(myList.get(-2));
        //System.out.println(myList.get(200));

    }
}