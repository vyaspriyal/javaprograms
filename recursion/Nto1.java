import java.util.*;


public class Nto1{


public static void main(String [] args){
Scanner s = new Scanner(System.in);
int x = s.nextInt();

f(x);
}
public static void  f(int x){
if(0 == x){
return ;
}

System.out.print(x);
x--;
f(x);

}
}
