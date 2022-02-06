import java.util.*;


public class sumofN2{


public static void main(String [] args){
Scanner s = new Scanner(System.in);
int x = s.nextInt();

int x1 = f(x);
System.out.print(x1);
}
public static int  f(int x){
if(x == 0){

return 0;
}
return x + f(x-1);


}
}
