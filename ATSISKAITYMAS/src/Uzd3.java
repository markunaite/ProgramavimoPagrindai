import java.util.Scanner;

public class Uzd3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite skaiciu: ");
        int x = reader.nextInt();
        double y = 16 * Math.pow(x, 4) + 2 * x;

        System.out.println("Gauta: y= " + y);

        reader.close();
    }
}
