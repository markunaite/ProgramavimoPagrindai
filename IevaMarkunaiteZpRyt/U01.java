import java.util.Scanner;

public class U01 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Kiek pamoku pirmadieni?");
        int a = reader.nextInt();
        System.out.println("Kiek pamoku antradieni?");
        int b = reader.nextInt();
        System.out.println("Kiek pamoku treciadieni?");
        int c = reader.nextInt();
        System.out.println("Kiek pamoku ketvirtadieni?");
        int d = reader.nextInt();
        System.out.println("Kiek pamoku penktadieni?");
        int e = reader.nextInt();

        int sk = a + b + c + d + e;
        int min = sk * 45;

        System.out.println("Pamoku skaicius: " + sk);
        System.out.println("Tai sudaro minuciu: " + min);
    }
}
