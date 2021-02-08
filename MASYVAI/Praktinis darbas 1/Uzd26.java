public class Uzd26 {
        public static void selectionSort(int[] arr){
            for (int i = 0; i < arr.length - 1; i++) {
                int index = i;
                for (int j = i + 1; j < arr.length; j++){
                    if (arr[j] < arr[index]){
                        index = j; //ieskoma maziausio
                    }
                }
                int smallerNumber = arr[index];
                arr[index] = arr[i];
                arr[i] = smallerNumber;
            }
        }

        public static void main(String[] a){
            int[] arr = {2, 5, 6, 7, 8, 10, 5, 3, 20, 5, 3, 17, 26, 7};
            System.out.println("Nesurikiuota: ");
            for(int i:arr){
                System.out.print(i+" ");
            }
            System.out.println();

            selectionSort(arr);

            System.out.println("Surikiuota: ");
            for(int i:arr){
                System.out.print(i+" ");
            }
        }
}