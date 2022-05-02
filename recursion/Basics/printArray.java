import java.util.Arrays;

public class printArray {
    public static void main(String[] args) {
        int [] x = {1,2,3,4,5};
m1(x,x.length-1);


    }
    public static void m1(int [] arr,int index){

        if(index <0){
            return ;
        }
        m1(arr,index-1);
        System.out.println(arr[index]);
    }
}
