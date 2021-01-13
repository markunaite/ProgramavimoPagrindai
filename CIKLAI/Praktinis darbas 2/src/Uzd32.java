import java.util.Scanner;

/**
 * Create a program that calculates the sum 1+2+3+...+n where n is a number entered by the user.
 * Example outputs:
 * Until what? 3
 * Sum is 6
 *
 * The calculation above was: 1+2+3 = 6.
 * Until what? 7
 * Sum is 28
 * The calculation above was: 1+2+3+4+5+6+7 = 28.
 */

public class Uzd32 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iki kiek: ");
        int a = reader.nextInt();
        int pradzia = 1;
        int suma = 0;

        while (pradzia <= a) {
            suma = suma + pradzia;
            pradzia++;
        }
        System.out.println("Suma:  " + suma);
    }
}
