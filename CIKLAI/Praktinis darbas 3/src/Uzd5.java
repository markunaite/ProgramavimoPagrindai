import java.util.Scanner;

/**
 * Parašykite programą, kuri atspausdintų skaičius iš jūsų nurodyto intervalo [a, b].
 * ----------------------------------------------------------- Įvesta: 5 ir 10
 * Gauta: 5 6 7 8 9 10
 */


public class Uzd5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Nuo: ");
        int a = reader.nextInt();
        System.out.println("Iki: ");
        int b = reader.nextInt();
        int c = a;


        while (true) {

            System.out.print(" " + a + " ");
            a++;

        if( a > b ) {
                break;
            }
        }

       System.out.println(" ");
       for (; c <= b; c++ ) {
            System.out.print(" " + c + " ");
        }
    }
}

