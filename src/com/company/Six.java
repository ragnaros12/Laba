package com.company;

import java.util.Arrays;
import java.util.Random;

public class Six {
    static int[][] Array = new int[3][3];
    static Random random = new Random();
    public static void main(String[] args){
        for (int i = 0; i < Array.length; i++){
            for (int i1 = 0; i1 < Array[i].length; i1++){
                Array[i][i1] = -5 + random.nextInt(10);
            }
            System.out.println(Arrays.toString(Array[i]));
        }

        for (int i = 0; i < Array.length; i++){
            int minid = 0;
            for (int i1 = 1; i1 < Array[i].length; i1++){
                if(Array[i][i1] < Array[i][minid]){
                    minid = i1;
                }
            }
            minid = Array[i][minid];

            for (int i1 = 0; i1 < Array[i].length; i1++){
                Array[i][i1] *= minid;
            }
        }

        for (int[] Arr : Array) {
            System.out.println(Arrays.toString(Arr));
        }
    }
}
