import java.util.Scanner;

public class Uzd5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite 1 trikampio krastine: ");
        double a = reader.nextDouble();
        System.out.println("Iveskite 2 trikampio krastine: ");
        double b = reader.nextDouble();
        System.out.println("Iveskite 3 trikampio krastine: ");
        double c = reader.nextDouble();
        System.out.printf("Trikampio plotas:%.2f ",  suma(a, b, c));

    }
        public static double suma(double a, double b, double c) {
        double plotas = 0;
        double p =(a + b +c ) / 2;
        plotas = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return plotas;
    }
}
