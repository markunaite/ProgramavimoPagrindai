import java.util.Scanner;

/**
 *
 */

public class Uzd6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("suma - 1, atimtis - 2, daugyba - 3, didžiausia reikšmė sraute - 4, mažiausia reikšmė sraute - 5.");
        int a;

        System.out.println("Irasykite skaicius: ");
        while (true) {
            a = reader.nextInt();
            if (a == 0) {
                System.out.println(" ");
                break;
            }
        }
    }
}
