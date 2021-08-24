package com.company;

import java.util.Scanner;

public class largest_number_until_user_press_0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = 0;
        while(true)
        {
            int number = input.nextInt();
            if(number >max){
                max = number;
            }
            if(number == 0){
                break;
            }





        }
        System.out.println(max);
    }
}
