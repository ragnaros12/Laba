package com.company;

import java.util.Arrays;
import java.util.Random;

public class Seven {
    static int[][] Array = new int[5][5];
    static Random random = new Random();
    static final int Eq = 1;
    public static void main(String[] args) {
        for (int i = 0; i < Array.length; i++){
            for (int i1 = 0; i1 < Array[i].length; i1++){
                Array[i][i1] =  random.nextInt(5);
            }
            System.out.println(Arrays.toString(Array[i]));
        }

        int count = 0;
        for (int i = 0; i < Array.length / 2; i++){
            for (int i1 = i; i1 < Array[i].length - i - 1; i1++){
                if(Array[i][i1] == Eq) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
