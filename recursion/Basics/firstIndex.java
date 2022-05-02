class firstIndex{
    public static void main(String[] args) {
        int [] arr = {8,3,8,7,6,4,12,7,3,8};
        int ans = firstIndex(arr,0,8);
        System.out.println(ans);
    }

    public static int firstIndex(int [] arr,int index,int n) {

if(arr[index] == n){
    return index;
}
if(index == arr.length-1){
    return -1;
}
index = index+1;
return firstIndex(arr,index,n);


    }


}
