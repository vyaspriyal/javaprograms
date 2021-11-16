import java.util.*;
//without sorting
public class secondHighestElement{
public static void main(String args[]){

int [] arr = {4,33,90,200,200,78};
int ans = search(arr);
System.out.println(ans);



}//main function ends
public static int search(int [] arr){
if(arr.length == 1 || arr.length == 0){
return -1;
}
int highest = Integer.MIN_VALUE;
int secondHighest = Integer.MIN_VALUE;
for(int i = 0; i<arr.length;i++){
if(arr[i]>highest){
secondHighest = highest;
highest = arr[i];

}//end if 
else if(arr[i]>secondHighest && arr[i] != highest){
secondHighest = highest;
highest = arr[i];

}//end else if 

else{
continue;
}

}//end of for
return secondHighest;
}//function ends
}//program ends 
