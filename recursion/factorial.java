import java.util.*;


public class factorial{


public static void main(String [] args){
Scanner s = new Scanner(System.in);
int x = s.nextInt();

int x1 = f(x);
System.out.print(x1);
}
public static int  f(int x){
if(x == 1){

return 1;
}
return x * f(x-1);


}
}
