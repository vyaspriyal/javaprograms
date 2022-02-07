
import java.util.*;
public class palindrome{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        String str = "11211";
        boolean ans = f(str,0,str.length()-1,1);
        System.out.println(ans);
    }
    public static boolean f(String str,int i,int j,int flag){
        if(j<=i && flag == 1){
            return true;
        }
        if(j<=i && flag == 0){
            return false;
        }
        if(str.charAt(i) == str.charAt(j)){
            flag = 1;
            f(str,i+1,j-1,1);
            return  true;
        }
        else{
            flag = 0;
            return false;
        }

    }
}
