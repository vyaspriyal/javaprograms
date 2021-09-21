package com.company;
/*
1
1 2
1 2 3
1 2 3 4
*/
public class Pattern_3 {
    public static void main(String[] args) {
        pattern(4);

    }
    static void pattern(int n){
        for(int i = 1; i <=n;i++){
            for(int j = 1;j <=i;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
