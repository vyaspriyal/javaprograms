import java.util.Arrays;

public class printArrayfrom0 {
    public static void main(String[] args) {
        int [] x = {1,2,3,4,5};
m1(x,0);


    }
    public static void m1(int [] arr,int index){

        if(index == arr.length){
            return ;
        }
        System.out.println(arr[index]);
       m1(arr,index+1);

    }
}
