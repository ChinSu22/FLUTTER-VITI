package StringAssignments1;

import java.util.Scanner;

/*
1.1 Write a Java program to get the character
at the given index within the String :
Sample Output:
Original String = Java Exercises!
The character at position 0 is J
The character at position 10 is i
***Take two position from the user!!!
 */
public class Exercise1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Java Exercises!";
        int a;
        int b;
        int length;
        length = str.length();
        System.out.printf("Original String = %s", str + "\n");
        do {
            System.out.print("Enter the position of a character you want to get in given String: ");
            a = sc.nextInt();
        } while (!(a <= length - 1 && a >= 0));

        do {
            System.out.print("Enter next position: ");
            b = sc.nextInt();
        } while (!(b <= length - 1 && b >= 0));
        GetCharacter(str, a, b);
    }

    public static void GetCharacter(String str, int x, int y) {
        char character1 = str.charAt(x);
        char character2 = str.charAt(y);
        System.out.printf("The character of position %d is %s", x, character1 + "\n");
        System.out.printf("The character of position %d is %s", y, character2);
    }
}
