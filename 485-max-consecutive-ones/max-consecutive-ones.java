class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0, max_count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0) count=0;
            else count++;
            if(count>max_count) max_count=count;
        }
        return max_count;
    }
}