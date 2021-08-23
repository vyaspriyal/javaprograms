//package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        double result,interest;
        int principal,time;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Principal,interest,time");
        principal = input.nextInt();
        interest = input.nextInt();
        time = input.nextInt();
        result = (principal*interest*time)/100;
        System.out.println("Simple Interest is " + result);
    }
}
