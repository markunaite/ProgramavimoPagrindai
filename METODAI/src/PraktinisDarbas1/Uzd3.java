package PraktinisDarbas1;

import java.util.Scanner;

public class Uzd3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite skaiciu: ");
        int a = reader.nextInt();
        System.out.println("Skaiciu suma: " + suma(a));
    }

    public static int suma(int a) {
        int suma = 0;
        while (a > 0) {
            suma = suma + a % 10;
            a = a / 10;
        }
        return suma;
    }
}

