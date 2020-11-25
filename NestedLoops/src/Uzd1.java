import java.util.Scanner;

public class Uzd1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite groteliu skaiciu: ");
        int a = reader.nextInt();

        for(int row = 1; row <= a; row++){
            if(row % 2 == 0) {
                System.out.println(" # # # # # # #"); }
            else {
                System.out.println("# # # # # # #");

            }
        }
    }
}