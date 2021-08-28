package com.company;

import java.util.Scanner;

public class Area_Of_Parallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float length,breadth;
        double result;
        System.out.println("Enter length");
        length = input.nextFloat();
        System.out.println("Enter breadth");
        breadth = input.nextFloat();
        result  = length * breadth;
        System.out.println("Area Of Parallelogram " + result);

    }
}
