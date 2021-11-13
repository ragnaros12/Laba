package com.company;

public class Three {
    public static void main(String[] args){
        int x = 0;

        if(x <= 0){
            System.out.println("y = " + (1 - Math.pow(x, 5) + Math.tan(8 * x)));
            System.out.println("f = " + (Math.pow(Math.E, 2 * x + 1)));
        }
        else if(x > 0 && x < 3){
            System.out.println("y = " + (1 + Math.pow(3,x)));
            System.out.println("f = " + (Math.pow(x,2) - Math.sin(4 * x)));
        }
        else{
            System.out.println("y = " + (Math.atan(2 * x + 1)));
            System.out.println("f = " + (Math.pow(Math.pow(x,2), 0.2f)));
        }
    }
}
