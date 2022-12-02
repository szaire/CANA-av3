package exercicio5;

import java.util.NoSuchElementException;

public class BinarySearch {
    /**
     * O algoritmo considera que a entrada <b>arr</b> já está ordenada
     * */
    public static int simpleSearch(int[] arr, int value) {
        int index = preciseSearch(arr, value, 0, arr.length-1);

        if (index < 0) {
            throw new NoSuchElementException("Elemento não encontrado no vetor.");
        }

        return index;
    }

    /**
     * @return Posição do valor informado
     * @param arr Vetor
     * @param value Valor a ser pesquisado
     * @param lowest O índice de menor valor no Vetor
     * @param highest O índice de maior valor no Vetor
     * */
    public static int preciseSearch(int[] arr, int value, int lowest, int highest) {
        if (lowest > highest) {
            return -1;
        }

        int middle = (lowest + highest) / 2;
        if (value == arr[middle]) {
            System.out.println("O valor requerido foi encontrado!");
            return middle;
        }
        else if (value > arr[middle]) { // o número a ser procurado está do lado direito
            System.out.println("O valor requerido " + value + " é maior que o valor intermediário " + arr[middle]);
            return preciseSearch(arr, value, middle + 1, highest);
        }
        else { // o número a ser procurado está do lado esquerdo
            System.out.println("O valor requerido " + value + " é menor que o valor intermediário " + arr[middle]);
            return preciseSearch(arr, value, lowest, middle - 1);
        }
    }
}
