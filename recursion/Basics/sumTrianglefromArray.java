import java.util.Arrays;

public class sumTrianglefromArray {
    public static void main(String[] args) {
        int [] x = {1,2,3,4,5};
       int [] arr  = m1(x);
        System.out.println(Arrays.toString(arr));

    }
    public static int [] m1(int [] arr){

        if(arr.length == 1){
            return arr;
        }
       int [] arr1 = new int [arr.length - 1];
        for(int i = 0; i < arr1.length;i++){
            arr1[i] = arr[i]+arr[i+1];
        }
        int [] x1 = m1(arr1);
        System.out.println(Arrays.toString(arr1));


return arr;
    }
}
//question:- https://www.geeksforgeeks.org/sum-triangle-from-array/

/*
Input : A = {1, 2, 3, 4, 5}
Output : [48]
         [20, 28] 
         [8, 12, 16] 
         [3, 5, 7, 9] 
         [1, 2, 3, 4, 5] 
*/
