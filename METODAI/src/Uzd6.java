import java.util.Scanner;

public class Uzd6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite kampu skaiciu: ");
        double n = reader.nextDouble();
        System.out.println("Iveskite krastine: ");
        double a = reader.nextDouble();
        System.out.printf("Pentagono plotas: %.3f", plotas(n, a));
    }

        public static double plotas(double n, double a) {
        double plotas = 0;
        plotas = (n * a * a) / (4 * Math.tan(Math.PI/n));
        return plotas;
        }
    }

