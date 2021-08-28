package com.company;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float diagonal1,diagonal2;
        double result;
        System.out.println("Enter diagonal1");
        diagonal1 = input.nextFloat();
        System.out.println("Enter diagonal2");
        diagonal2 = input.nextFloat();
        result  = (0.5)*diagonal1 * diagonal2;
        System.out.println("Area of rectangle " + result);

    }
}
