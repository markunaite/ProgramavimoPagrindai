package PraktinisDarbas2;

import java.util.Scanner;

public class Uzd01 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Intervalo pradzia: ");
        int m = reader.nextInt();
        System.out.println("Intervalo pabaiga: ");
        int n = reader.nextInt();

        int count = 0;

        for (int i = m; i <=n; i++) {
            if(i % sum1(i)==0) {
                count++;
            }
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
