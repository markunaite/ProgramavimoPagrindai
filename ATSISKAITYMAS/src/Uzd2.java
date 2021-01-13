import java.util.Scanner;

public class Uzd2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite puodeliu skaiciu: ");
        int a = reader.nextInt();

        int dez = a / 7;
        int lik = a % 7;
        System.out.println(dez + " pilnos dezes, nesupakuotu puodeliu skaicius " + lik);

        reader.close();
    }
}
