package com.company;

public class Floorofanumber {
    public static void main(String []args){
        int[] arr = {1,2,3,5,8,10,34,48,55,70,90};
        int target = 0;
        int ans = binarysearch(arr,target);
        System.out.println(ans);
    }
    static int  binarysearch(int[] arr,int target){
        int start = 0,end = arr.length - 1,mid;

if(arr[start]>target){
    return  -1;
}
        while (start<=end){
            mid = start + (end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
                continue;
            }
             if (arr[mid]<target){
                start = mid+ 1;
                continue;
            }
             if(arr[mid] == target){
                return arr[mid];

            }

        }
return  arr[end];
    }
}
