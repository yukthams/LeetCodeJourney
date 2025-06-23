class Solution {
    public boolean isPalindrome(int x) {  
        int n = x;
        int rev=0;

        while(n>0){
            //Here x is positive int so cannot exceed max or be negative    
            rev = rev*10 + n%10;
            n /= 10;
        }
            
        return x==rev;
    }
    
}