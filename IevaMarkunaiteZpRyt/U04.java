import java.util.Scanner;

public class U04 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Įveskite intervalo pradžią: ");
        int a = reader.nextInt();
        System.out.println("Įveskite intervalo pabaigą: ");
        int b = reader.nextInt();

        int count = 0;
        for (int c = a; c <= b; c++) {
            if (c % 6 == 0) {
                count++;
            }
        }
        System.out.println("Marskineliu skaicius: " + count);
    }
}
