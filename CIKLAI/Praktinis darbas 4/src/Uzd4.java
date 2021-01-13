import java.util.Scanner;

/**
 * 4. Knyga. Tadas mėgsta skaityti knygas, tačiau jam labai sunku pradėti skaityti. Knygoje yra m
 * skyrių Pirmą dieną Tadas perskaitė 1 skyrių, antrą – 2, trečią – 3 ir t.t. Kiekvieną kitą dieną jis
 * perskaito vienu skyriumi daugiau, negu prieš tai buvusią dieną. Programa turi apskaičiuoti, per
 * kelias dienas d Tadas perskaitys visą knygą ir kelis skyrius s vidutiniškai per dieną perskaito
 * Tadas. Paskutinei dienai gali likti mažiau skyrių.
 * Duomenys Rezultatai
 * Įveskite knygos skyrių
 * skaičių: 8
 *
 * Tadas visą knygą perskaitys per 4 dienas (-ų).
 * Tadas vidutiniškai per dieną perskaitė 2 skyrius
 * (-ų).
 * Įveskite knygos skyrių
 * skaičių: 17
 *
 * Tadas visą knygą perskaitys per 6 dienas (-ų).
 * Tadas vidutiniškai per dieną perskaitė 2.83
 * skyrius (-ų).
 */

public class Uzd4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Kiek knygoje skyriu: ");
        double isviso = reader.nextDouble();
        double laikinas = isviso;
        int dienos = 0;
        int skyriai = 0;
        double vid;

        while (true) {

            skyriai = skyriai + 1;
            laikinas = laikinas - skyriai;

            dienos++;
            if (laikinas <= 0) {
                break;
            }

        }
        vid = isviso / dienos;
        System.out.println("Tadas visa knyga perskaite per " + dienos + " dienu. Vidutiniskai perskaityta " + vid + " skyriu");
    }
}
