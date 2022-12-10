package exercicio2;

import java.util.NoSuchElementException;

public class Fibonacci {

    public int fibonacci(int n){
        if (n <= 1) {
            return n;
        }
        int n1 = fibonacci(n - 1);
        System.out.print(n1 + " ");
        int n2 = fibonacci(n - 2);
        System.out.print(n2 + " ");
        int sum = n1 + n2;
        System.out.print(sum + " ");
        return sum;

    }

    private int[] f;
    private void setF(int[] f) {
        this.f = f;
    }
    public int fibTopDownStart(int n) {
        f = new int[n+1];
        return fibTopDown(n);
    }
    private int fibTopDown(int n){
        if (n<=1){
            f[n] = n;
            System.out.print(f[n] + " ");
            return n;
        }
        if (f[n] == 0) {
            int a = fibTopDown(n - 1);
            System.out.print(a + " ");
            int b = fibTopDown(n - 2);
            System.out.print(b + " ");
            int sum = a + b;
            System.out.print(sum + " ");
            f[n] = sum;
        }
        return f[n];
    }

    public int[] getF() {
        return f;
    }

    public void showF(){
        for (int i = 0; i < f.length; i++) {
            System.out.println(f[i]);
        }
    }


    public int fibBottomUp(int n) {
//        if (n <= 1)
//            return n;
//
//        int aux = 0, current = 1, sum = 1, pos = 1;
//
//        while (sum < n)
//        {
//            sum = aux + current;
//            aux = current;
//            current = sum;
//            pos++;
//        }
//
//        if (current == n) {
//            return pos;
//        } else {
//            throw new NoSuchElementException("This number isn't in the Fibonacci sequence");
//        }
        if (n<=1) {
            return n;
        }
        int aux = 0;
        int current = 1;
        int sum = 0;
        System.out.println(sum);
        System.out.println(current);
        for (int i = 1; i < n; i++) {
            sum = current + aux;
            aux = current;
            current = sum;
            System.out.println(current);
        }
        return sum;
    }






    public int fibConstant(int n) {
        double phi = (1 - Math.sqrt(5))/2;
        double bigPhi = (1 + Math.sqrt(5))/2;
        int result = (int) (((Math.pow(bigPhi,n)) - (Math.pow(phi,n)))/Math.sqrt(5));
        System.out.println(result);
        return result;

    }


}
