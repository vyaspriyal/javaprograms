import java.io.*;
import java.util.*;

public class IncresingandDecresing{

    public static void main(String[] args) throws Exception {
        // write your code\ here
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        printIncresingandDecresing(x);
    }

    public static void  printIncresingandDecresing(int n){
        if(n == 0) {
            return;
        }
        System.out.println(n);

        printIncresingandDecresing(n-1);
        System.out.println(n);



    }

}
