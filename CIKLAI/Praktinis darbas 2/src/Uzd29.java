/**
 * Create a program that prints all even numbers between 2 and 100.
 * 2
 * 4
 * 6
 * (many rows of numbers here)
 * 96
 * 98
 * 100
 */

public class Uzd29 {
    public static void main(String[] args) {

        int i = 1;
        int count = 0;

        while (i <= 100) {
            if (i % 2 == 0) {
                count = count + 1;
                System.out.println(i);
            } i++;
        }
    }
}
