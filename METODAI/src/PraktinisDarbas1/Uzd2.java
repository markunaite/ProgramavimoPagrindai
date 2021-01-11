package PraktinisDarbas1;

import java.util.Scanner;

public class Uzd2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Pirmas skaicius: ");
        int a = reader.nextInt();
        System.out.print("Antras skaicius: ");
        int b = reader.nextInt();
        System.out.print("Trecias skaicius: ");
        int c = reader.nextInt();
        System.out.println("Maziausia reiksme: " + vidurkis(a, b, c));

    }
    public static double vidurkis(int a, int b, double c) {
        return ( a + b + c) / 3;
    }
}

