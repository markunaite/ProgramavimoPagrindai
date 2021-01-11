package PraktinisDarbas1;

public class Uzd8 {

    public static void main(String[] args) {
        printStars(4);
        printSquare(4);
    }

    private static void printStars(int i) {

    }

    private static void printSquare(int n) {

        for(int i = 0; i < n; i++ ) {
            for(int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}