public class Uzd02 {
    public static void main(String[] args) {
        int a = -20;
        int b = -5;

        // kol a nėra daugiau už b, išveda skaičių ir jį padidina per vienetą
        while (true) {

            System.out.print(" " + a + " ");
            a++;

            if (a > b) {
                break;
            }
        }
    }
}

