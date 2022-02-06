import java.util.*;


public class sumofN1{


public static void main(String [] args){
Scanner s = new Scanner(System.in);
int x = s.nextInt();

f(x,0);
}
public static void  f(int x,int x1){
if(x<1){
System.out.print(x1);
return ;
}



f(x-1,x1+x);


}
}
