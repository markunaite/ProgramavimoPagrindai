import java.util.Scanner;

/**
 * Parašykite programą, kuri atspausdintų Jūsų vardą n kartų.
 * ----------------------------------------------------------- Įvesta: 3
 * Gauta: Vardas Vardas Vardas
 */


public class Uzd6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Ivesta: ");
        int a = reader.nextInt();
        String vardas = "Ieva";
        int count = 0;


        while (true) {
            if (count == a) {
                break;
            }
            System.out.print(" " + vardas + " ");
            count++;

        }
        System.out.println(" ");

        for (int i = 0; i < a; ++i) {
            System.out.print(" " + vardas + " ");
       }

    }
}
