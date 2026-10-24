class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list =new ArrayList<>();
        int x=1<<nums.length;
        for(int i=0;i<x;i++) {
            List<Integer> list2=new ArrayList<>();
            for(int j=0;j<nums.length;j++) {
                if((i&(1<<j))!=0) {
                    list2.add(nums[j]);
                }
            }
            list.add(list2);
        }
        return list;
    }
}