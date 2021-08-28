package com.company;

import java.util.Scanner;

public class AreaofIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float height,base;
        double result;
        System.out.println("Enter height of triangle");
        height = input.nextFloat();
        System.out.println("enter base of triangle");
        base = input.nextFloat();
        result =  ((0.5)*height*base);
        System.out.println("Area of  Isosceles triangle is "+ result);

    }
}
