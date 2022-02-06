import java.util.*;


public class onetoN{


public static void main(String [] args){
Scanner s = new Scanner(System.in);
int x = s.nextInt();

f(1,x);
}
public static void  f(int i,int x){
if(i > x){
return ;
}

System.out.print(i);

f(i+1,x);

}
}
