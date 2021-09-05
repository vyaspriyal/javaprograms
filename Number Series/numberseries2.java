package com.company;

import java.util.Scanner;

public class numberseries2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        number = input.nextInt();
        if(number % 2 == 0){
            System.out.println(number/2 -1);
        }
        else{
            System.out.println(number - 1);
        }
    }
}
// number series :- 0 0 2 1 4 2 6 3 8 4.......