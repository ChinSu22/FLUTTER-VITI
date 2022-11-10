package StringAssignments1;

import java.util.Calendar;

/*
4. Write a Java program to print current
date and time in the specified format.
 */
public class Exercise4 {
    public static void main(String[] args) {
        PrintCurrentDateAndTime();
    }

    public static void PrintCurrentDateAndTime() {
        Calendar dat = Calendar.getInstance();
        System.out.println("Current Date and Time: ");
        System.out.format("%tB %te,%tY%n", dat, dat, dat);
        System.out.format("%tl:%tM %tp%n", dat, dat, dat);
    }
}
