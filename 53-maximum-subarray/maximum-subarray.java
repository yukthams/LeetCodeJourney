class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int maxSum=nums[0];
        int sum=0;
        
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum>maxSum) maxSum=sum;
            if(sum<0) sum=0;
        }
        
        return maxSum;
    }
}