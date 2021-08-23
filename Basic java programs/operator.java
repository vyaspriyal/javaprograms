package com.company;


import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char operator;
        int number1, number2;
        double result;
        System.out.println("Enter 2 number and an operator");
        number1 = input.nextInt();
        number2 = input.nextInt();
        operator = input.next().trim().charAt(0);
        if (operator == '+') {
            result = number1 + number2;
            System.out.println(result);
        } else if (operator == '-') {
            result = number1 - number2;
            System.out.println(result);
        } else if (operator == '*') {
            result = number1 * number2;
            System.out.println(result);
        } else if (operator == '/') {
            if (number2 == 0) {
                System.out.println("Division by 0 is not allowed");
            } else {
                result = number1 / number2;
                System.out.println(result);


            }
        }
            else{
                System.out.println("Invalid operator!!!");
            }


        }
    }

