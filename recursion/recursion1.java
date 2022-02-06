import java.util.*;


public class recursion1{


    public static void main(String [] args){
        int count =0;
        f(count);
    }
    public static void f(int count){
        if(count>4){
            return;
        }

            System.out.print("hello");
            count++;
             f(count);

    }
}
