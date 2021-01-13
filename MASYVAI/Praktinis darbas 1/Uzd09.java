import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Uzd09 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Iveskite masyvo ilgi: ");
        int ilgis = reader.nextInt();
        int[] arr = new int[ilgis];
        System.out.println("Iveskite intervalo pradzia: ");
        int pradzia = reader.nextInt();
        System.out.println("Iveskite intervalo pabaiga: ");
        int pabaiga = reader.nextInt();


        for (int i = 0; i < ilgis; i++) {
            arr[i] = randomNumbers(pradzia, pabaiga);
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static int randomNumbers(int pradzia, int pabaiga) {
        // pabaiga - pradzia =  5
        // Random.nextInt(5) -> 0, 1, 2, 3, 4, 5 -> 3
        // 3 + pradzia -> 13
        return new Random().nextInt(pabaiga - pradzia) + pradzia;
    }
}
