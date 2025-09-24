class Solution {
    public void rotate(int[] arr, int k) {
        int n=arr.length;
        if(n==0) return;
        
        k=k%n;
        
        // step 1: last k elements to temp
        int[] temp = new int[k];
        
        for(int i=n-k; i<n; i++){
            temp[i-(n-k)]=arr[i];
        }
        
        //step 2: first n-k elements to forward by k steps
        for(int i=n-k-1;i>=0;i--){ // if i=0 to n-k-1 then it will get error for next elements
            arr[i+k]=arr[i];
        }
        
        //step 3: copy temp to array
        for(int i=0;i<k;i++){
            arr[i]=temp[i];
        }
    }
}