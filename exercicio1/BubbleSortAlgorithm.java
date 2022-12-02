package exercicio1;

import java.util.Arrays;

// passo 2
public class BubbleSortAlgorithm {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;

        System.out.println("Vetor antes do Bubble Sort:" + Arrays.toString(arr));
        System.out.println("=============================================");
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] < arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
            // passo 3
            System.out.println((i+1) + "º Iteração: " + Arrays.toString(arr));
            System.out.println("=============================================");
        }
        System.out.println("Vetor depois do Bubble Sort:" + Arrays.toString(arr));
    }
}