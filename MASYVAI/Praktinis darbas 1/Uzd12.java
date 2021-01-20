import java.util.Scanner;

public class Uzd12 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        int[] arrC = masyvuMetodai.getArray(30, 1, 10);

        masyvuMetodai.printArray(arrC);

        System.out.println("Iveskite skaiciu");
        int k = reader.nextInt();
            for(int i = 0; i < arrC.length; i++) {
                if (i + 1 == k ) {
                    arrC[i] = 100;
                    k += k;
                }
            }
        masyvuMetodai.printArray(arrC);
    }
}
