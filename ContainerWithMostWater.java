class Solution {
    //by using 2 pointer technique
    //We have to find area at each step and store it in Max and update if get any Large area further and parallely move the pointer whose height is lesser.

    public int maxArea(int[] height) {
        int left=0;
        int Max=Integer.MIN_VALUE;
        int right=height.length-1;
        while(left<right){
            int a=right-left;
            if(height[left]<height[right]){
                int area=a*height[left];
                Max=Math.max(Max,area);
                left++;
            }
            else{
                int area=a*height[right];
                Max=Math.max(Max,area);
                right--;
            }
        }
        return Max;
    }
}


...................................................................................................................................................................

//ANOTHER SOLUTION

class Solution {
    //by using 2 pointer technique
    //We have to find area at each step and store it in Max and update if get any Large area further and parallely move the pointer whose height is lesser.

    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int Max=0;
        while(i<j){
            int lh=height[i];
            int rh=height[j];
            int minn=Math.min(lh,rh);
            Max=Math.max(Max,minn*(j-i));
            if(lh<rh){
                i++;
            }
            else{
                
            j--;

            }
        }
        return Max;
    }
}


