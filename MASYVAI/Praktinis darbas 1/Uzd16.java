public class Uzd16 {
    public static void main(String[] args) {

        int[] arrG = masyvuMetodai.getArray(20, 10, 100);
        masyvuMetodai.printArray(arrG);

        int k = 2;
        int[] arrH = masyvuMetodai.removeElement(arrG, k);
        masyvuMetodai.printArray(arrH);

        }
    }