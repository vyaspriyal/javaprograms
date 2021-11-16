import java.util.*;
//without sorting
public class intersectofarray{

public static void main(String args[]){


int [] arr = {5,6,5,3,5,8,9,9,10,11};
int [] arr1 = {5,6,5,3,5,8,9,9,10,11,12};
int [] ans = intersect(arr,arr1);
System.out.println(Arrays.toString(ans));

}//end main


public static int[] intersect(int [] arr,int [] arr1)
{
Set <Integer> value1 = new HashSet<Integer>();

Set <Integer> value2 = new HashSet<Integer>();

for(int element :arr){
value1.add(element);

}//enf of for
for(int element :arr1){
value2.add(element);

}//enf of for
Object [] arr3 = value1.toArray(); 
int [] ans = new int[value1.size()];
int i = 0;
for(Object element : arr3){

if(value2.contains(element)){
ans[i] = (int)element;


}
i++;
}//enf of for


return ans;
}//function end
}//end of program 