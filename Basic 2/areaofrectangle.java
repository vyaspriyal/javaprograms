package com.company;

import java.util.Scanner;

public class areaofrectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float length,breadth;
        double result;
        System.out.println("Enter length");
        length = input.nextFloat();
        System.out.println("Enter breadth");
        breadth = input.nextFloat();
        result  = length * breadth;
        System.out.println("Area of rectangle " + result);

    }
}
