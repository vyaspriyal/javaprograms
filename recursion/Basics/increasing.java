import java.io.*;
import java.util.*;

public class increasing {

    public static void main(String[] args) throws Exception {
        // write your code\ here
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        printIncresing(x);
    }

    public static void printIncresing(int n){
        if(n == 0)
            return;
        printIncresing(n-1);
        System.out.println(n);


    }

}
