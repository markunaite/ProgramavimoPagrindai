import java.util.Scanner;

public class Uzd7 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite Mato ugi: ");
        int u1 = reader.nextInt();
        System.out.println("Iveskite Domo ugi: ");
        int u2 = reader.nextInt();
        System.out.println("Iveskite Tomo ugi: ");
        int u3 = reader.nextInt();

        if (u1 > u2 && u1 > u3 ) {
            System.out.println("Gauta: Matas yra auksciausias");
        } else if (u1 == u2 && u1 > u3) {
            System.out.println("Gauta: Matas ir Domas yra aukstesnis uz Toma");
        } else if (u1 == u3 && u1 > u2) {
            System.out.println("Gauta: Matas ir Tomas yra aukstesnis uz Doma");
        } else if (u2 > u1 && u2 > u3) {
            System.out.println("Domas yra auksciausias");
        }else if (u2 == u3 && u2 > u1) {
            System.out.println("Domas ir Tomas yra lygus ir  yra auksciausi");
        } else if (u3 > u1 && u3 > u2) {
            System.out.println("Tomas yra auksciausias");
        } else {
            System.out.println("Visi lygus");
        }
        reader.close();
    }
}
