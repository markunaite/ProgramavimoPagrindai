public class Uzd19 {
    public static void main(String[] args) {

        int[] arrZ = masyvuMetodai.getArray(20, 0, 20);
        masyvuMetodai.printArray(arrZ);

       masyvuMetodai.maxArr(arrZ);
       masyvuMetodai.minArr(arrZ);

        System.out.println(masyvuMetodai.minArrIndex(arrZ) + " - " + masyvuMetodai.minArr(arrZ));
        System.out.println(masyvuMetodai.maxArrIndex(arrZ) + " - " + masyvuMetodai.maxArr(arrZ));

    }
}
