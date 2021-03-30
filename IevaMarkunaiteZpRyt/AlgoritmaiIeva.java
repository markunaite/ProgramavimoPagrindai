import java.util.Arrays;

public class AlgoritmaiIeva {

    public static void print(int[] a) {
        System.out.println(Arrays.toString(a));
    }

    public static boolean equals(int[] a, int[] b) {
        if(a.length == b.length) {
            return true;
        } else {
            return false;
        }
    }
}
