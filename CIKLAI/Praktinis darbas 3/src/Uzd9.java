import java.util.Scanner;

/**
 * Restorano vadybininkas sugalvojo surengti konkursą lankytojams, kurio metu galima laimėti marškinėlius su restorano logotipu.
 * Visi lankytojai kartu su sąskaita gauna po vieną kortelę, ant kurios parašytas sveikasis teigiamas skaičius
 * iš intervalo [a;b] (a – intervalo pradžia, b – intervalo pabaiga). Laimi tie lankytojai, kurių kortelėse
 * įrašytas skaičius dalijasi iš 6.
 * Parašykite programą, kuri apskaičiuotų, kiek marškinėlių reikia užsakyti restorano vadybininkui.
 *
 * -----------------------------------------------------------
 * Įveskite intervalo pradžią: 5
 * Įveskite intervalo pabaigą: 24
 * GAUTA: Reikalingų marškinėlių skaičius: 4
 * -----------------------------------------------------------
 * Įveskite intervalo pradžią: 31
 * Įveskite intervalo pabaigą: 62
 * GAUTA: Reikalingų marškinėlių skaičius: 5
 */

public class Uzd9 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Įveskite intervalo pradžią: ");
        int a = reader.nextInt();
        System.out.println("Įveskite intervalo pabaigą: ");
        int b = reader.nextInt();
        int count2 = 0;
        int d = a;

        while (true) {
            if (d % 6 == 0) {
                count2++;
            }
            d++;
            if (d > b) {
                System.out.println("Marskineliu skaicius: " + count2);
                break;
            }
        }
        System.out.println(" ");

        int count = 0;
        for (int c = a; c <= b; c++) {
         if (c % 6 == 0) {
              count++;
            }
         }
          System.out.println("Marskineliu skaicius: " + count);
    }
}
