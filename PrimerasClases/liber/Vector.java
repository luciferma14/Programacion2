package liber;

import java.util.Scanner;

public class Vector {
    public static int[] rellenaVectorInt(int numElem) {
        Scanner sc = new Scanner(System.in);
        int[] vecInt = new int[numElem];
        for (int i = 0; i < numElem; i++) {
            System.out.printf("Introduce el elemento %d:",i);
            vecInt[i]=sc.nextInt();
        }
        sc.close();
        return vecInt;
    }
}
