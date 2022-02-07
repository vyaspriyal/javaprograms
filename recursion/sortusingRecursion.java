
import java.util.*;


public class sortusingRecursion{
public static void main(String [] args){
Scanner s = new Scanner(System.in);
int [] arr = {1,2,3,4};
f(arr,0,arr.length-1);
System.out.println(Arrays.toString(arr));
}
public static void f(int [] arr,int i,int j){
if(j<=i){
return;
}
int temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
f(arr,i+1,j-1);

}
}
