public class TestAlgoritmaiIeva {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        AlgoritmaiIeva.print(arr);

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        boolean result1 = AlgoritmaiIeva.equals(arr1, arr2);
        System.out.println(result1);

        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
        boolean result2 = AlgoritmaiIeva.equals(arr3, arr4);
        System.out.println(result2);

        int[] arr5 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[] arr6 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        boolean result3 = AlgoritmaiIeva.equals(arr5, arr6);
        System.out.println(result3);

    }
}
