package PraktinisDarbas1;

import java.util.Scanner;

public class Uzd1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Pirmas skaicius: ");
        int a = reader.nextInt();
        System.out.print("Antras skaicius: ");
        int b = reader.nextInt();
        System.out.print("Trecias skaicius: ");
        int c = reader.nextInt();
        System.out.println("Maziausia reiksme: " + maziausia(a, b, c));

    }
    public static int maziausia(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
}

