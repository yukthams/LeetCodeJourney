class Solution {
    public int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;
        int j=1;
        int n = arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){// because it is sorted
                arr[j]=arr[i]; 
                j++;   
            }
        }
        return j;
    }
}