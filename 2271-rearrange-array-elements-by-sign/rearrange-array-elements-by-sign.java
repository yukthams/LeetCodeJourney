class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int pos=0, neg=1;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                 ans[pos]=nums[i];
                 pos+=2;
            } else{
                ans[neg]=nums[i];
                neg+=2;
            }
        }
        return ans;

        /* // pos!=neg
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                pos.add(nums[i]);
            } else{
                neg.add(nums[i]);
            }
        }
        
        if(pos.size()>neg.size()){
            for(int i=0;i<neg.size();i++){
                nums[i*2]=pos.get(i);
                nums[(i*2)+1]=neg.get(i);
            }
            int indx=2*neg.size();
            for(int i=neg.size();i<pos.size();i++){
                nums[indx]=pos.get(i);
                indx++;
            }
        } else{
            for(int i=0;i<pos.size();i++){
                nums[i*2]=pos.get(i);
                nums[i*2+1]=neg.get(i);
            }
            int indx=2*pos.size();
            for(int i=pos.size();i<neg.size();i++){
                nums[indx]=neg.get(i);
                indx++;
            }
        }
        
        return nums;
        */
    } 
}