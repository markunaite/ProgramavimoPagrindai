import java.util.Scanner;

/**
 * Parašykite programą, kuri atspausdintų įvesto skaičiaus daugybos lentelę nuo 1 iki 9.
 * ----------------------------------------------------------- Įvesta: 2
 * Gauta:
 * 2 * 1 = 2
 * 2 * 2 = 4
 * ...
 * 2 * 9 = 18
 */

public class Uzd7 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite skaiciu: ");
        int a = reader.nextInt();
        int c = 1;
        int ats2;

        while (c <= 10) {
            ats2 = a * c;
            System.out.println(a + " * " + c + " = " + ats2);
            c++;
        }

        System.out.println(" ");

       for (int b = 1; b <= 10; b++) {
           int ats = b * a;
          System.out.println( a + " * " + b + " = " + ats);

       }
    }
}
