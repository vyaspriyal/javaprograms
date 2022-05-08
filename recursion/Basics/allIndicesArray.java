package com.first;
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

public class allIndicesArray{

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int [] originalArray  = {2,3,6,9,8,6,2,3,6,6};
        int x = 6;
        int [] arr = find(originalArray,x,0,0);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] find(int [] originalArray,int x,int inx,int fsf){
        if(inx == originalArray.length){
            return new int[fsf];
        }
        if(originalArray[inx] == x){

            fsf = fsf+ 1;
        }





       int [] ans = find(originalArray, x, inx + 1, fsf);

       if(x == originalArray[inx]){

           ans[fsf-1] = inx;
           fsf = fsf - 1;
       }


        return ans;
    }
}
