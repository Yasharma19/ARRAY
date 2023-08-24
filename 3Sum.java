class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length<3 || nums==null){
            return new ArrayList<>();
        }

        Arrays.sort(nums);  //Sorting Elements

        Set<List<Integer>> result=new HashSet<>();     //using set, as it helps us to store unique triplets

        //Now fix first element and find the other two animals
        for(int i=0;i<nums.length-2;i++){  //except last 2
            int left=i+1;
            int right=nums.length-1;

            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;

                }
                else if(sum<0){  //need large number, so go left++
                    left++;        
                }
                else{
                    right--;
                }
            }
        }
        return new ArrayList<>(result);
    }
}
