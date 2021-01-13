import java.util.Scanner;

/**
 * Šeima išsirengė į kelionę automobiliu. Jie pripildė kuro baką, kurio talpa t litrų ir
 * nusprendė važiuoti tol, kol bake bus degalų. Lyginėmis kelionės dienomis automobilis suvartos n
 * litrų degalų, o nelyginėmis - 2n litrų. Parašykite programą, kuri surastų, kiek dienų truks šeimos
 * kelionė.
 * Duomenys Rezultatai
 * Įveskite kuro bako talpą: 20
 * Įveskite kuro sąnaudas n: 5
 *
 * Keliauti bus galima 3 dienų/(as)/(ą).
 *
 * Įveskite kuro bako talpą: 112
 * Įveskite kuro sąnaudas n: 11
 *
 * Keliauti bus galima 7 dienų/(as)/(ą).
 */

public class Uzd2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite kuro bako dydi: ");
        int talpa = reader.nextInt();
        System.out.println("Iveskite kuro sanaudas: ");
        int n = reader.nextInt();
        int sk = 0;

        while (true) {
            if (sk % 2 == 0) {
                talpa = talpa - 2 * n;
            } else {
                talpa = talpa - n;
            }
            sk++;
            if (talpa <= 0) {
                break;
            }
        }
        System.out.println("Keliauti bus galima  " + sk + " dienas");
    }
}
