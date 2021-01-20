import java.util.Arrays;

public class masyvuMetodai {

    public static void printArray(int[] a) {
        System.out.println(Arrays.toString(a));
    }

    public static int sum(int[] a) {
        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    // https://www.baeldung.com/java-generating-random-numbers-in-range
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static int[] getArray(int n, int min, int max) {
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = getRandomNumber(min, max) ;
        }
        return arr;
    }

    public static int[] addElement(int myarray[], int ele)
    {
        int n = myarray.length;
        int newArray[] = new int[n + 1];
        //copy original array into new array
        for (int i = 0; i < n; i++)
            newArray[i] = myarray[i];

        //add element to the new array
        newArray[n] = ele;

        return newArray;
    }
}