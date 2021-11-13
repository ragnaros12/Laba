package com.company;

import java.util.Scanner;

public class Two {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int max = Math.max(a,b);
        System.out.println(max);
        System.out.println(Math.cos(max));
    }
}
