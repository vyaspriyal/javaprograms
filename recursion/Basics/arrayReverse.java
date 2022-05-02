import java.util.Arrays;

public class arrayReverse{
    public static void main(String[] args) {
        int [] x = {1,2,3,4,5};
arrayReverse(x,0);


    }
    public static void arrayReverse(int [] arr,int index){

        if(index == arr.length){
            return ;
        }

        arrayReverse(arr,index+1);
        System.out.println(arr[index]);



    }
}
