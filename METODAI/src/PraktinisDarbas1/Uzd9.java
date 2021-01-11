package PraktinisDarbas1;

public class Uzd9 {
    public static void main(String[] args) {
        printRectangle(17, 3);
    }

    private static void printRectangle(int plotis, int ilgis) {
        for (int i = 0; i < ilgis; i++) {
            for (int j = 0; j < plotis; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


