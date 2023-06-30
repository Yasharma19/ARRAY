class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int output[]=new int[n];
        if(n==1){
            return output;
        }
        int Left[]=new int[n];
        int Right[]=new int[n];
        

        Left[0]=1;
        Right[n-1]=1;
        for(int i=1;i<n;i++)  {
            Left[i]=nums[i-1]*Left[i-1];
        }
      
        for(int i=n-2;i>=0;i--){
            Right[i]=nums[i+1]*Right[i+1];
        }

        for(int i=0;i<n;i++){
            output[i]=Right[i]*Left[i];
        }
        return output;

    }
}
