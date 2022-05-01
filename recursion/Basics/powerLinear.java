 public class powerLinear {
    public static void main(String[] args) {
        int ans = powerLinear(2,6);
        System.out.println(ans);
    }
    public static int powerLinear(int x , int n){
        int ans;
        if(n == 0){
            return  1;
        }
        ans = x * powerLinear(x,n-1);
        return ans;

    }
}
