import java.util.Scanner;

public class Uzd3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Kiek snaigiu nukrito per pirmaja sekunde: ");
        int a = reader.nextInt();
        System.out.println("Kiek sekundziu snigo: ");
        int b = reader.nextInt();
        int c = a;

        for (int s = 1; s < b; s++) {

            a = a * 2;
            c = c + a;
        }
        System.out.println("Rezultatas: " + c);
    }
}
