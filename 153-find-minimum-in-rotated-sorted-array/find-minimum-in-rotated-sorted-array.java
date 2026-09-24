class Solution {
    public int findMin(int[] nums) {
        int pivot=findPivot(nums);
        return nums[pivot+1];
    }

    public int findPivot(int[] nums) {
        int pivot=-1;
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i+1]<nums[i]) {
                pivot=i;
            }
        }
        return pivot;
    }
}