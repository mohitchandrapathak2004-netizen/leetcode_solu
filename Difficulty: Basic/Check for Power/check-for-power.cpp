class Solution {
  public:
    bool isPower(int x, int y) {
        // code here
        if(y==1){
            return true;
        }
        if(x==1){
            return false;
        }
        if(y<x||y%x != 0) {
           return false;
        }
        return isPower(x,(y/x));
    }
};