class Solution {
    public int maxProfit(int[] arr) {
        int n=arr.length;
        int minPrice=Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            minPrice=Math.min(minPrice,arr[i]);
            maxProfit=Math.max(maxProfit,arr[i]-minPrice);
        }
        return maxProfit;
    }
}