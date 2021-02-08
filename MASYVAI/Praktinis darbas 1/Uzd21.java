public class Uzd21 {
    public static void main(String[] args) {

        int[] balai = masyvuMetodai.getArray(20, 1, 11);
        masyvuMetodai.printArray(balai);


        int[] pazangus = new int[0];
        for (int balas : balai) {
            if (balas >= 4) {
                pazangus = masyvuMetodai.addElement(pazangus, balas);
            }
        }

        double vidurkis = masyvuMetodai.vidurkis(pazangus);
        masyvuMetodai.printArray(pazangus);
        System.out.println(vidurkis);

        int neislaike = balai.length - pazangus.length;
        System.out.println(neislaike);
    }
}
