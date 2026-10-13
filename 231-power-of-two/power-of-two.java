class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<1) {
            return false;
        }
        if(n==1) {
            return true;
        }
        boolean result=false;
        long pow=1;
        while(2*pow<=n) {
            if(2*pow==n) {
                result=true;
                break;
            }
            pow=pow*2;
        }
        return result;
    }
}