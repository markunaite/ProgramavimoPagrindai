import java.util.Scanner;

public class U02 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite deziu skaiciu: ");
        int d = reader.nextInt();
        System.out.println("Iveskite knygu skaiciu: ");
        int k = reader.nextInt();
        System.out.println("Iveskite, kiek knygu telpa i deze: ");
        int n = reader.nextInt();

        int total = d * n;
        int ats = k - total;
        if (ats > 0) {
            System.out.println("Knygos netilpo");
            System.out.println(ats);
        } else {
            System.out.println("Knygos telpa");
        }
    }
}
