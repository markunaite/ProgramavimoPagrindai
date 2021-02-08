public class Uzd25 {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {

        int[] array = {2, 5, 6, 7, 8, 10, 5, 3, 20, 5, 3, 17, 26, 7};

        System.out.println("Nesurikiuota: ");
        for(int i=0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        bubbleSort(array);//sorting array elements using bubble sort

        System.out.println("Surikiuota: ");
        for(int i=0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

    }
}

