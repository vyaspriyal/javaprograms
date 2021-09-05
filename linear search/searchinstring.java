package com.company;

import java.util.Scanner;

public class searchinstring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = "priyal";
        char target = 'p';
        boolean ans = find2(input,target);
        System.out.println(ans);
    }
//using for eachloop
    static boolean find2(String input,char target){
       for(char arr:input.toCharArray()){

           if(arr == target){
               return  true;
           }
       }
       return false;
    }
    // using for loop
    static boolean find(String input,char target){
        for(int i = 0 ; i < input.length();i++){
            if(input.charAt(i) == target){
                return true;
            }

        }
        return false;
    }
}
