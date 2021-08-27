package com.company;
//3,8,6,11,9,14,12,17,15,20
import java.util.Scanner;

public class numberseries1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int result = 0;
        int eventerm = 0;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                result = 3;
                continue;
            }
            if (i == 2) {
                eventerm = 8;
                continue;
            }
            if (i % 2 == 0) {
                eventerm = eventerm + 3;
            } else {
                result = ((i + 1) / 2) * 3;
            }
        }
        if (n % 2 == 0) {
            System.out.println(eventerm);
        } else {


        System.out.println(result);
    }

    }

}
