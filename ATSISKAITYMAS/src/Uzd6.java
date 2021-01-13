import java.util.Scanner;

public class Uzd6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite pirma skaiciu: ");
        int a = reader.nextInt();
        System.out.println("Iveskite antra skaiciu: ");
        int b = reader.nextInt();
        System.out.println("Iveskite trecia skaiciu: ");
        int c = reader.nextInt();

        if (a < b && a < c) {
            System.out.println("Gauta: " + a);

        } else if (b < a && b < c) {
            System.out.println("Gauta: " + b);
        } else {
            System.out.println("Gauta: " + c);
        }

        reader.close();
    }
}
