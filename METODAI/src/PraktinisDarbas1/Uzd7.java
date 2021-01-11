package PraktinisDarbas1;

public class Uzd7 {
    public static void main(String[] args) {

        printStars (5);
        printStars(3);
        printStars(9);
    }

    private static void printStars(int n) {
    for (int i = 1; i <= n; i++) {
        System.out.print("*");
    }
        System.out.println();
    }
}
