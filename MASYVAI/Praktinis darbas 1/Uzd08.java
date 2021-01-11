import java.util.Scanner;

public class Uzd08 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int[] arr3 = new int[5];

        System.out.println("Iveskite 1ojo masyvo reiskmes: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = reader.nextInt();
        }

        System.out.println("Iveskite 2ojo masyvo reiskmes: ");
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = reader.nextInt();
        }

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i] * arr2[i];
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
    }
}
