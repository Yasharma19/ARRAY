// Contigously we have to find the sum elements and return maximum sum we get 

class Solution {
  
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxi=nums[0];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>maxi)
                maxi=sum;
          // here we change sum to 0 whenever it is less than 0, as its not usefull to get maxi
            if(sum<0)
                sum=0;    
        }
        return maxi;

    }
}
