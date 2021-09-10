package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

        }
        static void bubble(int[] arr){
        boolean flag = false;
        for (int i = 0 ; i< arr.length;i++){
            for(int j = 1;j< arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    flag = true;
                }
            }
            if(flag == false){
                break;
            }
        }

    }
}
