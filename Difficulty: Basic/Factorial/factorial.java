class Solution {
    int factorial(int n) {
        // code here
        int factorial=1;
        while(n>=1){
            factorial=factorial*n;
            n--;
        }
        return factorial;
    }
}
