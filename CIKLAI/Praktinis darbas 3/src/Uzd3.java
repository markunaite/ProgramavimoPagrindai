/**
 *Parašykite programą, kuri atspausdintų visus dviženklius lyginius skaičius. Parašykite su ciklu while ir for.
 * -----------------------------------------------------------
 * Gauta: 10 12 14 ... 98
 */

public class Uzd3 {
    public static void main(String[] args) {
       int a = 10;

       while (a < 100) {
           if (a % 2 == 0) {
               System.out.print(" " + a + " ");
           }
           a++;
       }

        System.out.println(" ");

       for (int b= 10; b < 100; b++) {
           if (b % 2 == 0) {
           System.out.print(" " + b + " ");

           }
       }
    }
}
