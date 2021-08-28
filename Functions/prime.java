package com.company;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
    }

    static boolean isPrime(int n) {
        if(n <= 1){
            return  false;
        }
        for (int i = 2; (i * i) <= n; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return  true;

    }
}

