import java.io.*;
import java.util.*;

public class decresing {

    public static void main(String[] args) throws Exception {
        // write your code\ here
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        printDecreasing(x);
    }

    public static void printDecreasing(int n){
        if(n == 0)
            return;
        System.out.println(n);
        printDecreasing(n-1);

    }

}
