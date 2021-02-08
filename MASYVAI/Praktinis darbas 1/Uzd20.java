public class Uzd20 {
    public static void main(String[] args) {

        int[] balai =  masyvuMetodai.getArray(8, 1, 11);
        masyvuMetodai.printArray(balai);

        double vidurkis;
        int suma;

        masyvuMetodai.maxArr(balai);
        masyvuMetodai.minArr(balai);

        System.out.println("Maziausias balas: " + masyvuMetodai.minArr(balai));
        System.out.println("Didizausias balas: " + masyvuMetodai.maxArr(balai));
        suma = masyvuMetodai.sum(balai) - masyvuMetodai.maxArr(balai) - masyvuMetodai.minArr(balai);
        vidurkis = suma / 6;

        System.out.println(vidurkis);

    }
}
