package com.company;
/*
start
* * * *
* * *
* *
*
end
*/
public class Pattern_2 {
    public static void main(String[] args) {
        pattern(4);
    }
    static  void pattern(int n){
        for (int i = 1;i <= n;i++){
            for(int j = n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
