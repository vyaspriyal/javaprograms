import java.util.*;
//without sorting
public class countDistinctElemnet{

public static void main(String args[]){


int []arr = {5,6,5,3,5,8,9,9,10,11};
int ans = distinctelement(arr);
System.out.println(ans);

}//end main


public static int distinctelement(int [] arr)
{
Set <Integer> values = new HashSet<>();

for(int element :arr){
values.add(element);

}//enf of for
return values.size();
}//function end
}//end of 
