public class Uzd14 {
    public static void main(String[] args) {

        int[] arrF = masyvuMetodai.getArray(25, 1, 10);

        masyvuMetodai.printArray(arrF);

        int k = 2;
        int m = 3;
        int pozicijak = 0;
        for(int i = 0; i < arrF.length; i++) {
            if (i + 1 == k ) {
                pozicijak = i; //išsisaugo skaičiaus vietą masyve
            } else if (i + 1 == m) {
                int temp = arrF[i];
                int temp2 = arrF[pozicijak];
                arrF[i] = temp2;
                arrF[pozicijak] = temp;
            }
        }
        masyvuMetodai.printArray(arrF);
    }
}

