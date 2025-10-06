class Solution {
    public int maxProfit(int[] arr) {
        int n=arr.length;
        int minPri=Integer.MAX_VALUE;
        int maxPro = 0;
        for (int i = 0; i < n; i++) {
            minPri=Math.min(minPri,arr[i]);
            maxPro=Math.max(maxPro,arr[i]-minPri);
        }
        return maxPro;
    }
}