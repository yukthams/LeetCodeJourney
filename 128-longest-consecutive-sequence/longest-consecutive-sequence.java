class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0){
            return 0;
        }
        int longest=1;
        
        HashSet<Integer> hset = new HashSet<>();
        for(int i=0;i<n;i++){
            hset.add(nums[i]);
        }
        
        for(int i:hset){
            //make sure i is staring element of sequense
            if(!hset.contains(i-1)){ 
                int cnt=1;
                int x=i;
                while(hset.contains(x+1)){
                    cnt+=1;
                    x=x+1;
                }
                longest=Math.max(longest,cnt);
            }
            
        }
        return longest;
    }
}