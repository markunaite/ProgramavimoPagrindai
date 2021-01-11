package PraktinisDarbas2;

import java.util.Scanner;

public class Uzd04 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite skaitmenu sumos dydi: ");
        int a = reader.nextInt();
        while ( a < 0 || a > 9) {
            System.out.println("Iveskite kintamuju skaiciu (0-9): ");
            a = reader.nextInt();
        }
        System.out.println("Iveskite skaiciu: ");
        int b = reader.nextInt();

        int i = 0;
        while (b!=0) {
            if(getSum(b) == a) {
                i++;
            }
            System.out.println("Iveskite skaiciu: ");
            b = reader.nextInt();
        }
        System.out.println("Ieskomas kiekis lygus: " + i);
        reader.close();
    }

    private static int getSum(int sk) {
        int sum = 0;
        while (sk != 0) {
            int num = sk % 10;
            sum = sum + num;
            sk /= 10;
        }
        return sum;
    }
}
