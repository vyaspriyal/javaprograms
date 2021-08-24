package com.company;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        while(true)
        {
            int number = input.nextInt();
            if(number !=0){
                sum = sum + number;
            }
            else{
                break;
            }




        }
        System.out.println(sum);
    }
}
