import java.util.Scanner;

public class Uzd6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Iveskite kauliuku skaiciu: ");
        int a = reader.nextInt();
        int max = 0;
        int suma = 0;
        int skaiciuKiekis = 0;


        for (int i = 1;  i <= a; i++) {

            System.out.print(i + " Kauliuko tasku kiekis:" );
            int sk = reader.nextInt();
            max = a * 6;
            suma = suma + sk;
        }

       // vid = suma / skaiciuKiekis

        System.out.println("Is viso galima surinkti tasku: " + max);
        System.out.println("Suma: " + suma);
        //System.out.println("Vidutinis kauliuku skaicius: " + vid);


    }
}
