class Solution {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;
        int n=nums.length;
        // Step 1: move all non-zero elements to the front
        // from 0th position start putting non-zero elements
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[insertPos++] = nums[i];
            }
        }

        // Step 2: fill the rest with zeroes
        while (insertPos < n) {
            nums[insertPos++] = 0;
        }
    }
}