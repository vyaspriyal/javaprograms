public class powerLog {
    public static void main(String[] args) {
        int ans = powerLog(2,5);
        System.out.println(ans);
    }
    public static int powerLog(int x , int n){
        int ans;
        if(n == 0){
            return  1;
        }
int result = powerLog(x,n/2);
        ans = result * result;
        if(n%2 == 1){
            ans = ans *x;
        }
        return ans;

    }
}
