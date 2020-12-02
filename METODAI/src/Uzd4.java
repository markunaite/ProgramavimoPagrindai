import java.util.Scanner;

public class Uzd4 {
   public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
       System.out.println("Iveskite metus: ");
       int metai = reader.nextInt();
     System.out.println("Metai: " + metai(metai));
   }

   public static boolean metai(int metai) {

       boolean a = (metai % 4) == 0;
       boolean b = (metai % 100) != 0;
       boolean c = ((metai % 100 == 0) && (metai % 400 == 0));
       return a && (b || c);
    }
}
