package com.company;

public class Four {
    static int[] Array = {1,4,2,6,4,5};
    public static void main(String[] args){
        int count = 0;
        for (int i = 1; i < Array.length; i++){
            if(Array[i - 1] * 3 == Array[i])
                count++;
        }

        System.out.println(count);
    }
}
