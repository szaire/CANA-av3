package exercicio1;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = new int[]{2 ,5, 4, 1, 3, 6, 9, 7, 8};

        BubbleSortAlgorithm.bubbleSort(arr2);
        MergeSortAlgorithm.mergeSort(arr2);
    }
}
