/**
 * Parašykite programą, kuri atspausdintų visus vienaženklius skaičius. Parašykite su ciklu while ir for.
 * -----------------------------------------------------------
 * Gauta: 0 1 2 3 4 5 6 7 8 9
 */

public class Uzd1 {
    public static void main(String[] args) {

        int a = 0;

        while (a <= 9) {
            System.out.print(a);
            a++;
        }
        System.out.println(" ");
        for (int b = 0; b < 10; b++) {
            System.out.print(b);
        }
    }
}


