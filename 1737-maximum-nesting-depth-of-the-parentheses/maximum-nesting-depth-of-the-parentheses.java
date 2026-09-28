class Solution {
    public int maxDepth(String s) {
        int maxCount=0;
        int currentCount=0;
        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            if(ch =='(') {
                currentCount++;
                maxCount=Math.max(currentCount,maxCount);
            }
            else if(ch == ')') {
                currentCount--;
            }
        }
        return maxCount;
    }
}