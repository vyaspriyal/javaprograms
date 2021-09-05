package com.company;

import java.util.Arrays;
import java.util.Scanner;

/*
An autobiographical number is a number such that the first digit of it counts how many zeroes are there in it, the second digit counts how many ones are there and so on.
For example, 1210 has 1 zero, 2 ones, 1 two and 0 threes
 */
public class tcs3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);{
            int[] numberarray = new int[10];
            String number = input.next();
            String[] arrOfStr = number.split("");
            //System.out.println(arrOfStr[0]);
           for(int i = 0 ; i < arrOfStr.length;i++){
                if(arrOfStr[i] .equals( "0")){
     numberarray[0] = numberarray[0] + 1;
 }
              else if(arrOfStr[i].equals("1")){
                   numberarray[1] = numberarray[1] + 1;
               }
                else if(arrOfStr[i].equals("2")){
                    numberarray[2] = numberarray[2] + 1;
                }
                else if(arrOfStr[i].equals("3")){
                    numberarray[3] = numberarray[3] + 1;
                }
                else if(arrOfStr[i].equals("4")){
                    numberarray[4] = numberarray[4] + 1;
                }
                else if(arrOfStr[i].equals("5")){
                    numberarray[5] = numberarray[5] + 1;
                }
                else if(arrOfStr[i].equals("6")){
                    numberarray[6] = numberarray[6] + 1;
                }
                else if(arrOfStr[i].equals("7")){
                    numberarray[7] = numberarray[7] + 1;
                }
                else if(arrOfStr[i].equals("8")){
                    numberarray[8] = numberarray[8] + 1;
                }
                else{
                    numberarray[9] = numberarray[9] + 1;
                }


           }
           int flag = 0;
           for(int i = 0; i <arrOfStr.length;i++){
               if(numberarray[i] ==  Integer. parseInt(arrOfStr[i])){
                   flag = 1;
                   continue;
               }
               else{
                   flag = 0;
                   break;
               }
           }
           if(flag == 1)
            System.out.println("autobiographical number ");
           else{
               System.out.println("not an autobiographical number ");
           }
        }
    }
}
// numbers:- 62100010005.2020