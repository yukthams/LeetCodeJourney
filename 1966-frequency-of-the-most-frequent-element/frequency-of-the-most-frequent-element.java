class Solution {
    public int maxFrequency(int[] nums, int k) {
        int n = nums.length;
        int l=0, maxFreq=0;
        long total=0;
        Arrays.sort(nums);
        

        for(int r=0;r<n;r++){
            total += nums[r]; // increase sum when expanded

            while((long)nums[r]*(r-l+1)-total>k){
                total -= nums[l];
                l++ ; //shrink
            }

            maxFreq = Math.max(maxFreq,r-l+1);
        }
        return maxFreq;        
    }
}