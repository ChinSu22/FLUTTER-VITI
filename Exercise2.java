package StringAssignments1;

import java.util.Scanner;

/*
2. Write a Java program to compare two
strings lexicographically, ignoring case
differences.
 */
public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1;
        String str2;
        System.out.print("Enter the first String (String 1) : ");
        str1 = sc.next();
        System.out.print("Enter the second String (String 2) : ");
        str2 = sc.next();
        System.out.println(" ");
        CompareTwoStringsIgnoreCase(str1, str2);

    }

    public static void CompareTwoStringsIgnoreCase(String st1, String st2) {
        int result;
        result = st1.compareToIgnoreCase(st2);
        if (result == 0) {
            System.out.printf("%s is equal to %s", st1, st2);
        } else if (result > 0) {
            System.out.printf("%s is greater than %s", st1, st2);
        } else {
            System.out.printf("%s is less than %s", st1, st2);
        }
    }
}
