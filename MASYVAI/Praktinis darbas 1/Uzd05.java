import java.util.Scanner;

public class Uzd05 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite reiksme x");
        int x = reader.nextInt();

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]+x;
            System.out.println(arr[i]);
        }
    }
}
