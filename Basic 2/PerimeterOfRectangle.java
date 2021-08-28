package com.company;

import java.util.Scanner;

public class PerimeterOfRectangle {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            float length,breadth;
            double result;
            System.out.println("Enter length");
            length = input.nextFloat();
            System.out.println("Enter breadth");
            breadth = input.nextFloat();
            result  = 2*(length + breadth);
            System.out.println("Perimeter of rectangle " + result);

        }
    }

