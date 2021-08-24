package com.company;

import java.util.Scanner;

public class currencytodollor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter money value in rupees");
        float rupee = input.nextFloat();
        float dollar;
        dollar = rupee*0.013f;
        System.out.println(dollar);
    }
}
