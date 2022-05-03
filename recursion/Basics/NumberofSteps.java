class Solution {
     int count = 0;
    public int numberOfSteps(int num) {
       
        if(num == 0){
            return count;
        }
        if(num%2 == 0){
           count =  count+1;
           count =  numberOfSteps(num/2);
        }
        else{
          count =  count+1;
     count =    numberOfSteps(num-1);
        }
        return count;
        
    }
}
// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
