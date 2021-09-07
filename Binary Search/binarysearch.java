package com.company;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr = {-1,-2,1,2,34,68,78,83,89,90};
        int ans,target;
        target = 2;
        ans = binarysearch(arr,target);
        System.out.println(ans);
    }
    public static int binarysearch(int[] arr,int target){
        int start = 0,end,mid;
        end = arr.length-1;

        while (start<=end){
            mid = start + (end - start)/2;
            if(arr[mid] > target){
                //left
                end = mid-1;

            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
