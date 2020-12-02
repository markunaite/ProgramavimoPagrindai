import java.util.Scanner;

public class Uzd05 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Korteliu skaicius: ");
        int a = reader.nextInt();
        int suma = 0;
        int maxSuma = 0;
        int maxsk1 = 0;
        int maxsk2 = 0;

        for (int i = 1; i <=5; i++) {

            System.out.println("Zaideju sudetos poros (nuo 1 iki 10): ");
            int sk = reader.nextInt();
            int sk2 = reader.nextInt();

            suma = sk +sk2; // sudeda gautus skaičius
            if (maxSuma < suma) { // jeigu maksimali suma yra mažiau už esamą sumą, tada esama sumą reikia prisikirti kaip maksimalią
                maxSuma = suma;
                maxsk1 = sk;
                maxsk2 = sk2;
            }
        }
        System.out.println("Rezultatas " + maxSuma);
        System.out.println(" " + maxsk1 + " " + maxsk2);
    }
}


