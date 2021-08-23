//package com.company;

import java.util.Scanner;

public class Even_Odd {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int number;
            number = input.nextInt();
            if(number%2 == 0){
                System.out.println("Number is Even");
            }
            else{
                System.out.println("Number is Odd");
            }
        }
    }
