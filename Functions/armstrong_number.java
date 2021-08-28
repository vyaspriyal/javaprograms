package com.company;

import java.util.Scanner;

public class armstrong_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean result = checkArmstrong(number);
        System.out.println("number is armstrong: "+ result);
    }
    static boolean checkArmstrong(int number){
        int digit,sum = 0;
        int originalnumber = number;
        while(number > 0){
            digit = number%10;
            number = number/10;
            sum = sum + digit*digit*digit;

        }
       // System.out.println(sum);
        if(originalnumber == sum){
            return true;
        }
        return false;

    }
}
