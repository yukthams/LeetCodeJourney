class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hmp=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int val=hmp.getOrDefault(nums[i],0)+1;
            hmp.put(nums[i],val);
            if(val>n/2){
                return nums[i];
            }
        }
        return 0;
    }
}