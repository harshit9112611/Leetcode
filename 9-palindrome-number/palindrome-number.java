class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int p=0;
        while(x!=0) {
            if(x<0) {
                 p=p*10+(10-(x%10));
            x/=10;
            }
            else {
            p=p*10+x%10;
            x/=10;
            }
        }
        if(p==n) {
            return true;
        }
        else{
            return false;
        }
    }
}