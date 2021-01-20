public class Uzd10 {
    public static void main(String[] args) {

        int[] arrA = masyvuMetodai.getArray(12, -5, 10);

        masyvuMetodai.printArray(arrA);

        int kiekis = 0;
        for(int i = 0; i < arrA.length; i++) {
            if (arrA[i] == 0 ) {
                kiekis++;
            }
        }
        System.out.println(kiekis);
    }
}
