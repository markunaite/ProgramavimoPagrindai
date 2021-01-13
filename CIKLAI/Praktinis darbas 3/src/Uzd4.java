import java.util.Scanner;

/**
 * Parašykite programą, kuri atspausdintų tik tiek skaičių, pradedant nuo 1, iki Jūsų įvesto.
 * -----------------------------------------------------------
 * Įvesta: 7
 * Gauta: 1 2 3 4 5 6 7
 */

public class Uzd4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Ivesta: ");
        int a = reader.nextInt();
        int b = 1;

        while (b <= a) {
            System.out.print(" " + b + "");
            b++;
        }

        System.out.println(" ");

        for (int c = 1; c <= a ; c++) {
            System.out.print(" " + c + "");
        }
    }
}
