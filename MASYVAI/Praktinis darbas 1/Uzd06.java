import java.util.Arrays;
import java.util.Scanner;

public class Uzd06 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int[] arr = new int[6];
        System.out.println("Iveskite masyvo reiskmes: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]  = reader.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
