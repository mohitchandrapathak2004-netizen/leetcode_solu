class Solution {
    public int lcm(int a, int b) {
        // code here
        int max=Math.max(a,b);
        int min=Math.min(a,b);
        for(int i=max;i<=(a*b);i++){
            if(i%a==0 && i%b==0){
                max =i;
                break;
            }
        }
        return max;
    }
}
    