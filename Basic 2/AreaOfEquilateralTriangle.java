package com.company;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {

        public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float side;
        double result;
        System.out.println("Enter side of triangle");
        side= input.nextFloat();

        result = (Math.sqrt(3)*side*side)/4;
        System.out.println("Area of triangle is " + Math.round(result*1000.0)/1000.0);
        // rounding upto 2 digit
    }

}
