package com.company;

import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(a * b > 40){
            System.out.println(3 * Math.tan(a) + " " + Math.sin(b));
        }
        else{
            System.out.println(b * 4);
        }
    }
}
