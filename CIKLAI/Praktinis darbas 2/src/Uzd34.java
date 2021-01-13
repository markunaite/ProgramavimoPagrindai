import java.util.Scanner;

/**
 * Create a program that calculates the factorial of the number n. The factorial n! is calculated using the
 * formula 1*2*3*...*n. For example 4! = 1*2*3*4 = 24. Additionally, it is defined that 0! = 1.
 * Example outputs:
 * Type a number: 3
 * Factorial is 6
 * Type a number: 10
 * Factorial is 3628800
 */

public class Uzd34 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int a = reader.nextInt();
        int fakt = 1;

        while (a >= 1) {
            fakt = fakt * a;
            a--;
        }
        System.out.println("The factorial is " + fakt);
    }
}
