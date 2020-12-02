public class Uzd04 {
    public static void main(String[] args) {

        int a = 10;
        int b = 95;

        for (int i = a; i <= b; i++) {  // interuojama nuo a iki b
            for (int j = i; j % 5 == 0; j++) { // kai skaičius liekana yra lygūs 0, atspausdins skaičių
                System.out.print(" " + j + " ");
            }
        }
    }
}