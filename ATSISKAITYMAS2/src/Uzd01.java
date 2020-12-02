public class Uzd01 {
    public static void main(String[] args) {
        int a = 55;
        int b = 75;

        // kol a nėra daugiau už b, išveda skaičių ir jį padidina per vienetą
        while (true) {

            System.out.println(" " + a + " ");
            a++;
            if (a > b) {
                break;
            }
        }
    }
}