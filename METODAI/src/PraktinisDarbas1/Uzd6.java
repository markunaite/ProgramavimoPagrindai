package PraktinisDarbas1;

import java.util.Scanner;

public class Uzd6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite kampu skaiciu: ");
        double n = reader.nextDouble();
        System.out.println("Iveskite krastine: ");
        double a = reader.nextDouble();
        System.out.printf("Pentagono plotas: %.3f", apskaiciuotiPlota(n, a));
    }

        public static double apskaiciuotiPlota(double n, double a) {
        double plotas = (n * a * a) / (4 * Math.tan(Math.PI/n));
        return plotas;
        }
    }

