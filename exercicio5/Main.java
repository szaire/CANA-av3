package exercicio5;

public class Main {
    public static void main(String[] args) {
        int[] arr = {13, 17, 19, 23, 32, 37, 42, 43, 44, 46, 47, 54, 60, 61, 67, 68, 74, 75, 95, 96};
//        System.out.println(BinarySearch.simpleSearch(arr, 3));

        System.out.println(ExponentialSearch.exponentialSearch(arr,arr.length,54));
    }
}
