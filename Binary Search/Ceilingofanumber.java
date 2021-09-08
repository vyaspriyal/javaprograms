package com.company;
// find the number which is greater than or equal to target in a sorted array.
public class Ceilingofanumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18,20};
        int target = 46;
        int ans = ceiling(arr,target);
        System.out.println(ans);
    }
    public static int ceiling(int[] arr,int target){
        int start = 0,end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]<target){
                start = mid + 1;
            }
             if(arr[mid]>target){
                end = mid;
            }
             if(start == end -1 && arr[end]>target){
                 if(target<arr[start]){
                     return arr[start];
                 }
                 else{
                     return arr[end];
                 }
            }

        }
        return -1;
    }
}
