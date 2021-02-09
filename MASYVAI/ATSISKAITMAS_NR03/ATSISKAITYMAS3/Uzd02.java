package ATSISKAITYMAS3;

import java.util.Random;
import java.util.Scanner;

public class Uzd02 {

    static double getDistance(int x1, int y1, int x2, int y2) {
        return (Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1))); //formule, kuri suranda atstuma tarp dvieju tasku
    }

    private static int getPoints(int x0, int y0) { // metodas pagal kuri paskaiciuoja taskus
        double atstumas = getDistance(0, 0, x0, y0);
        if (atstumas <= 5) {
            return 10;
        } else if (atstumas >= 6 && atstumas <= 10) {
            return 5;
        } else {
            return 0;
        }
    }

    private static int randomNumber(int pradzia, int pabaiga) {
        return new Random().nextInt(pabaiga - pradzia) + pradzia;
    }

    private static int sum(int[] a) {
        int sum = 0;
        for (int j : a) {
            sum = sum + j;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int x = 5;
        int y = 4;

        System.out.println("Tasku gauta po sovimo: " + getPoints(x, y));

        System.out.println("Kiek kartu sove: ");
        int n = reader.nextInt();
        int[] arrX = new int[n];
        int[] arrY = new int[n];

        for(int i = 0; i < n; i++) { //pagal duota n skaiciu prisikiria kiekvienam suviui atsistiktines koordinates
            arrX[i] = randomNumber(0, 11);
            arrY[i] = randomNumber(0, 11);
        }

        int[] taskai = new int[n];
        for(int i = 0; i < n; i++) {
            taskai[i] = getPoints(arrX[i], arrY[i]);

        }
        int visoTasku = sum(taskai);
        System.out.println("Is viso tasku: " + visoTasku);
    }
}
