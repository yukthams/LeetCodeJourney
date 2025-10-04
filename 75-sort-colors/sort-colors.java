class Solution {
    public void sortColors(int[] arr) {
        //Arrays.sort(nums); - Brute force
        int n=arr.length;
        int cnt0 = 0, cnt1 = 0, cnt2 = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) cnt0++;
            else if (arr[i] == 1) cnt1++;
            else cnt2++;
        }
         int cnt1_end=cnt0+cnt1;

        //Replace the places in the original array:
        for (int i = 0; i < cnt0; i++) arr[i]=0;                // replacing 0's

        for (int i = cnt0; i < cnt1_end; i++) arr[i]=1;       // replacing 1's

        for (int i = cnt1_end; i < n; i++) arr[i]=2;          // replacing 2's
    }
}