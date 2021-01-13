import java.util.Scanner;

/**
 * Prieš Kalėdas miško urėdijos prekiauja įvairaus aukščio eglutėmis.
 * Į prekybos vietą atvežta n eglučių. Jų aukščiai yra e1, e2, …, en. Parašykite programą, skaičiuojančią vidutinį eglutės aukštį.
 * -----------------------------------------------------------
 * sum = sum + eglutesAukstis;
 * Kiek eglučių atvežta? 6
 * Įveskite 1 eglutės aukštį: 167
 * Įveskite 2 eglutės aukštį: 134
 * Įveskite 3 eglutės aukštį: 145
 * Įveskite 4 eglutės aukštį: 156
 * Įveskite 5 eglutės aukštį: 155
 * Įveskite 6 eglutės aukštį: 176
 * GAUTA: Eglutės aukščio vidurkis: 155.5 cm
 */


public class Uzd10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Kiek egluciu atvezta? ");
        int a = reader.nextInt();
        double viso = 0;
        double viso2 = 0;
        int d = 0;


        while (d < a) {
            System.out.println("Iveskite eglutes auksti");
            int aukstis = reader.nextInt();
            viso2 = viso2 + aukstis;
            d++;

        }

        System.out.println("Vidutinis aukstis: " + viso2 / a + " cm");

        System.out.println(" ");


        for (int c = 0; c < a; c++) {
            System.out.println("Iveskite eglutes auksti: " );
            int aukstis = reader.nextInt();
            viso = viso + aukstis;
        }

        System.out.println("Vidutinis aukstis: " + viso / a + " cm");

    }
}
