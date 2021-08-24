package com.company;

import java.util.Scanner;

public class areaofcircle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        float radius = input.nextFloat();
        double result;
        result = 3.14*radius*radius;
        System.out.println("Areaa if circlr is " + radius);
    }
}
