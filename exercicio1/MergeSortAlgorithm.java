package exercicio1;

public class MergeSortAlgorithm {

    public static void mergeSort(int[] array, int p, int r) {
        int q;
        if (p < r) {
            q = (p+r)/2;
            mergeSort(array,p,q);
            mergeSort(array,q+1,r);
            merge(array,p,q,r);
        }
    }

    public static void merge(int[] array, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = array[p+i];
        }

        for (int i = 0; i < n2; i++) {
            right[i] = array[q+1+i];
        }
//        left[n1+1] = (int) Double.POSITIVE_INFINITY;
//        right[n2+1] = (int) Double.POSITIVE_INFINITY;

        int i = 0;
        int j = 0;

        for (int k = p; k < r; k++) {
            if (left[i] <=  right[j]){
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
        }

    }
}
