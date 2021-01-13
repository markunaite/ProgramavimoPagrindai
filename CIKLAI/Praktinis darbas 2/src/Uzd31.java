import java.util.Scanner;

/**
 * Create a program that asks the user for the first number and the last number and then prints all numbers
 * between those two.
 * First: 5
 * Last: 8
 * 5
 * 6
 * 7
 * 8
 *
 * If the first number is greater than the last number, the program prints nothing:
 * First: 16
 * Last: 12
 */

public class Uzd31 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type 4 numbers: ");
        int i = reader.nextInt();
        int k = reader.nextInt();
        int j = reader.nextInt();
        int l = reader.nextInt();


            if (i < k && i < j && i < l) {
                System.out.println("First" + i);
            } else if (k < i &&  k < j && k < l ) {
                System.out.println("First" + k);
            } else if (j < i && j < k && j < l) {
                System.out.println("First" + j);
            } else if (l < i && l < k && l < j) {
                System.out.println("First " + l);
            } else if (i > k && i > j && i > l ) {
                System.out.println("Highest " + i);
            } else if (k > i &&  k > j && k > l ) {
                System.out.println("Highest " + k);
            } else if (j > i && j > k && j > l) {
                System.out.println("Highest" + j);
            } else {
                System.out.println("Highest " + l);
            }
    }
}
