package PraktinisDarbas1;

public class Uzd10 {
    public static void main(String[] args) {

        printTriangle(4);
        printStars (4);
    }

    private static void printStars(int n) {
        for(int i=0; i<n; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    private static void printTriangle(int dydis) {
        for(int j=1; j<dydis; j++){
            printStars(j);
        }
    }
}

