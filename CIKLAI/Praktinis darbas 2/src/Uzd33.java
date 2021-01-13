import java.util.Scanner;

/**
 * Similar to the previous exercise, except that the program should ask for both the lower and upper
 * bound. You can assume that the users first gives the smaller number and then the greater number.
 * Example outputs:
 * First: 3
 * Last: 5
 * The sum 12
 * First: 2
 * Last: 8
 * The sum is 35
 */

public class Uzd33 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Pirmas skaicius");
        int a = reader.nextInt();
        System.out.println("Paskutinis skaicius");
        int b = reader.nextInt();
        int suma = 0;

        while (a <= b) {
            System.out.println(a);
            a++;
        }
    }
}
