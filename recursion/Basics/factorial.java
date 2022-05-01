public class factorial {
    public static void main(String[] args) {
        int ans = factorial(8);
        System.out.println(ans);
    }
    public static int factorial(int x){
        int ans;
        if(x == 1){
            return 1;
        }
        ans = x*factorial(x-1);
        return ans;
    }
}
