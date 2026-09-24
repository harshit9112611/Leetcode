class Solution {
    public boolean search(int[] nums, int k) {
        boolean ans=false;
      int pivot= findPivot(nums);
      if(pivot==-1) {
        return binarySearch(nums,k,0,nums.length-1);
      }
      else {
        boolean firstHalf=binarySearch(nums,k,0,pivot);
        ans=firstHalf;
        if(!firstHalf) {
            return binarySearch(nums,k,pivot+1,nums.length-1);
        }
        return ans;
      }

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

    public boolean binarySearch(int[] nums,int k,int low,int high) {
        while(low<=high) {
            int mid=low+(high-low)/2;
            if(k==nums[mid]) {
                return true;
            }
            else if(k<nums[mid]) {
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return false;
    }
}