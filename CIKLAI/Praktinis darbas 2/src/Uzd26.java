import java.util.Scanner;

/**
 * Create a program that reads numbers from the user and prints their sum. The program should stop
 * asking for numbers when user enters the number 0.
 * The program should work as follows:
 * 3
 * Sum now: 3
 * 2
 * Sum now: 5
 * 1
 * Sum now: 6 1
 * Sum now: 7
 * 0
 * Sum in the end: 7
 */

public class Uzd26 {
 public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    int a = reader.nextInt();
    int sum = 0;
    while (a != 0) {

        sum = sum + a;
        System.out.println("Sum now: " + sum);
        a = reader.nextInt();
    }
    System.out.println("Sum in the end: " + sum);
    reader.close();

}
}

