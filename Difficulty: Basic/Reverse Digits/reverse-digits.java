class Solution {
    public int reverseDigits(int n) {
        // Code here
        int rev=0;
        while(n>=1){
            rev=(rev*10)+(n%10);
            n=n/10;
        }
        return rev;
    }
}