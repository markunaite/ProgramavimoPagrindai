import java.util.Scanner;

public class Uzd5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite skaicu");
        int sk = reader.nextInt();

        int pirmas = sk / 1000;
        int antras = sk % 1000 / 100;
        int trecias = sk % 100 / 10;
        int ketvirtas = sk % 10;

        int suma = pirmas + antras + trecias + ketvirtas;
        System.out.println("Gauta: " + suma);

        reader.close();
    }
}
