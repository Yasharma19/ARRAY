class Solution {
    public int trap(int[] height){
        int n=height.length;
        //Water = min(leftmax,rightmax) - height[i]
        int leftMax[]=new int[n];
        leftMax[0]=height[0];      //First
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
         
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];     //Last
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }

        int trappedWater=0;
        for(int i=0;i<n;i++){
            trappedWater+=Math.min(leftMax[i],rightMax[i]) - height[i];
        }
        return trappedWater;
    }
}
