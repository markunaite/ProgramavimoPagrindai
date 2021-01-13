import java.util.Random;
import java.util.Scanner;

public class Uzd09 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.println("Iveskite intervalo pradzia: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reader.nextInt();
        }

        randomNumbers(arr);
    }

    private static int randomNumbers(int[] arr) {
        int rnd = new Random().nextInt(arr.length);
        return arr[rnd];
    }
}
