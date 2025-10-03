class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer> hmp = new HashMap<>();
        int num1,num2;

        for(int i=0;i<n;i++){
            num1=nums[i];
            num2=target-num1;
            if(hmp.containsKey(num2)){
                return new int[]{hmp.get(num2),i};
            }
            hmp.put(nums[i],i);
        }

        return new int[]{-1,-1};
    }
}