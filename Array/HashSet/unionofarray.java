import java.util.*;
//Npte it return object type
public class unionofarray{

public static void main(String args[]){


int [] arr = {5,6,5,3,5,8,9,9,10,11};
int [] arr1 = {5,6,5,3,5,8,9,9,10,11,12};
Object [] ans = union(arr,arr1);
System.out.println(Arrays.toString(ans));

}//end main


public static Object[] union(int [] arr,int [] arr1)
{
Set <Integer> values = new HashSet<Integer>();

for(int element :arr){
values.add(element);

}//enf of for
for(int element :arr1){
values.add(element);

}//enf of for
int n = values.size();

return values.toArray();
}//function end
}//end of program 
