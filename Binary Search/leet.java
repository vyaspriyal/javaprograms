package com.company;

public class leet {

        public static void main(String[] args) {
            char[] letters = {'c','f','j'};
            char target = 'j';
            char ans = search(letters,target);
            System.out.println(ans);
        }

        static char search(char[] letters,char target){
            int start = 0,end = letters.length - 1;
            if(letters[letters.length -1]<=target){
                return letters[0];
            }
            while(start<=end){
                int mid = start + (end - start)/2;
                if(letters[mid]>target){
                    end = mid - 1;

                }
                else{
                    start = mid + 1;

                }

            }
            return letters[start];
        }
    }

