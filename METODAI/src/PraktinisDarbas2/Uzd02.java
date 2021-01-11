package PraktinisDarbas2;

import java.util.Scanner;

public class Uzd02 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Intervalo pradzia: ");
        int m = reader.nextInt();
        System.out.println("Intervalo pabaiga: ");
        int n = reader.nextInt();

        int count = 0;

        for (int i = m; i <=n; i++) {
           count = count+sum1(i);
        }
        System.out.println(count);
    }

    private static int sum1(int sk) {
        int skaitmenuSuma = 0;
        while (sk >0) {
            skaitmenuSuma = skaitmenuSuma+(sk%10);
            sk = sk /10;
        }
        return skaitmenuSuma;
    }
}
