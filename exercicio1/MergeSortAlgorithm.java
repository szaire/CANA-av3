package exercicio1;

import java.util.Arrays;

public class MergeSortAlgorithm {

    public static int counter = 0;

    public static void mergeSort(int[] array, int floor, int ceiling) {
        if (floor < ceiling){
            int middle = (floor+ceiling)/2;
            mergeSort(array, floor, middle);
            mergeSort(array,middle+1,ceiling);
            merge(array, floor, middle, ceiling);
        }
    }

    private static void merge(int[] array, int floor, int middle, int ceiling) {

        int n1 = middle - floor + 1;
        int n2 = ceiling - middle;

        int[] left = new int[n1+1];
        int[] right = new int[n2+1];

        for (int i = 0; i < n1; i++) {
            left[i] = array[floor + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = array[middle + j + 1];
        }

        left[n1] = Integer.MIN_VALUE;
        right[n2] = Integer.MIN_VALUE;

        int i = 0;
        int j = 0;

        for (int k = floor; k <= ceiling; k++){
            if (left[i] >= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }


        }
        System.out.println((counter+1) + "º Chamada: " + Arrays.toString(array));
        System.out.println("=============================================");
        counter++;

    }

    public static void main(String[] args) {
        int[] teste = {11, 30, 24, 7, 31, 16, 39, 41};
        int floor = 0;
        int ceiling = teste.length-1;
        mergeSort(teste,floor,ceiling);
//        for (int i = 0; i < ceiling ; i++) {
//            System.out.println(teste[i]);
//        }
    }
}
