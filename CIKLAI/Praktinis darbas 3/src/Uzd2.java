/**
 * Parašykite programą, kuri atspausdintų visus vienaženklius skaičius pakeltus kvadratu. Parašykite su ciklu while ir for.
 * -----------------------------------------------------------
 * Gauta:
 * 0 – 0;
 * 1 – 1;
 * 2 – 4;
 * ...
 * 9 – 81;
 */

public class Uzd2 {
    public static void main(String[] args) {
        int a = 0;
        int daugyba;

        while (a <= 9) {
           daugyba = a * a;
            System.out.println("Gauta: " + a + "-"  + daugyba );
            a++;
        }

        System.out.println(" ");

        for (int b = 0; b <= 9; b++) {
            daugyba = b * b;
            System.out.println("Gauta: " + b + "-"  + daugyba );
        }
    }
}
