class Solution {
    /* my solution
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return n;
    }
    */

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int nSum = n*(n+1)/2;
        int arrSum=0;
        for(int i:nums){
            arrSum+=i;
        }
        int missingNum = nSum-arrSum;
        return missingNum;
    }
}