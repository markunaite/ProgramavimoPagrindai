public class Uzd24 {
    public static void main(String[] args) {

        int[] arrS = masyvuMetodai.getArray(10, -5, 10);
        masyvuMetodai.printArray(arrS);

        for(int i = 0; i < arrS.length; i++) {
            int value = arrS[i];
            if(value < 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
