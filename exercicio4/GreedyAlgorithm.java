package exercicio4;

import java.util.Objects;
import java.util.Stack;

public class GreedyAlgorithm {

    private static final int TAMANHO_PENDRIVE = 4000; // em Megabytes

    public static double tamanhoPendrive;
    private static double menorAquivo;
    private static double[] melhorEscolhaLocal;
    private static final Stack<double[]> listaGulosa = new Stack<>();
    private static double somatorio = 0;


    public static void organizar(String[] input, String pendrive) {
        double[] arr = conversaoVetor(input);
        tamanhoPendrive = conversao(pendrive);


        for (int i = 0; i < arr.length; i++)
        {
            melhorEscolhaLocal = menorElemento(arr);
            listaGulosa.push(melhorEscolhaLocal);

            if (somatorioLista(melhorEscolhaLocal[0]) > tamanhoPendrive) {
                somatorio -= listaGulosa.pop()[0];
                break;
            }
        }
        printGuloso();
    }

    private static double[] conversaoVetor(String[] arr) {
        double[] valoresConvertidos = new double[arr.length];

        for (int i = 0; i < arr.length; i++) {
            valoresConvertidos[i] = conversao(arr[i]);
        }
        return valoresConvertidos;
    }

    private static double conversao(String valor) {
        String[] aux = valor.split(" ");
        if (Objects.equals(aux[1], "GB")) {
            return Double.parseDouble(aux[0]) * Math.pow(2,10);
        } else {
            return Double.parseDouble(aux[0]);
        }



    }

    private static double[] menorElemento(double[] arr) {
        menorAquivo =  Double.POSITIVE_INFINITY;
        double num = -1;
        double index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < menorAquivo) {
                num = arr[i];
                index = i;
                menorAquivo = num;
            }
        }
        if (index >= 0) arr[(int) index] = 9999;

        return new double[]{num, index};
    }

    private static double somatorioLista(double num) {
        somatorio += num;
        return somatorio;
    }

    public static void printGuloso() {
        System.out.println("Lista Gulosa final: ");
        for (double[] num: listaGulosa) {
            System.out.println("Vídeo " + num[1] + " (" + num[0] + "Mb) ");
        }
        System.out.println("Peso total do pen-drive: " + somatorio);
    }


}
