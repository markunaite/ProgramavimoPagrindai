import java.util.Scanner;

/**
 * Create a program that asks the user for three numbers and then prints their sum. Use the following
 * structure in your program:
 * Type the first number: 3
 * Type the second number: 6
 * Type the third number: 12
 */

public class Uzd25 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the first number: ");
        int a = reader.nextInt();
        System.out.println("Type the second number: ");
        int b = reader.nextInt();
        System.out.println("Type the third number: ");
        int c = reader.nextInt();

        int sum = a + b + c;

        System.out.println("Sum " + sum);
    }
}
