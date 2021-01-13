import java.util.Scanner;

public class Uzd2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite zingsniu kieki iki mokyklos: ");
        int a = reader.nextInt();
        int c = 0;
        int d = 0;

        for ( int b = 1; b <= a; b++) {
            if (b % 10 == 0) {
                c++;
            }
            if (b % 10 == 5) {
                d++;
            }
        }
        System.out.println("Suplojimu: " + c);
        System.out.println("Spragtelejimu: " + d);
    }
}
