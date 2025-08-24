class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
            }
        }

        // check last element with first (rotation case)
        if (nums[n - 1] > nums[0]) {
            // if last element is bigger than first, it's another drop
            count++;
        }

        return count <= 1;
    }
}
