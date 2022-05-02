class lastIndex{
    public static void main(String[] args) {
        int [] arr = {80,3,8,7,8};
        int ans = lastIndex(arr,0,0);
        System.out.println(ans);
    }

    public static int lastIndex(int [] arr,int index,int n) {

if(arr.length - 1  == index){
    return index;
}
index = index +1;
 index =lastIndex(arr,index,n);
int x = arr[index];

        if(n == x) {
            int stored = index;
            return stored;
        } else {
            return - 1;
        }
   }
}
