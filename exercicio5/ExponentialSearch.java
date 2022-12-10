package exercicio5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class ExponentialSearch {
    public static int exponentialSearch(int[] array, int n, int value) {
        if(array[0] == value) {
            return 0;
        }

        int i = 1;
        System.out.println("Estabelecendo intervalo para procurar valor " + value);
        while (i < n && array[i] <= value) {
            System.out.println("Elemento não está entre o intervalo ["
                    + i/2 +", "
                    + Math.min(i,n-2)
                    + "[, ou seja, entre os elementos "
                    + array[i/2] + " e " + array[Math.min(i-1,n-1)] + ", onde i = " + i);
            i = i * 2;
        }

        int endingPosition = Math.min(i,n-1);
        int startingPosition = i/2;
        System.out.println("Procurando o valor no intervalo ["
                + startingPosition
                + ", "
                + endingPosition + "[ onde i = " + i);

//        int[] aux = new int[endingPosition - startingPosition];
//        int auxPos = 0;
//
//        for (int j = startingPosition; j < endingPosition; j++) {
//            aux[auxPos] =  array[j];
//            auxPos++;
//        }
//        System.out.println(Arrays.toString(aux));

        int search = BinarySearch.preciseSearch(array,value,startingPosition,endingPosition);
        if(search < 0) {
            throw new NoSuchElementException("Este elemento não se encontra no vetor");
        } else {
            return search;
        }
    }
}
