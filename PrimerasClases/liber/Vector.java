package liber;

import java.util.Arrays;
import java.util.Scanner;

public class Vector {

    public static int[] rellenaVectorInt(int numElem) {
        Scanner sc = new Scanner(System.in);
        int[] vecInt = new int[numElem];
        for (int i = 0; i < numElem; i++) {
            //System.out.printf("Introduce el elemento %d:",i);
            //vecInt[i]=sc.nextInt();
            vecInt[i] = (int) (Math.random()*10 + 1);
        }
        sc.close();
        return vecInt;
    }


    public static int busca(int[] v, int pos){

        return v[pos];
    }

    public static String busca(String[] v, int pos){

        return v[pos];
    }

    public static int suma(int[] v){

        int suma = 0;

        for (int i = 0; i < v.length; i++){
            suma += v[i];
        }

        return suma;
    }

    public static int maximo(int[] v){

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < v.length; i++) {
            if (v[i] > max){
                max = v[i];
            }
        }

        return max;
    }

    public static int minimo(int[] v){

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < v.length; i++) {
            if (v[i] < min){
                min = v[i];
            }
        }

        return min;
    }

    public static int[] reverse(int[] v){
        
        int[] v2 = new int[v.length];
        int j = 0;

        for (int i = v.length - 1; i >= 0; i-- ) {
            v2[j] = v[i];
            j++;
        }

        return v2;
    }

    public static int[] reverse2(int[] v){
        
        int aux = 0;

        for (int i = 0; i < v.length/2; i++) {
           aux = v[i];

           v[i] = v[v.length - 1 - i];

           v[v.length - 1 - i] = aux;

        }

        return v;
    }

    public static void ordena(int[] v){

        Arrays.sort(v);
    }

    public static String primero(String[] s){
        return s[0];
    }

    public static String ultimo(String[] s){
        return s[s.length -1];
    }
}

