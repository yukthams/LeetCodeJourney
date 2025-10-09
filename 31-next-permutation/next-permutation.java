class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i1=-1;
        //Loop to find breakpoint=i1
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                i1=i;
                break;
            }
        }
        
        //if array in decending order reverse whole array
        if (i1 == -1) {
            reverse(nums, 0, n - 1);
            return;
        }
        
        //Swap i1 and smallest element larger than i1 on right side of i1
        for(int i=n-1;i>i1;i--){
            if(nums[i]>nums[i1]){
                int temp=nums[i1];
                nums[i1]=nums[i];
                nums[i]=temp;
                break;
            }
        }
        //Reverse the subarray to the right of i1
        reverse(nums, i1+1, n-1);
    }

    // Method to reverse a subarray in-place
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}