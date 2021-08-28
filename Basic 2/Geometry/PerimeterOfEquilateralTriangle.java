package com.company;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float side;
        double result;
        System.out.println("Enter side of triangle");
        side= input.nextFloat();

        result = 3*side;
        System.out.println("Perimeter of triangle is " + Math.round(result*1000.0)/1000.0);
        // rounding upto 2 digit
    }
}
