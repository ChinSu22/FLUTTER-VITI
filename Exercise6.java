package StringAssignments1;

import java.util.Locale;
import java.util.Scanner;

/*
6. Write a Java program to convert all the
characters in a string to uppercase
 */
public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Enter String: ");
        str = sc.next();
        ConvertToUppercase(str);
    }

    public static void ConvertToUppercase(String st) {
        String st1 = st.toUpperCase();
        System.out.printf("Original String: %s", st);
        System.out.printf("\n" + "String in uppercase: %s", st1);
    }
}
