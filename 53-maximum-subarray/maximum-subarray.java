class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum>maxSum) maxSum=sum;
            if(sum<0) sum=0;
        }
        //if(maxSum<0) maxSum=0; //empty sub array in case all elements are negative
        
        return maxSum;
    }
}