import java.util.Arrays;

public class masyvuMetodai {

    public static void printArray(int[] a) {
        System.out.println(Arrays.toString(a));
    }

    public static void printArray(double[] a) {
        System.out.println(Arrays.toString(a));
    }

    public static int sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
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
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getRandomNumber(min, max);
        }
        return arr;
    }

    public static int[] addElement(int myarray[], int ele) {
        int n = myarray.length;
        int newArray[] = new int[n + 1];
        for (int i = 0; i < n; i++)
            newArray[i] = myarray[i];
        newArray[n] = ele;
        return newArray;
    }

    public static int[] addElement(int[] myArray, int k, int value) {
        int n = myArray.length;
        int index = 0;
        int newArray[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            if(i != k) {
                newArray[i] = myArray[index];
                index++;
            } else {
                newArray[i] = value;  //prideda reiksme
            }
        }

        return newArray;
    }

    public static double random(double a, double b) {
        double rand;
        rand = (Math.random() * (b - a)) + a;
        return Math.round(rand + 100.0) / 100.0;
    }

    public static double suma(double[] arr) {
        double suma = 0;
        for (int i = 0; i < arr.length; i++) {
            suma = suma + arr[i];
        }
        return suma;
}

    public static double vidurkis(double[] arr) {
        return suma(arr)/arr.length;
    }
    //https://stackabuse.com/remove-element-from-an-array-in-java/
    public static int[] removeElement(int myarray[], int index) {
        int n = myarray.length;
        int newArray[] = new int[n - 1]; //sukuria nauja masyvu vienu elementu mazesniu nei pries rai duotas
        int newArrayIndex = 0;
        for (int i = 0; i < n; i++) {
            if(i != index) {   // pridedame i nauja masyva elementus , kuriu index nera lygus paduotam indeksui
                newArray[newArrayIndex] = myarray[i];
                newArrayIndex++;
            }
        }
        return newArray;
    }

}