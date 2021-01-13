import java.util.Scanner;

public class Uzd4 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite pinigu suma : ");
        double suma = reader.nextDouble();

        double centai = suma * 100;
        double centai50 = Math.floor(centai / 50);
        centai = centai - 50 * centai50;
        double centai20 = Math.floor(centai / 20);
        centai = centai - 20 * centai20;
        double centai10 = Math.floor(centai / 10);
        centai = centai - 10 * centai10;
        double centai5 = Math.floor(centai / 5);
        centai = centai - 5 * centai5;
        double centai2 = Math.floor(centai / 2);
        centai = centai - 2 * centai2;
        double centai1 = centai;

        System.out.println("Gauta: ");
        System.out.println("50ct: " + centai50);
        System.out.println("20ct: " + centai20);
        System.out.println("10ct: " + centai10);
        System.out.println("5ct: " + centai5);
        System.out.println("2ct: " + centai2);
        System.out.println("1ct: " + centai1);

        reader.close();

    }
}
