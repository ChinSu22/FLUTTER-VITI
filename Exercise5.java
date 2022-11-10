package StringAssignments1;

import java.util.Locale;
import java.util.Scanner;

/*
5. Write a Java program to convert all the
characters in a string to lowercase
 */
public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Enter String: ");
        str = sc.next();
        ConvertToLowercase(str);
    }

    public static void ConvertToLowercase(String st) {
        String st2 = st.toLowerCase();
        System.out.printf("Original String: %s", st);
        System.out.printf("\n" + "String in lowercase: %s", st2);
    }
}
