package StringAssignments1;

import java.util.Scanner;

/*
3. Write a Java program to concatenate a
given string to the end of another
string.
 */
public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1;
        String str2;
        System.out.print("Enter the first String (String 1): ");
        str1 = sc.next();
        System.out.print("Enter the second String (String 2): ");
        str2 = sc.next();
        ConcatenateTwoStrings(str1, str2);
    }

    public static void ConcatenateTwoStrings(String st1, String st2) {
        String str3;
        st1 = st1 + " ";
        str3 = st1.concat(st2);
        System.out.printf("The Concatenated String: %s", str3);
    }
}
