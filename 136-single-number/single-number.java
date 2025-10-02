class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hmp = new HashMap<>();
        
        for(int i: nums){
            int val = hmp.getOrDefault(i,0);
            hmp.put(i,val+1);
        }
        
        for(Map.Entry<Integer,Integer> hSet: hmp.entrySet()){
            if(hSet.getValue()==1) return hSet.getKey();
        }
        
        return -1;
    }
}