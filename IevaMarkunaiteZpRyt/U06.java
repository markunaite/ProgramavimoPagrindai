import java.util.Scanner;

public class U06 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite kiek bus pamoku");
        int n = reader.nextInt();
        int totaltime = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Iveskite pamokos pradzios valanda: ");
            int Aval = reader.nextInt();
            System.out.println("Iveskite pamokos pradzios minute: ");
            int Amin = reader.nextInt();
            System.out.println("Iveskite pamokos pabaigos valanda: ");
            int Bval = reader.nextInt();
            System.out.println("Iveskite pamokos pabaigos minute: ");
            int Bmin = reader.nextInt();
            totaltime += gautiTrukmeMinutemis(Aval, Amin, Bval, Bmin);
        }
        int h1 = totaltime / 60;
        int m1 = totaltime % 60;
        String ats = gautiLaikoFormata(h1, m1);
        System.out.println(ats);

    }

    private static String gautiLaikoFormata(int h1, int m1) {
        return String.format("%d val. %d min.", h1, m1);
    }

    private static int gautiTrukmeMinutemis(int Aval, int Amin, int Bval, int Bmin) {
        int totalmin = (Bval * 60 + Bmin) - (Aval * 60 + Amin);
        return totalmin;
    }
}
