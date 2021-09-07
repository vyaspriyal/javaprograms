package com.company;

import java.util.Scanner;

public class searchinrange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 9};
        int target,start,end;
        target = 5;
        start = 2;
        end  = 6;
        int ans = check(arr,target,start,end);
        System.out.println("index starting from 0 :"+ ans);
    }
    public static int check(int[] arr,int target,int start,int end){
        for(int index = start;start<=end;index++){
            if(arr[index] == target){
                return  index;
            }

        }
        return -1;

    }
}
