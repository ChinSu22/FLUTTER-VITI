package StringAssignments1;

/*
1. Write a Java program to get the character
at the given index within the String :
Sample Output:
Original String = Java Exercises!
The character at position 0 is J
The character at position 10 is i
 */
public class Exercise1 {
    public static void main(String[] args) {
        String str = "Java Exercises!";
        System.out.printf("Original String = %s", str + "\n");
        GetCharacter(str);
    }
    public static void GetCharacter(String a) {
        char character1 = a.charAt(0);
        char character2 = a.charAt(10);
        System.out.printf("The Character at position 0 is %s \n", character1);
        System.out.printf("The Character at position 10 is %s", character2);
    }
}
