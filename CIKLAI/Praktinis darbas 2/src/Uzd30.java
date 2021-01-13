import java.util.Scanner;

/**
 * Create a program that prints all whole numbers from 1 to the number the user enters.
 * Up to what number? 3
 * 1
 * 2
 * 3
 * Up to what number? 5
 * 1
 * 2
 * 3
 * 4
 * 5
 */

public class Uzd30 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        System.out.println("Up to what number: ");
        int i = reader.nextInt();
        int a = 1;

        while (a <= i) {
            System.out.println(a);
            a++;
        }
        reader.close();
    }

}
