import java.util.*;


public class recursion2{


public static void main(String [] args){
Scanner s = new Scanner(System.in);
int x = s.nextInt();
int count = 0;
name(count,x);
}
public static void  name(int count,int x){
if(count == x){
return ;
}

System.out.print("hello");
count++;
name(count,x);

}
}
