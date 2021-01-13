/**
 * Parašykite programą, skaičiuojančią funkcijos y = 7x2 + 5x – 3 reikšmes, kai x kinta [-10; 10].
 * ----------------------------------------------------------- Gauta:
 * Kai x = -10, tai y = 647
 * Kai x = -9, tai y = 519
 * ...
 * Kai x = 10, tai y = 747
 */


public class Uzd8 {
    public static void main(String[] args) {

       int a = -10;
       int i;

       while (a <= 10) {

           i = 7 * (a * a) + 5 * a - 3;
           System.out.println("Kai a = " + a + ", tai i = " + i);
           a++;

       }

        System.out.println(" ");

       for (int x = -10; x <= 10; x++) {
          int y = 7 * (x * x) + 5 * x - 3;
          System.out.println("Kai x = " + x + ", tai y = " + y);
       }
    }
}
