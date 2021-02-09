package ATSISKAITYMAS3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Uzd01 {
    static int[] readGrades() {  // duomenu nuskaitymo metodas
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite pazymiu kieki: ");
        int kiekis = reader.nextInt();
        int[] arr = new int[kiekis];
        System.out.println("Iveskite pazymius: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reader.nextInt();
        }
        return arr;
    }

    private static int randomNumber(int pradzia, int pabaiga) {  //sugeneruoja random skaiciu
        return new Random().nextInt(pabaiga - pradzia) + pradzia;
    }

    private static void printGrades(int[] a) {
        System.out.println(Arrays.toString(a));
    }  //atspausdina masyva

    private static int[] randomGrades(int n) {  //sugeneruoja random skaiciu masyva
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomNumber(1, 11);
        }
        return arr;
    }

    private static int sum(int[] a) { //sumos metodas
        int sum = 0;
        for (int j : a) {
            sum = sum + j;
        }
        return sum;
    }

    private static double getAvg(int[] arr) { // vidurkio metodas
        return (double) sum(arr) / arr.length;
    }

    private static int getMax(int[] arr) { //maksimalaus skaiciaus suradimas
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static int getMin(int[] arr) { //minimalaus skaiciaus suradimas
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    private static double getMediana(int[]in) { // kuri suranda medianą
        double m;
        int n = in.length;
        if (n % 2 == 1) { // patikrina ar skaicius yra nelyginis
            m = in[((n + 1) / 2) - 1]; //jei nelyginis, ima per viduri esanti skaiciu
        } else {
            m = (double) (in[n / 2 - 1] + in[n / 2]) / 2; //o jei lyginis, pasiima du skaicius per viduri, juos sudeda ir padalina is 2
        }
        return m;
    }

    private static int[] addElement(int[]myarray, int ele) { //i masyvo pabaiga prideda skaiciu
        int n = myarray.length;
        int[] newArray = new int[n + 1];
        for (int i = 0; i < n; i++)
            newArray[i] = myarray[i];
        newArray[n] = ele;
        return newArray;
    }

    private static double getPercent(int[]grades) { //paskaiciuoja procentus
        int[] arr = new int[0];
        for (int grade : grades) {
            if (grade >= 4 && grade <= 10) { // nustatomas intervalas, kuriuos skaicius tikrinti
                arr = addElement(arr, grade);
            }
        }
        return (double) arr.length * 100 / grades.length;
    }

    private static void printHistogram(int[] grades) { //histogramos metodas
        for(int i = 1; i <= 10; i++) {
            int count = 0;
            for (int grade : grades) {
                if (grade == i) {
                    count++;
                }
            }
            System.out.println(i + " : " + convertToStars(count));
        }
    }

    private static String convertToStars(int num) { //metodas, kuris konvertuoja skaicius i zvaigzdutes ir veliau atvaizduoja histogramoje
        String stars = "";
        for (int i = 0; i < num; i++) {
            stars += "*";
        }
        return stars;
    }

    public static void main(String[] args) {
        int[] grades = readGrades();
        System.out.println("1. " + Arrays.toString(grades));

        int randomNumber = randomNumber(1, 10);
        System.out.println("2. Atsitiktinis skaicius: " + randomNumber);

        int[] randomGrades = randomGrades(15);
        System.out.println("3. " + Arrays.toString(randomGrades));

        System.out.print("4. ");
        printGrades(randomGrades);

        System.out.println("5. Vidurkis: " + getAvg(randomGrades));

        System.out.println("6. Maksimalus skaicius: " + getMax(randomGrades));

        System.out.println("7. Minimalus skaicius: " + getMin(randomGrades));

        System.out.println("8. Mediana: " + getMediana(randomGrades));

        System.out.println("9. Procentai: " + getPercent(randomGrades));

        System.out.println("10. Histograma: ");
        printHistogram(randomGrades);

    }
}