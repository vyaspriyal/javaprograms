package com.company;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,result = 1;
        number = input.nextInt();
        for(int i = 1;i<=number;i++){
            result = result*i;
        }
        System.out.println("Factorial of number " + number +" is "+result);


    }
}
