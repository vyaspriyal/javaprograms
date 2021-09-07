package com.company;

import javax.swing.*;

public class OrderAgnostiBinarySearch {
    public static void main(String[] args) {
        //int[] arr = {-1,-2,1,2,34,68,78,83,89,90}; //check asc
        int[] arr = {90,70,50,30,10,6,4,3,2,-5,-8};  // desc
        int ans,target;
        target = -5;
        ans = orderagnostibinarysearch(arr,target);
        System.out.println(ans);

    }
    public static int orderagnostibinarysearch(int[] arr,int target) {
        int start = 0, end, mid;
        end = arr.length - 1;
        boolean check = arr[start] < arr[end];
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (check) {
                if (arr[mid] > target) {
                    //left
                    end = mid - 1;

                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] < target) {
                    //left
                    end = mid - 1;

                } else {
                    start = mid + 1;
                }

            }

        }
        return -1;

    }


}
