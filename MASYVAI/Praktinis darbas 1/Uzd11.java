public class Uzd11 {
    public static void main(String[] args) {

        int[] arrB = masyvuMetodai.getArray(20, 1, 10);

        masyvuMetodai.printArray(arrB);

        int suma = 0;

        for (int i = 0; i < arrB.length; i++) {
            if (arrB[i] % 3 == 0) {
                System.out.println(arrB[i]); // išveda skaičius, kurie dalinasi iš trijų
                suma = suma + arrB[i]; // išvestus skaičius sudeda
            }
        }
        System.out.println("Suma: " + suma);
    }
}
