public class Uzd17 {
    public static void main(String[] args) {

        int[] arrQ = masyvuMetodai.getArray(50, 10, 100);
        masyvuMetodai.printArray(arrQ);

        int k = 2;
        int value = 100;
        int[] arrY = masyvuMetodai.addElement(arrQ, k, value);

        masyvuMetodai.printArray(arrY);
    }
}