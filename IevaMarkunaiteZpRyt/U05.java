import java.util.Scanner;

public class U05 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Pirmas pazymis: ");
        int p1 = reader.nextInt();
        System.out.println("Antras pazymis: ");
        int p2 = reader.nextInt();
        System.out.println("Trecias pazymis: ");
        int p3 = reader.nextInt();

        System.out.println("Rezultatas: " + gautiGeriausiaIvertinima(p1, p2, p3));
    }

    private static int gautiGeriausiaIvertinima(int p1, int p2, int p3) {
        int max = Math.max(p1, Math.max(p2, p3));
        return max;
    }
}
