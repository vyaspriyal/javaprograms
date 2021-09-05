package com.company;

import java.util.Scanner;

public class tcs2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c,max;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        max = a;
        if(max < b && b < c){
            max = b;
        }
        else if(max < b && b > c){
           if(a > c){
               max = a;
           }
           else{
               max = c;
           }

        }
        else if( max > b && max < c){
            max = a;
        }
        else{
            if( b > c){
                max = b;
            }
            else{
                max = c;
            }
        }

        System.out.println(max);

    }
}
