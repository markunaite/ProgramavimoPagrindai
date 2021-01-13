import java.util.Scanner;

/**
 * Saldainiai. Petriukas gavo n saldainių. Kiekvieną dieną jis nori suvalgyti skirtingą skaičių
 * saldainių x. Kelias dienas Petriukas galės mėgautis saldainiais ir kiek jam dar liks nesuvalgytų
 * saldainių tuo atveju, jei paskutinei dienai saldainių nebeužtektų.
 * Pastaba: kiekvieną dieną suvalgomi saldainiai turi būti įvedinėjami atskirai, jie turi būti
 * įvedinėjami tol, kol Petriukas nebus suvalgęs visų saldainių.
 * Duomenys Rezultatai
 * Petriukas gavo saldainių: 25
 * Per dieną suvalgė: 7
 * Per dieną suvalgė: 7
 * Per dieną suvalgė: 8
 * Per dieną suvalgė: 5
 *
 * Petriukui saldainių užteks 3 dienoms
 * ir jam liks 3 saldainiai.
 */

public class Uzd3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Kiek gavo saldainiu: ");
        int kiekis = reader.nextInt();
        int sk = 0;

        while (true) {
            System.out.println("Kiek per diena suvalge? ");
            int x = reader.nextInt();
            if (kiekis < x) {
                break;
            }

            kiekis = kiekis - x;
            sk++;

        }
        System.out.println("Petriukui uzteks saldainiu " + sk + " dienoms ir jam liks " + kiekis);

    }
}
