package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Five {
    static int[] A = {4,2,1,4,5,3,6,43,1,4,5};
    static ArrayList<Integer> z = new ArrayList<>();
    public static void main(String[] args){
        for (int i = 0; i < A.length; i++){
            if(A[i] == 1){
                z.add(i);
            }
        }

        System.out.println(Arrays.toString(A));

        for (int i = z.get(z.size() - 2); i < z.get(z.size() - 1); i++){
            for (int j = z.get(z.size() - 2); j < i; j++) {
                if (A[j] > A[j + 1]) {
                    int tmp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(A));
    }
}
