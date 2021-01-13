import java.util.Scanner;

public class Uzd9 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Isvykimo laikas valandomis: ");
        int isvykimoval = reader.nextInt();
        System.out.println("Isvykimo laikas minutemis");
        int isvykimomin = reader.nextInt();
        System.out.println("Keliones trukme valandomis");
        int trukmeval = reader.nextInt();
        System.out.println("Keliones trukme minutemis");
        int trukmemin = reader.nextInt();

        int kelionespab =  isvykimoval * 60 + isvykimomin + trukmeval * 60 + trukmemin;
        int val3 = kelionespab / 60;
        int min3 = kelionespab % 60;

        if (val3 >= 24) {
            val3 = val3 - 24;
        }

        System.out.println("Gauta: Keliones pabaiga: " + val3 + "val. " + min3 + "min.");
         reader.close();
    }
}

