import java.util.Arrays;
import java.util.Scanner;

public class Uzd15 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite pirma intervalo skaiciu");
        int a = reader.nextInt();
        System.out.println("Iveskite antra intervalo skaiciu");
        int b = reader.nextInt();
        System.out.println("Kiek % brangs preke?");
        double brangs = reader.nextDouble();
        double [] arr = new double[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = masyvuMetodai.random(a,b);

        }
        masyvuMetodai.printArray(arr);
        System.out.println("Vidutine prekiu kaina be pabrangimo: " + masyvuMetodai.vidurkis(arr));

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < masyvuMetodai.vidurkis(arr)) {
                arr[i] = arr[i] + arr[i] + (brangs / 100);
            }
        }
        masyvuMetodai.printArray(arr);
        System.out.println("Vidurkis po pabrangimo: " + masyvuMetodai.vidurkis(arr));
        reader.close();
    }
}
