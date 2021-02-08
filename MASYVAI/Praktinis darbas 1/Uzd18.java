public class Uzd18 {
    public static void main(String[] args) {

        int[] arrT = masyvuMetodai.getArray(40, -10, 20);
        masyvuMetodai.printArray(arrT);

        int temp = 0;

        for (int i = 0; i < arrT.length; i++) {
            for (int j = i + 1; j < arrT.length; j++) {
                if (arrT[i] > arrT[j]) {
                    temp = arrT[i];
                    arrT[i] = arrT[j];
                    arrT[j] = temp;
                }
            }
        }
        masyvuMetodai.printArray(arrT);
    }
}