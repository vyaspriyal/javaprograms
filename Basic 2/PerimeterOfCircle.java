package com.company;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float radius;
        double result;
        System.out.println("Enter radius");
        radius = input.nextFloat();

        result  = 2*3.14*radius;
        System.out.println("Perimeter of Circle " + Math.round(result*1000.0)/1000.0);

    }
}
