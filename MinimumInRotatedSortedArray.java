//BEST SOLUTION USING PIVOT ELEMENT 
class Solution{
    public int findMin(int[] nums) {
        int n=nums.length;
        int i;          //Finding pivot element(Highest element);
        
        if(nums[0]<nums[n-1] || n==1){  //if length==0 or whether an array is in sorted manner
            return nums[0];
        }
        for(i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                break;
            }
            //Here i is the index of Largest element and just after it there is a smallest element so we return element at i+1 index
        }
        return nums[i+1];   
    }
}


.............................................................................................................................
//ANOTHER SOLUTION WHICH IS LESS EFFICIENT

class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        
        while(left<right){
            int mid=(left+right)/2;
            if(nums[mid]>nums[right]){
                left=mid+1;
            }
            else if(nums[mid]<nums[right]){
                right=mid;
            }
            else{
                return nums[right];
            }
        }
        
        return nums[left];    //If array is not sorted
    }
}
