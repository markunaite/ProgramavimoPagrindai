public class U03 {
    public static void main(String[] args) {

        int a = -100;

        while (a > -200) {
            if (Math.abs(a) % 3 == 1) {
                System.out.print(" " + a + " ");
            }
            a--;
        }

        System.out.println(" ");

        for (int b= -100; b > -200; b--) {
            if (Math.abs(b) % 3 == 1) {
                System.out.print(" " + b + " ");

            }
        }
    }
}

