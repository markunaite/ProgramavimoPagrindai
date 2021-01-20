public class Uzd13 {
    public static void main(String[] args) {

        int[] arrD = masyvuMetodai.getArray(20, -5, 10);

        masyvuMetodai.printArray(arrD);
        int[] arrE = new int[0];

        for (int i = 0; i < arrD.length; i++) {   // for (int skaicius : arrD)
            if (arrD[i] >= 0)  {                  //if (skaicius >= 0)  {
                arrE = masyvuMetodai.addElement(arrE, arrD[i]);  //arrE = masyvuMetodai.addElement(arrE, skaicius);
            }
        }

        masyvuMetodai.printArray(arrE);
    }
}
