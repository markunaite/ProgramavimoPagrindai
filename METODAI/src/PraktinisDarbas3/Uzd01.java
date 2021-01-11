package PraktinisDarbas3;

import java.util.Scanner;

public class Uzd01 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int p = 0, s = 0, m = 0;
        String tara;
        System.out.println("Imeskite pakuotes: ");
        while (true) {
            tara = reader.nextLine();
            if (tara.equals("0")) {
                break;
            }
            switch (tara) {
                case "p":
                    p++;
                    break;
                case "s":
                    s++;
                    break;
                case "m":
                    m++;
                    break;
                default:
                    System.out.println("Netinkama tara");
                    break;
            }
        }
        printInfo(m, s, p);
        printTotal(m, s, p);
        printMax(m, s, p);

    }

    private static void printMax(int m, int s, int p) {
        int max=Math.max(m, Math.max(s, p));
        if (m == max) {
            System.out.println("Metaliniu pakuociu daugiausia");
        } else if (s == max) {
            System.out.println("Stikliniu pakuociu daugiausia");
        } else {
            System.out.println("Plastikiniu pakuociu daugiausia");
        }
    }

    private static void printTotal(double m, double s, double p) {
        double suma = (m + s + p) * 0.10;

        System.out.printf("Is viso suma: %2f",  suma);
        System.out.println(" ");
    }

    private static void printInfo(int m, int s, int p) {
        System.out.println("Metaliniu pakuociu: " + m);
        System.out.println("Stikliniu pakuociu: " + s);
        System.out.println("Plastikiniu pakuociu: " + p);
    }
}
