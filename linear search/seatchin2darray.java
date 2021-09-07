package com.company;

import java.util.Arrays;

public class seatchin2darray {
    public static void main(String[] args) {
        int[][] arr= {{1,2,3},{4,5,6}};
        int target = 3;
        int [] ans = check(arr,target);
        System.out.println(Arrays.toString(ans));
    }
  static int[] check(int[][] arr , int target){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0 ;j < arr[i].length;j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }

            }

        }
        return new int[]{-1,-1};
    }
}
