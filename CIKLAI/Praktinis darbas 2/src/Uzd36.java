import java.util.Scanner;

/**
 *
 */

public class Uzd36 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a;
        int suma = 0;
        int count = 0;
        double avg = 0;
        int lyg = 0;
        int nelyg = 0;

        System.out.println("Type a numbers:");
        while (true) {
            a = reader.nextInt();
            if (a == -1) {
                System.out.println("Thank you and see you later!");
                break;
            }
            suma = suma + a;
            if (a % 2 == 0) {
                lyg++;
            } else {
                nelyg++;
            }

            avg = (double) suma / count;

            count++;
        }

        System.out.println("sum " + suma);
        System.out.println("count " + count);
        System.out.println("Avg " + avg);
        System.out.println("Lyg " + lyg);
        System.out.println("Nelyg " + nelyg);
    }

}
